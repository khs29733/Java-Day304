package com.javaex.practice02;

public class Problem01 {
	public static void main(String[] args) {
		int[] data = {1, 3, 5, 8, 9, 11, 15, 18, 19 ,20, 30, 31, 33
	};
	// 3�� ����� ������, 3�� ����� ��
		int total = 0, count = 0;
		
		for(int num : data) {
			if (num % 3 == 0) {
				total += num;
				count++;
			}
		}
		System.out.println("3�� ����� �� : " + total);
		System.out.println("3�� ����� ���� : " + total);
	}
}
