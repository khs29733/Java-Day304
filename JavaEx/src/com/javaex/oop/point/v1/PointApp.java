package com.javaex.oop.point.v1;

public class PointApp {
		public static void main(String[] args) {
			Point p1 = new Point();//기본 생성자 사용
			p1.setX(5);
			p1.setY(10);
			p1.draw();
			
			Point p2 = new Point(15, 30);
			p2.draw();
		}
}



//this는 객체 자신을 뜻한다	/	this는 메서드 호출을 받는 객체를 의미한다
//this의 부모는 super
//this는 클래스의 한 생성자에서 다른 생성자를 호출할때 사용할 수 있다