package com.javaex.jdbc;
import java.sql.*; //sql ��Ű�� ���� ��� Ŭ���� ����Ʈ
public class ConnectionTest {
	private static String DBURL = "jdbc : oracle:thin:@localhost:1521:xe";
	private static String DBUSER = "hr"; // ���� ����
	private static String DBPASS = "hr"; // ���� ��й�ȣ
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			//����̹� �ε�
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			//Ŀ�ؼ� Ȯ��
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
			System.out.println("���� ���� : " + conn);
			System.out.println("���� ����!");
			
		}catch(ClassNotFoundException e) {
			System.err.println("����̹� �ε� ����");
		}catch(SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		}finally {
			
			try {
				conn.close();//���Ӵݱ�
			}catch(Exception e) {
			e.printStackTrace();
			}
		}
	}
}