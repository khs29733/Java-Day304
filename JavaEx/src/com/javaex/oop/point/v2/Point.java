package com.javaex.oop.point.v2;
// v3. �޼��� �����ε�
// ���� �̸��� ��������, �Ű� ������ Ÿ�԰� ������ ������ �ٸ� �޼���
public class Point {
		//�ʵ�
	private int x;
	private int y;
	
	//�����ڰ� �ϳ��� ������
	//�����Ϸ��� �⺻ �����ڸ� �߰�
	//->�����ڰ� ���� ���� �ƴϴ�
	
	

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
	public void draw(boolean show) {
		String message = String.format("��[x=%d, y=%d]��", x, y);
		if(show) { //true
			message += "�׷Ƚ��ϴ�.%n";
		}else {
			message += "�������ϴ�%n";
		}
		System.out.println(message);
	}
}
