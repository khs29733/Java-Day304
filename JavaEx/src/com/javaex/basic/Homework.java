package com.javaex.basic;

public class Homework {
	//1~100�� �߿��� 5�� 1���, 7�� ����� ���
		public static void main(String[] args) {
			for(int num = 1; num <= 100; num++) {
				if(num%5 == 0 && num % 7 == 0) {
					System.out.println(num);
				}
			}
		}




}
