package com.javaex.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HRSearchEmployeesPsmt {
//클래스 Scanner를 사용하여 사원 이름을 입력 받아 사원 정보를 검색(부분검색)하는 프로그램을 작성해 봅시다
	//preparedStatement를 이용한 실행 계획의 준비
	public static void main(String[] args) {
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			System.out.println("검색어 : ");
			String Keyword = scanner.next();
			
			//SQL
//			String sql = "SELECT first_name, last_name," +
//						"email, phone_number, hire_date" +
//						"FROM employees" + 
//						"WHERE lower(first_name) LIKE '%" + Keyword + "%' OR " +
//						"lower(last_name) LIKE '%" + Keyword + "%'";
//			//보안상 위험, 가독성이 떨어짐
//			System.out.println("QUERY : " + sql);
//			
//			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
			//동적으로 데이터 연결할 공간을 ? 로 비워둔다
			String sql = "SELECT first_name, last_name, "+
						"email, phone_number, hire_date FROM employees"+
						"WHERE lower(first_name) LIKE ? OR lower(last_name) LIKE ?";
			pstmt = conn.prepareStatement(sql); //실행 계획을 준비해둔다
			//동적 파라미터 설정
			pstmt.setString(1, "%" + Keyword + "%");
			pstmt.setString(2, "%" + Keyword + "%");
			
			//쿼리수행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s %s: %s, %s, %s%n",
									rs.getString(1), rs.getString(2),
									rs.getString(2),
									rs.getString("phone_number"),
									rs.getString("hire_date"));
			}
		}catch(ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
