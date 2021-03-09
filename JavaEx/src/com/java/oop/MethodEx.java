package com.java.oop;

public class MethodEx {
	public static void main(String[] args) {
		printDivide(5,3);
		printDivide(5, 0 );
		double result = getSum(4, 5);
		System.out.println("4+5=" + result);
		
		System.out.println("getSum : "+ getSum(new double[] {
				1, 2, 3, 4, 5, 6, 7 ,8, 9, 10
		}));
	
	}
	//�����μ� : ...
	private static double getSum(double...values) {
		double total = 0;
		for( double value : values) {
			total += value;
			
		}
		return total;
		return getSum(values);
	}
	
	}
	//�Ű������� ������ �𸦶� -> �迭�̿�
	private static double getSum(double[]values) {
		double total = 0;
		for( double value : values) {
			total += value;
			
		}
		return total;
	}
	//��ȯ���� �ް��� �Ѵٸ� ���� Ÿ���� ����������Ѵ�
	private static double getSum(double num1, double num2) {
		return num1 + num2; //�ݵ�� ������ ���� Ÿ�԰� ��ġ�ؾ��Ѵ�
	}
	//��ȯ���� ���� ��� void Ÿ�� ����
	private static void printDivide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0���� ���� �� �����");
			return; //return���� ������ ���� �ڵ�� �������� �ʰ� ȣ��� ������ �ǵ��ư���
			
		}
		System.out.println(num1 / num2);
	}
}
