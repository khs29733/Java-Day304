package com.javaex.jdbc;

import java.sql.*;
import java.util.Scanner;

public class HRSalaryPstmt {

	public static void main(String[] args) {
		//����ڷκ��� �ּ� �޿��� �ִ� �޿��� �Է� �޾� �޿��� �� ���� ���� ���ϴ� ����� ������ ����ϴ� ���α׷��� �ۼ��� ���ô�
		//�޿��� �� ���� ���� ���ϴ� ����� ������ ����ϴ� ���α׷��� �ۼ�
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ּұ޿� : ");
		int minSalary = scanner.nextInt();
		System.out.println("�ִ�޿� : ");
		int maxSalary = scanner.nextInt();
		
		if(minSalary > maxSalary) {
			//�� ���� Swap
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
			//���� ������ ����
			pstmt.setInt(1, minSalary);
			pstmt.setInt(2, maxSalary);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s %s, %d%n", 
						rs.getString("first_name"), rs.getString("last_name"),
						rs.getInt("salary"));//3���ε� ����
			}
					
		}catch(ClassNotFoundException e) {
			System.err.println("����̹� �ε� ����");
			
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
