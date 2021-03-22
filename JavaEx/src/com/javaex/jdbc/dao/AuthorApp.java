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
		//Iterator(반복자) 추출
		Iterator<AuthorVo> it = list.iterator();
		
		
		while(it.hasNext()) {//내용이 더 있으면
			AuthorVo vo = it.next();//내용 불러오기
			System.out.printf("%d, %s, %s%n", vo.getId(), vo.getName(), vo.getBio());
		}
	}
	private static void insertAuthor() {
		//Scanner로 이름, bio 정보를 입력받아 *-> Dao에서 INSERT
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = scanner.next();
		System.out.println("경력");
		String bio = scanner.next();
		
		AuthorVo vo = new AuthorVo(name, bio);
		
		AuthorDao dao = new AuthorDaoOracleImple();
		boolean success = dao.insert(vo);
		
		System.out.println("Author INSERT : " + (success ? "성공" : "실패"));
		scanner.close();
		
	}
	private static void deleteAuthor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제 할 작가 : ");
		long authorId = scanner.nextLong();
		
		AuthorDao dao = new AuthorDaoOracleImple();
		boolean success = dao.delete(authorId);
		
		System.out.println("Author INSERT : " + (success ? "성공" : "실패"));
		scanner.close();
	
	
	}
	private static void updateAuthor() {
		//작가 pk확인
		//업데이트 내용 : name, bio 
		Scanner scanner = new Scanner(System.in);
		System.out.print("업데이트 할 작가");
		long authorId = scanner.nextLong();
		System.out.print("변경할 이름");
		String name = scanner.next();
		System.out.print("변경할 이력");
		String bio = scanner.next();
		
		AuthorVo vo = new AuthorVo(authorId, name, bio);
		AuthorDao aod = new AuthorDaoOracleImple();
		
		boolean success = dao.update(vo);
		
		System.out.println("Author UPDEATE : " + (success ? "성공" : "실패"));
		scanner.close();
		
		
	}
	private static void searchAuthors() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색어 : ");
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
