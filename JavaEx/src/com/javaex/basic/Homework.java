package com.javaex.basic;

public class Homework {
	//1~100수 중에서 5의 1배수, 7의 배수만 출력
		public static void main(String[] args) {
			for(int num = 1; num <= 100; num++) {
				if(num%5 == 0 && num % 7 == 0) {
					System.out.println(num);
				}
			}
		}




}
