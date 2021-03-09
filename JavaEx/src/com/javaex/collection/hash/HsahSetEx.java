package com.javaex.collection.hash;

import java.util.HashSet;

public class HsahSetEx {
		public static void main(String[] args) {
//		basicHashSetEx();
			customHashSetEx();
		}
		
		private static void customHashSetEx() {
			HashSet<Student> hs = new HashSet<>();
			
			Student s1 = new Student(" ȫ�浿 ", 10);
			Student s2 = new Student(" ���� ", 20);
			Student s3 = new Student(" ����ġ ", 30);
			
			hs.add(s1);
			hs.add(s2);
			hs.add(s3);
			
			System.out.println("�л��� : " + hs);

			Student s4 = new Student("ȫ�浿", 10);
			hs.add(s4);
			System.out.println("hashcode of s1 : " + s1.hashCode());
			System.out.println("hashcode of s4 : " + s4.hashCode());
			System.out.println("s1 equals s4 ? " + s1.equals(s4));
			
			System.out.println("�л��� : " + hs);
			
			//���� ���� Ȯ��
			boolean exists = hs.contains(new Student("ȫ�浿", 10));
			System.out.println("ȫ�浿(10) exists : " + exists);
			
			
			
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
