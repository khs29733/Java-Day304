package com.javaex.oop.point.v4;
// v4. ���
public class Point {
		//�ʵ�
	//��� ���� �ڽĿ��� ������ ���
	private int x;
	private int y;
	
	//�����ڰ� �ϳ��� ������
	//�����Ϸ��� �⺻ �����ڸ� �߰�
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	// getter/setter
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
		
	}
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	//��� �޼���
	public void draw() {
		System.out.printf("��[x=%d, y=%d]�� �׷Ƚ��ϴ�.%n",x,y);
	}
	
}
//�������̵尡 �Ǿ �θ��� �޼���� �����ִ�
//�θ��� �޼��带 ȣ��
