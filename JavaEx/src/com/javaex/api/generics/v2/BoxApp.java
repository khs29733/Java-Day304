package com.javaex.api.generics.v2;

public class BoxApp {
		public static void main(String[] args) {
			//Generic���� ����� Ŭ������ 
			//new (�ν��Ͻ�ȭ) �� �� ���� ������ Ÿ���� ������ �� �ִ�
			GenericBox<Integer> intBox = new GenericBox<>();	//Integer ��ü�� ���� �������� Ÿ��
			GenericBox<String> strBox = new GenericBox();		//���� �����͸� String
			
			intBox.setContent(2021);		//�����Ϸ��� ���ο� ��� Ÿ�� üũ
//			intBox.setContent("Java");	//�����Ϸ��� Ÿ�� üũ�� �� �� ���� - > ������Ȯ��
			
			strBox.setContent("Java");
			
			int retVal = intBox.getContent();//ĳ���� ���ʿ�
			String retStr = strBox.getContent();
			
			System.out.println("intBox ���빰 : " + retVal);
			System.out.println("strBox ���빰 : " + retStr);
		
		
		}
}
