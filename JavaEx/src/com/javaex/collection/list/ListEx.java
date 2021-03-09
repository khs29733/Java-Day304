package com.javaex.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
		public static void main(String[] args) {
			listClassEx();
		}
		
		private static void listClassEx() {
			//List ���� Ŭ������ List �������̽��� �����ϰ� �ִ�
			
//			List<String> lst = new LinkedList<>();//��ü Ŭ������ LinkedList
			List<String> lst = new ArrayList<>();
			
			System.out.println("lst :" + lst);
			System.out.println("size of 1st : " + lst.size());
			
			//��ü �߰�
			lst.add("Java");
			lst.add("C");
			lst.add("C++");
			lst.add("Python");
			
			System.out.println("1st : " + lst);
			
			//��ü ����
			lst.add(2, "C#");
			System.out.println("lst : " + lst);
			
			//List�� �ߺ� ������ ���
			lst.add("Java");
			System.out.println("lst : " + lst);
			
			//��ȸ
			System.out.println("2�� �ε��� : " + lst.get(2));
			
			//����
			for(String item : lst) {
				System.out.println(item + " ");
			}
			System.out.println();
			
			// �ݺ��ڸ� �̿��� ��ȸ : ��õ
			Interator<String> it = lst.iterator();
			while(it.hasNext()) {//�ڿ� ������ �� �ִ°�
				String item = it.next();
				System.out.println(item + " ");
			}
			System.out.println();
			
			//��ü�� ����
			lst.remove(2);	//�ε��� �̿� ����
			lst.remove("Python"); 	//��ü ����
			System.out.println("lst : " + lst);
			
			// �˻�
			int position = lst.indexOf("Java");
			System.out.println("lst search : " + position);
			position = lst.indexOf("Linux");	//���� ��ü�� �˻�
			System.out.println("���� ��ü �˻� : " + position);
		
			//����
			lst.clear();
			System.out.println("lst : " + lst);
		
		
		}
}
