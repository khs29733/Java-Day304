package com.javaex.collection.hash;

import java.util.HashSet;

public class HsahSetEx {
		public static void main(String[] args) {
		basicHashSetEx();
		}
		
		private static void basicHashSetEx() {
		HashSet<String> hs = new HashSet<>();
		
		//��� �߰�
			hs.add("Java");
			hs.add("C");
			hs.add("C++");
			hs.add("Python");
			
			
			System.out.println("HashSet : " + hs);//������ �������� ����
			System.out.println("����� �� : " + hs.size());
			
			hs.add("Java");
			System.out.println("HashSet : " + hs);	//�ߺ��� ������� ����
			
			//����� ���� ���� Ȯ��
			System.out.println("contains Java?" + hs.contains("Java"));
			System.out.println("contains Linux ?" + hs.contains("Linnux"));
			
			System.out.println("HashSet : " + hs);
			
			//����� ����
			hs.remove("C++");
			System.out.println("HashSet : " + hs);
		
			//����
			hs.clear();
			System.out.println("HashSet : " + hs);
		}
}
