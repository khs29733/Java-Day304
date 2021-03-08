package com.javaex.api;

import java.util.Arrays;

//�迭�� �����ϴµ� ������ �ִ� Ŭ����
public class ArraysEx {
public static void main(String[] args) {
	arrayCopyEx();
}


//�迭 ����
	private static void arrayCopyEx() {
		//ȸ��
		char[] src = "Java Programming".toCharArray();
		System.out.println("���� :" + Arrays.toString(src));
	
	//system�� �̿��� ����
		char target[] = new char[src.length];
		System.arraycopy(src,//���� �迭��
				0,// ���� �ε���
				target,//Ÿ�� �迭
				0,//���� ������ġ
				src.length);//������ ����
		System.out.println("System�� �̿��� �迭 ���� :" + Arrays.toString(target));
		
		// Arrays Ŭ������ �̿��� �迭�� ����
		target = Arrays.copyOf(src, src.length);
		System.out.println("copyOf :" + Arrays.toString(target));
		
		//�迭�� �Ϻ� ����
		target = Arrays.copyOfRange(src,
				5,//���� ���� �ε���
				12);//���� �� ����
		System.out.println("copyOfRange" + Arrays.toString(target));
	}
}
