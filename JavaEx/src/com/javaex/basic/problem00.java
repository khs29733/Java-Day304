package com.javaex.basic;

import java.util.Scanner;

public class problem00 {
	public static void main(String[] args) {
		int max = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		for(int i = 1; i <= 5; i++) {
			System.out.println("���� :");
			int num = scanner.nextInt();
			// ù��° �Է� ���� �׳� max�� ����
			
			if( i == 1 || num > max) max = num;
		}
		System.out.println("�ִ��� " + max + " �Դϴ�");
		scanner.close();
	}
}
