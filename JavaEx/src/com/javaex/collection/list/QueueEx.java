package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		// Queue�� �������̽�, ��ü Ŭ������ List ���� ��ü Ŭ������ ���
		Queue<Integer> queue = new LinkedList<>();
		
		//������ ����
		for(int i = 0; i < 10; i++) {
			queue.offer(i);
			System.out.println("QUEUE : " + queue);	
		}
		
		//������ Ȯ��
		int item = queue.peek(); //������ �ȵ�
		System.out.println("PEEK : " + item);
		System.out.println("QUEUE : " + queue);
		item = queue.poll(); //������ ����
		System.out.println("POLL : " + item);
		System.out.println("QUEUE : " + queue);
		
		//queue���� poll�� �� ��,
		//����ִ��� �ݵ�� Ȯ���� ����
		while(!queue.isEmpty()) {
			System.out.println("POLL : " + queue.poll());
			System.out.println("QUEUE : " + queue);
		
		
		
		}
	}
}
