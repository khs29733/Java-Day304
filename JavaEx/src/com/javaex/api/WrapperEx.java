package com.javaex.api;

public class WrapperEx {
	public static void main(String[] args) {
		//�����
		// deprecated : ���� ������ ���� -> ���� �ð� ���� �ٸ� ������� �ڵ�
		Integer i = new Integer(10);
		Float f = new Float(3.14159f);
		// valueof() static �޼��带 �̿�����
		Character c = Character.valueOf('c');
		
		//���ڿ��� �ʱ�ȭ �� �� �ִ�
		Integer i2 = Integer.valueOf("10");
		Float f2 = Float.valueOf(3.14159f);
		Boolean b2 = Boolean.valueOf("false");
		//�Ķ���ͷ� ���޵� ���ڿ��� �ش� Ÿ������ ��ȯ�� �� �ִ� ������ ���ڿ��̾���Ѵ�
		
		//�ڵ��ڽ��� ����
		Integer i3 = 10; // == Integer i3 = Integer.valueof(10);
		
		//��ƿ��Ƽ �޼����
		//parse �迭 �޼��� : ���ڿ��� �̿�, �ش� Ÿ������ ��ȯ, �ٸ����·� ��� �޼���
		System.out.println(Integer.parseInt("-123"));	//���ڿ� -> ������ ��ȯ
		System.out.println(Integer.parseInt("FF", 16)); 		//16���� FF ->������ ��ȯ
		System.out.println(Integer.parseInt(28)); 		//28�� 2����	������ ���ڿ��� ���
		System.out.println(Integer.toHexString); 		//28�� 16���� ������ ���ڿ��� ���
		
		//����ȯ �޼����
		double d4 = i3.doubleValue();
		System.out.println("����ȯ : " + d4);
		
		//���� Ŭ���� ���� ��ü��
		Integer i4 = Integer.valueOf(2021);
		Integer i5 = Integer.valueOf(2021);
		System.out.println("i4 == i5?" + (i4 == i5)); //false���� ����
		//���� Ŭ���� == ���� Ŭ���� -> �� ��ü�� �ּҸ� ���Ѱ�
		
		//���� �񱳸� ���ؼ��� unboxing��, equals �񱳸� �ؾ��Ѵ�
		System.out.println("���� ��(��ڽ�) :" + (i4.intValue() == i5.intValue()));
		System.out.println("���� ��(equals) : " + i4.equals(15));
		
		
	}
}
