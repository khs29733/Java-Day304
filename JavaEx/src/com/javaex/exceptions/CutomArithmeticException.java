package com.javaex.exceptions;

public class CutomArithmeticException extends ArithmeticException {
		//�ʵ�
	private int num1;
	private int num2;
	
	//������
	public CustomArithmeticCException(String message, int num1, int num2);{
		//�θ� ������ ȣ��
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}

	
	
	
}
