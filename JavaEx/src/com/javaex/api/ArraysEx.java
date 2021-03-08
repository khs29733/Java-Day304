package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;

//배열을 조작하는데 도움을 주는 클래스
public class ArraysEx {
public static void main(String[] args) {
//	arrayCopyEx();
//	basicSortAsc();
	basicSortDesc();
}
	//사용자 정의 클래스의 정렬
	private static void customClassSort() {
		Member[] members = {
				new Member("홍길동"),
				new Member("장길산"),
				new Member("전우치")
		};
		System.out.println("원본 배열 : " + Arrays.toString(members));
	}


	//기본 자료형의 오름차순 정렬
	private static void basicSortAsc() {	//ascending(오름차순)
		int[] scores = {80, 50, 30, 90, 75, 88 , 77};
		System.out.println("원본 :" + Arrays.toString(scores));
		Arrays.sort(scores); //	정렬
		System.out.println("오름차순 정렬" + Arrays.toString(scores));
	}

	//기본 자료형의 내림차순 정렬
	private static void basicSortDesc() {	//descending	내림차순
		Integer[] scores = {80, 50, 30, 90, 75, 88 , 77};
		System.out.println("원본 : " + Arrays.toString(scores));
		//	역순 정렬
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("내림차순 정렬 : " + Arrays.toString(scores));
		
	}

//배열 복사
	private static void arrayCopyEx() {
		//회고
		char[] src = "Java Programming".toCharArray();
		System.out.println("원본 :" + Arrays.toString(src));
	
	//system을 이용한 복사
		char target[] = new char[src.length];
		System.arraycopy(src,//원본 배열의
				0,// 시작 인덱스
				target,//타겟 배열
				0,//복사 시작위치
				src.length);//복사할 길이
		System.out.println("System을 이용한 배열 복사 :" + Arrays.toString(target));
		
		// Arrays 클래스를 이용한 배열의 복제
		target = Arrays.copyOf(src, src.length);
		System.out.println("copyOf :" + Arrays.toString(target));
		
		//배열의 일부 복제
		target = Arrays.copyOfRange(src,
				5,//복사 시작 인덱스
				12);//복사 할 길이
		System.out.println("copyOfRange" + Arrays.toString(target));
	}
}
