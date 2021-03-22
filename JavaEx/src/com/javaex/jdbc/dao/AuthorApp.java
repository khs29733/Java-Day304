package com.javaex.jdbc.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AuthorApp {
	public static void main(String[] args) {
//		ListAuthors();
//		insertAuthor();
//		deleteAuthor();
//		insertAuthor();
	}
	
	private static void ListAuthors() {
		AuthorDao dao = new AuthorDaoOracleImple();
		List<AuthorVo> list = dao.getList();
		//Iterator(�ݺ���) ����
		Iterator<AuthorVo> it = list.iterator();
		
		
		while(it.hasNext()) {//������ �� ������
			AuthorVo vo = it.next();//���� �ҷ�����
			System.out.printf("%d, %s, %s%n", vo.getId(), vo.getName(), vo.getBio());
		}
	}
	private static void insertAuthor() {
		//Scanner�� �̸�, bio ������ �Է¹޾� *-> Dao���� INSERT
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸� : ");
		String name = scanner.next();
		System.out.println("���");
		String bio = scanner.next();
		
		AuthorVo vo = new AuthorVo(name, bio);
		
		AuthorDao dao = new AuthorDaoOracleImple();
		boolean success = dao.insert(vo);
		
		System.out.println("Author INSERT : " + (success ? "����" : "����"));
		scanner.close();
		
	}
	private static void deleteAuthor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �� �۰� : ");
		long authorId = scanner.nextLong();
		
		AuthorDao dao = new AuthorDaoOracleImple();
		boolean success = dao.delete(authorId);
		
		System.out.println("Author INSERT : " + (success ? "����" : "����"));
		scanner.close();
	
	
	}
	private static void updateAuthor() {
		//�۰� pkȮ��
		//������Ʈ ���� : name, bio 
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Ʈ �� �۰�");
		long authorId = scanner.nextLong();
		System.out.print("������ �̸�");
		String name = scanner.next();
		System.out.print("������ �̷�");
		String bio = scanner.next();
		
		AuthorVo vo = new AuthorVo(authorId, name, bio);
		AuthorDao aod = new AuthorDaoOracleImple();
		
		boolean success = dao.update(vo);
		
		System.out.println("Author UPDEATE : " + (success ? "����" : "����"));
		scanner.close();
		
		
	}
	private static void searchAuthors() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�˻��� : ");
		String keyword = scanner.next();
		
		AuthorDao dao = new AuthorDaoOracleImple();
		List<AuthorVo> list = dao.search(keyword);
		
		Iterator<AuthorVo> it = list.iterator();
		
		while(it.hasNext()) {
			AuthorVo vo = it.next();
			System.out.println(vo);
		}
		scanner.close();
	}
}
