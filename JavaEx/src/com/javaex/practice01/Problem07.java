package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		
		//�ٱ��� ����
				while(true) {
					//���ӷ���
					int num =(int) (Math.random() * 100) + 1; //1���� 100������ ���� ������ Ȯ���� �� ����
					System.out.println("=============");
					System.out.println("������ �����մϴ�.");
					System.out.println("=============");
					
					while(true) {
						System.out.print(num + ">>");
						int inputNum = scanner.nextInt();
						//num �� inputNum�� �� -> ����üũ
						if(inputNum == num) {
							System.out.println("�����Դϴ�");
							break;
						}else if(inputNum < num){
							System.out.println("�� ����");
						}else {
							System.out.println("�� ����");
						}
					}
					
					
					System.out.println("������ �����Ͻðڽ��ϱ�? (y/n)>>");
					String retry = scanner.next();//�� ���� �� ������ ���
				
				if(retry.contentEquals("y")) {
					break;
				}
				
				}
				scanner.close();
		
		}
}
