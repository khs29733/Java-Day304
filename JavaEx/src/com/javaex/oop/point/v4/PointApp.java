package com.javaex.oop.point.v4;

import com.javaex.oop.point.v3.ColorPoint;

public class PointApp {
		public static void main(String[] args) {
			Point p1 = new Point(5, 10);//�⺻ ������ ���
			p1.draw();
			p1.draw();//�����ε��� �޼��带 ȣ��
			
			Point p2 = new Point(15, 30);//����� ���� ������
			p2.draw();
			p2.draw(false);//�����ε��� �޼��带 ȣ��
			
			ColorPoint cp = new ColorPoint(20, 40, "����");
			cp.draw();
			cp.draw(false);
			
			System.out.println("========");
			ColorPoint cp2 = new ColorPoint(30,40,"����")
					cp.draw();
			//�θ� Ÿ������ �ڽ��� ���� �� �� �ֵ�
			Point cp3 = new ColorPoint(50, 100, "�Ķ�")
					cp.draw();
		}
			
			}

}
//�θ�κ��� draw �޼��带 �����޾�����, �ٸ� ����� ������ ���, Override(�����)
