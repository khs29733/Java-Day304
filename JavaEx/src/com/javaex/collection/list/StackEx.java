package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {
	
	//Stack �ڷ���
	//Last Input First Output (LIFO)
		public static void main(String[] args) {
			Stack<Integer> stack = new Stack<>();
			
			System.out.println("Stack : " + stack);
			
			//������ ����
			for (int i = 0; i < 10; i++) {
				stack.push(i);
				System.out.println("STACK : " + stack);
			}
			
			//Ȯ�� : ���� ������(�����ġ)�� �����͸� Ȯ�� : ������ ����
			System.out.println(" PEEK : "+ stack.peek());
			System.out.println("STACK : " + stack);
			
			//���� : pop
			Integer item = stack.pop();
			System.out.println("POP : " + item);
			System.out.println("STACK : " + stack);
			
			//��ȸ
			while(!stack.empty()) {	//stack�� ������� ������
				System.out.println("POP : " + stack.pop());
				System.out.println("STACK : " + stack);
			
			}
			
			
			
		}
}
