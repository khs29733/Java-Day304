package com.javaex.oop.staticmember;
// �̼� :
// 			� ��Ȳ������ �� �ϳ��� �ν��Ͻ��� ����
//			������ -> ���� ����
public class Singleton {
//static ������ �� �ϳ��� �ν��Ͻ� ��ü�� ��Ƶд�
	private static Singleton instance = new Singleton();
	//������
	private Singleton() {
		// new ȣ�� �Ұ�
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
}
