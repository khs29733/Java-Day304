package com.javaex.oop.point.v3;
//객체를 상속 받으려면 extends 키워드를 사용한다
// 최상위 부모는 java.lang.Object
public class ColorPoint extends Point{
	//필드
	private String color;
	
	
	// 생성자를 만들지 않으면 기본 생성자를 선택해준다
	/*public ColorPoint() {
		//특별히 명시하지 않으면 부모의 기본 생성자를 선택한다
		super(); // ->없어요
	}
	*/
	
	//생성자
	public ColorPoint(int x, int y, String color) {
	super(x, y);	//부모 생성자 호출
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
		System.out.printf("색깔점[x=%d, y=%d, 색상=%s]를 그렸습니다.%n",
				getX(),getY(),color);
		super.draw();
	}
	@Override
	public void draw(boolean show) {
		String message = String.format("색깔점[x=%d, y=%d, 색상=%s]를 그렸습니다.%n",
				getX(),getY(),color);
		super.draw();
	}
}
