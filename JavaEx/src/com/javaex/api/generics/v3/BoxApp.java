package com.javaex.api.generics.v3;

public class BoxApp {
		public static void main(String[] args) {
			//Generic���� ����� Ŭ������ 
			//new (�ν��Ͻ�ȭ) �� �� ���� ������ Ÿ���� ������ �� �ִ�
			// KeyŸ���� String, ValueŸ���� Integer
			GenericBox<String, Integer> intBox = new GenericBox<>();
			intBox.setKey("Integer");
			//intBox.setKey(123);//�� �� ����
			intBox.setContent(2021);
//			intBox.setContent("Java");//��� �� �� ����
			
			//���� �����ͺ��ϴ�
			int retVal = intBox.getContent();	//ĳ������ ���ʿ�
			System.out.println("Ű : " + intBox.getKey() + ", �� :" + retVal);
		
		}
}
