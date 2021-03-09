package com.javaex.practice01;

import java.util.Scanner;

public class Problem07 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		
		//바깥쪽 루프
				while(true) {
					//게임로직
					int num =(int) (Math.random() * 100) + 1; //1부터 100사이의 정수 난수를 확인할 수 있음
					System.out.println("=============");
					System.out.println("게임을 시작합니다.");
					System.out.println("=============");
					
					while(true) {
						System.out.print(num + ">>");
						int inputNum = scanner.nextInt();
						//num 와 inputNum을 비교 -> 정답체크
						if(inputNum == num) {
							System.out.println("정답입니다");
							break;
						}else if(inputNum < num){
							System.out.println("더 높게");
						}else {
							System.out.println("더 낮게");
						}
					}
					
					
					System.out.println("게임을 종료하시겠습니까? (y/n)>>");
					String retry = scanner.next();//더 진행 할 것인지 물어봄
				
				if(retry.contentEquals("y")) {
					break;
				}
				
				}
				scanner.close();
		
		}
}
