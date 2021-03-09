package com.javaex.oop.point.v4;

import com.javaex.oop.point.v3.ColorPoint;

public class PointApp {
		public static void main(String[] args) {
			Point p1 = new Point(5, 10);//기본 생성자 사용
			p1.draw();
			p1.draw();//오버로딩된 메서드를 호출
			
			Point p2 = new Point(15, 30);//사용자 정의 생성자
			p2.draw();
			p2.draw(false);//오버로딩된 메서드를 호출
			
			ColorPoint cp = new ColorPoint(20, 40, "검정");
			cp.draw();
			cp.draw(false);
			
			System.out.println("========");
			ColorPoint cp2 = new ColorPoint(30,40,"빨강")
					cp.draw();
			//부모 타입으로 자식을 참조 할 수 있따
			Point cp3 = new ColorPoint(50, 100, "파랑")
					cp.draw();
		}
			
			}

}
//부모로부터 draw 메서드를 물려받았지만, 다른 기능을 수행할 경우, Override(덮어쓰기)
