package com.javaex.basic;

import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = scanner.nextInt();
		
		for (int row = 1; row <= num; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.println(row);
			}
			System.out.println();
		}
		scanner.close();
		
		
		
	}
}
