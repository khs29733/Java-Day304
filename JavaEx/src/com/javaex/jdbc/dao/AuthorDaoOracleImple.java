package com.javaex.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorDaoOracleImple implements AuthorDao {
	//���� �ڵ��� ���� �ڵ� ������ �и��սô�.
	private Connection getConnection() throws SQLException{
		Connection conn = null;
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin@localhost:1521:xe";
			conn = DriverManager.getConnection(dburl,"C##HEE", "1234");
		}catch(ClassNotFoundException e) {
			System.err.println("����̹� �ε� ����!");
		}
		return conn;
	}
	@Override
	public List<AuthorVo> getList() {
		// �ڹ� ��ü�� �̿� �ְ�ޱ� : SQL RS -> Java ��ü�� ��ȯ
		List<AuthorVo> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet  rs = null;
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT id, name, bio FROM author";
			rs = stmt.executeQuery(sql);
			
			//������ ���鼭 �ڹ� ��ü�� ��ȯ
			while(rs.next()) {
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				String bio = rs.getString("bio");
				
				//VO��ü ����
				AuthorVo vo = new AuthorVo(id, name, bio);
				list.add(vo);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<AuthorVo> search(String keyword) {
		List<AuthorVo> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
				rs = pstmt.executeQuery();
				
				try {
					conn = getConnection();
					String sql = "SELECT id, bio FROM author WHERE name LIKE ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1,"%" + keyword + "%");
					
					
					while(rs.next()) {
						AuthorVo vo = new AuthorVo();
						vo.setId(rs.getLong(1));
						vo.setName(rs.getString(2));
						vo.setBio(rs.getString(3));
						
						list.add(vo);
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						rs.close();
						stmt.close();
						conn.close();
						
					}catch
				}
		return list;
	}

	@Override
	public AuthorVo get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(AuthorVo vo) {
		// �Ű����� vo�� ���޹޾Ƽ� author ���̺� insert
		//INSERT, UPDATE, DELETE ����� executeUpdate�޼��� -> ��� int(���� ���� ���ڵ� ��)
		Connection conn = null;
		String sql = "INSERT INTO author VALUES(seq_author.NEXTVAL, ?,?)";//�����ȹ
		int insertedCount = 0;
		
		try {
		conn = getConnection();	
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//�Ķ���� ����
		pstmt.setString(1, vo.getName());
		pstmt.setString(2, vo.getBio());
		
		insertedCount = pstmt.executeUpdate();
	}catch(SQLException e) {
		e.printStackTrace();
	}
		return insertedCount == 1;//INSERT ������ ���� ����
	}
	@Override
	public boolean update(AuthorVo vo) {
		// VO ��ü ���� name, bio�ʵ带 ��ü
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updateCount = 0;
		
		try {
			conn = getConnection();
			String sql = "UPDATE author SET name= ?, bio = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getName());
			pstmt.setString(2,  vo.getBio());
			
			updateCount = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return updatedCount == 1;
	}

	@Override
	public boolean delete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELTE FROM author WHERE id = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setLong(1, id);
			deletedCount = pstmt.executeUpdate();
		}catch(SQLException e) {
		
			e.printStackTrace();
		}
		
		return deletedCount == 1;
	}

}
