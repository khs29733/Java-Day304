package com.javaex.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int balance = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("===========");
			System.out.println("1. �Ա� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("===========");
			
			System.out.println("����>>");
			int menu = scanner.nextInt();
			int amount = 0;
			
			switch(menu) {
				
				case 1 : //�Ա�
					System.out.println("�Աݾ� >>");
					amount = scanner.nextInt();
					balance += amount;
					break;
				
				case 2 : //���
					System.out.println("��ݾ� >>");
					amount = scanner.nextInt();
					balance -= amount;
					break;
				
				case 3 : //�ܰ�
					System.out.println("�ܰ� >>"+balance);
					break;
				
				case 4 : //����
					run = false;
					break;
					default : //���¸޴�
						System.out.println("�ٽ� �Է��� �ּ���");
						
			
			
			}
		}
		
		
	}

}
