package com.javaex.exceptions;

import java.io.IOException;

import javax.sound.midi.SysexMessage;

public class ThrowsExcept {
		public static void executeChecked() 
				throws IOException{	//���� �߻� ���ܸ� ȣ�����ش�
			System.out.println("���� üũ�� ���� �߻�");
			//���� �߻�
			throw new IOException("���� ����");
//			IOException�� checked exception -> �ݵ�� ����
		}
		public static void executeRuntime() {
			System.err.println("��Ÿ�� ����");
			throw new RuntimeException("��Ÿ�� �ͼ���");  //unchecked���� -> ����ó���� ������������
		}
		public double divide(int num1, int num2) {
			double result;
			try {
			result = num1 / num2;
			}catch(ArithmeticException e) {
				//���� ��ȯ : ���� ��ü���� ���ܷ� ��ȯ�ϴ� ��
				throw new CustomArithmeticException("����� ���� Exception", num1, num2 );
			}
			return num1 / num2;
}
}