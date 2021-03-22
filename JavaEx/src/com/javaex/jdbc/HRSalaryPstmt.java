package com.javaex.jdbc;

import java.sql.*;
import java.util.Scanner;

public class HRSalaryPstmt {

	public static void main(String[] args) {
		//사용자로부터 최소 급여와 최대 급여를 입력 받아 급여가 이 범위 내에 속하는 사원의 정보를 출력하는 프로그램을 작성해 봅시다
		//급여가 이 범위 내에 속하는 사원의 정보를 출력하는 프로그램을 작성
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("최소급여 : ");
		int minSalary = scanner.nextInt();
		System.out.println("최대급여 : ");
		int maxSalary = scanner.nextInt();
		
		if(minSalary > maxSalary) {
			//두 값을 Swap
			int temp = minSalary;
			minSalary = maxSalary;
			maxSalary = temp;
		}
		scanner.close();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			String sql = "SELECT first_name, last_name, salary" + 
						"FROM employees WHERE salary BETWEEN ? AND ?" +
						"ORDER BY salary";
			pstmt = conn.prepareStatement(sql);
			//동작 데이터 연결
			pstmt.setInt(1, minSalary);
			pstmt.setInt(2, maxSalary);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s %s, %d%n", 
						rs.getString("first_name"), rs.getString("last_name"),
						rs.getInt("salary"));//3으로도 가능
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
