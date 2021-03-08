package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;

//�迭�� �����ϴµ� ������ �ִ� Ŭ����
public class ArraysEx {
public static void main(String[] args) {
//	arrayCopyEx();
//	basicSortAsc();
	basicSortDesc();
}
	//����� ���� Ŭ������ ����
	private static void customClassSort() {
		Member[] members = {
				new Member("ȫ�浿"),
				new Member("����"),
				new Member("����ġ")
		};
		System.out.println("���� �迭 : " + Arrays.toString(members));
	}


	//�⺻ �ڷ����� �������� ����
	private static void basicSortAsc() {	//ascending(��������)
		int[] scores = {80, 50, 30, 90, 75, 88 , 77};
		System.out.println("���� :" + Arrays.toString(scores));
		Arrays.sort(scores); //	����
		System.out.println("�������� ����" + Arrays.toString(scores));
	}

	//�⺻ �ڷ����� �������� ����
	private static void basicSortDesc() {	//descending	��������
		Integer[] scores = {80, 50, 30, 90, 75, 88 , 77};
		System.out.println("���� : " + Arrays.toString(scores));
		//	���� ����
		Arrays.sort(scores, Collections.reverseOrder());
		System.out.println("�������� ���� : " + Arrays.toString(scores));
		
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
