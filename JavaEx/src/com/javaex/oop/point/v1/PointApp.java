package com.javaex.oop.point.v1;

public class PointApp {
		public static void main(String[] args) {
			Point p1 = new Point();//�⺻ ������ ���
			p1.setX(5);
			p1.setY(10);
			p1.draw();
			
			Point p2 = new Point(15, 30);
			p2.draw();
		}
}



//this�� ��ü �ڽ��� ���Ѵ�	/	this�� �޼��� ȣ���� �޴� ��ü�� �ǹ��Ѵ�
//this�� �θ�� super
//this�� Ŭ������ �� �����ڿ��� �ٸ� �����ڸ� ȣ���Ҷ� ����� �� �ִ�