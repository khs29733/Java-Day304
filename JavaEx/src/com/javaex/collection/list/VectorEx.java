package com.javaex.collection.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
		
		public static void main(String[] args) {
			//������ ����
			Vector<Integer> v = new Vector();		//Integer ��ü�� ��� ����
			System.out.println("Size : " + v.size() + ", Capacity :" + v.capacity());
			
			// 1���� 10������ ���� ��ƺ��ô�
			for(int i = 1; i <= 10; i++) {
				//���� �ڿ� �߰�
				v.addElement(i);
			}
			System.out.println("v : " + v);
			System.out.println("Size : " + v.size() + ", Capacity :" + v.capacity());
			//��뷮 �ʰ�
			v.addElement(11);
			System.out.println("Size : " + v.size() + ", Capacity :" + v.capacity());
		
				//�߰��� ����
			v.insertElementAt(7,  5); 		// 7��ü�� 5�� �ε����� ����
			System.out.println("v:" + v);
			
			//��ü ����
			System.out.println("5�� �ε����� ��ü : " + v.elementAt(5));
			
			//��ü �˻� 
			int index = v.indexOf(6); 		//6��ü�� �ε�����?
			System.out.println("index of 6 : " + index);
			index = v.indexOf(0); 		//���� ��ü�� �ε���?
			System.out.println("index of 0 : " + index);
			
			
			//���� ���� Ȯ��
			//���ο� 10 ��ü ����?
			System.out.println("v contains 10?" + v.contains(10));
			
			//��ü ���� 
			System.out.println("v :" + v);
			v.removeElement(7);	//���ο��� 7��ü�� ����
			System.out.println("v :" + v);

			//���� ��ü�� ���
			for(int i = 0; i < v.size(); i++) {
				Integer item = v.elementAt(i);
				System.out.println(item + " ");
			}
			System.out.println();
			
			//Enhanced for
			for(Integer item : v) {
				System.out.println(item + " ");
			}
			System.out.println();
		
				//Vector -> Enumeration�� �޾ƿͼ� ��ȸ : ����
			Enumeration<Integer> e = v.elements();
			
			while(e.hasMoreElements()) {		//�ڿ� ��� ��ü�� �� �ִ°�
				Integer item = e.nextElement();	//�����͸� ������, �ڷ� �̵�
				System.out.println(item + " ");
			}
		System.out.println();
		
		//���� ����
		v.clear();
		System.out.println("v : " + v);
		System.out.printf("Size : %d, Capacity : %d%n", v.size(), v.capacity());
		}
}
