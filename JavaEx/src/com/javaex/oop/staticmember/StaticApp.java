package com.javaex.oop.staticmember;

public class StaticApp {
	public static void main(String[] args) {
		//1���� �ε� : static -> ������
		
		StaticEx s1 = new StaticEx();
		System.out.println("���� ī��Ʈ : " + s1.refCount);
		//static  ����� new�� ���� �ʰ� ȣ�� �� �� �ִ�
		System.out.println("���� ī��Ʈ : " + StaticEx.refCount);
	
		
		// 2��° �ε� : static ����� ������� ����
		StaticEx s2 = new StaticEx();
		System.out.println("���� ī��Ʈ :" + StaticEx.refCount);
		
		
		//����
		s1 = null;
		System.out.println("s1 ����");
		System.out.println("���� ī��Ʈ :" + StaticEx.refCount);
		
		System.gc();//������ �ݷ��� ȣ��
		try {
			Thread.sleep(1000);//1�� ���
			System.out.println("���� ī��Ʈ : " + StaticEx.refCount);
		}catch(Exception e) {
			
		}
	
	
	}
}
