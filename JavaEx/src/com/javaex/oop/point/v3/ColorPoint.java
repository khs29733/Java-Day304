package com.javaex.oop.point.v3;
//��ü�� ��� �������� extends Ű���带 ����Ѵ�
// �ֻ��� �θ�� java.lang.Object
public class ColorPoint extends Point{
	//�ʵ�
	private String color;
	
	
	// �����ڸ� ������ ������ �⺻ �����ڸ� �������ش�
	/*public ColorPoint() {
		//Ư���� ������� ������ �θ��� �⺻ �����ڸ� �����Ѵ�
		super(); // ->�����
	}
	*/
	
	//������
	public ColorPoint(int x, int y, String color) {
	super(x, y);	//�θ� ������ ȣ��
	this.color = color;
	}
	//getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void draw() {
		System.out.printf("������[x=%d, y=%d, ����=%s]�� �׷Ƚ��ϴ�.%n",
				getX(),getY(),color);
		super.draw();
	}
	@Override
	public void draw(boolean show) {
		String message = String.format("������[x=%d, y=%d, ����=%s]�� �׷Ƚ��ϴ�.%n",
				getX(),getY(),color);
		super.draw();
	}
}
