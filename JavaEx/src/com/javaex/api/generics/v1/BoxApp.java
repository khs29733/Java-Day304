package com.javaex.api.generics.v1;

public class BoxApp {
		public static void main(String[] args) {
			IntBox intBox = new IntBox();
			intBox.setContent(2021);
			
			//���� �����;��մϴ�
			int retVal = intBox.getContent();
			System.out.println("���빰" + retVal);
		
			StringBox strBox = new StringBox();
			strBox.setContent("Java");
			
			String strVal = strBox.getContent();
			System.out.println("strBox ���빰 : " + strVal);
	
			ObjectBox objBox = new ObjectBox();
			objBox.setContent(2021);
			
			ObjectBox objBox2 = new ObjectBox();
			objBox2.setContent("Java");
			
			//���빰 Ȯ��
			///���� �����Ͱ� Object���� Java �����Ϸ��� üũ�� ���������
			//�����͸� �ҷ��� ��, ĳ���� �ʿ� -> ����, ����
			Integer retVal2 = (Integer)objBox.getContent();
			
		}
}
