package com.javaex.oop.point.v4;
// v4. 상속
public class Point {
		//필드
	//상속 받은 자식에서 접근을 허용
	private int x;
	private int y;
	
	//생성자가 하나도 없으면
	//컴파일러가 기본 생성자를 추가
	
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
	//출력 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n",x,y);
	}
	
}
//오버라이드가 되어도 부모의 메서드는 남아있다
//부모의 메서드를 호출
