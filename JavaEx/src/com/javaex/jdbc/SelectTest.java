package com.javaex.jdbc;
import java.sql.*;
public class SelectTest {
	
	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;	//SQL ������ ���� ���� ����
		ResultSet rs = null; 	//SELECT�� ���� ����� ����
		
		try {
			//����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			stmt = conn.createStatement();
			//���� �� ���� �غ�
			String sql = "SELECT department_id, department_name" + 
							"FROM departments";
			//���� ���� : SELECT -> executeQuery�� ���� ->  ResultSet�� �޾ƿ´�
			rs = stmt.executeQuery(sql);
			
			//���ڵ� ���
			while(rs.next()) {			
				int deptId = rs.getInt(1); //�÷��� ������ 1����
				String deptName = rs.getString("department_name");	//�÷��� �̸����� ���� ����
			
				System.out.printf("%d:%s%n", deptId, deptName);
			}
		}catch(ClassNotFoundException e) {
			System.err.println("����̹� �ε� ����!");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
