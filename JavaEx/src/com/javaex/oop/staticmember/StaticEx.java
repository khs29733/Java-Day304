package com.javaex.oop.staticmember;

public class StaticEx {
	//Ŭ���� ����(static)
	//:��� �ν��Ͻ����� ����
	//:static -> instance(x)
	//:instance -> static(o)
	public static int refCount;
	public static String classVar;
	//�ν��Ͻ� ����
	//:���� ��ü ���ο����� ����
	public String instanceVar;
	
	//static���� �ʱ�ȭ�� static ��Ͽ���
	//Ŭ������ �ε�� �� �� �ѹ� ����
	static {
		refCount = 0;
		classVar = "Ŭ���� ����";
		System.out.println("=> Static Block");
		//instanceVar = "�ν��Ͻ� ����";//static -> instance ��� (x)
	}
	
	//������
	public StaticEx() {
		refCount++; // instance -> static (o)
		System.out.println("Instance ����");
		System.out.println("=> ���� Count : "+ refCount);
	}
	
	//�Ҹ���
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		System.out.println("�Ҹ��� ȣ��");
		super.finalize();
	}
	
}
