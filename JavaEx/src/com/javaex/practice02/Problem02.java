package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
				
			int values[] = new int[5];
			//�Է� + ����
				for(int i = 0; i < values.length; i++) {
					values[i] = scanner.nextInt();
					
				}
				//�ջ�
				int total = 0;
				for(int num : values) {
					total += num;
				}
				
				double average =(double) total / values.length;
				System.out.printf("�հ�� %d, ����� %.2f%n", total, average);
				
				scanner.close();
			
		}
}
