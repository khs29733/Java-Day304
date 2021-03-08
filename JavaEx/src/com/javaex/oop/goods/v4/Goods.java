package com.javaex.oop.goods.v4;
//v4. this : ��ü �ڱ� �ڽ��� �ǹ�
//this() : ���ο� �ִ� �ٸ� �����ڸ� ȣ��

public class Goods {
	private String name;
	//�ʵ�
	private int price;
	
	//�ڵ� ���� �����ڰ� �ϳ��� ������ �����Ϸ��� �⺻ �����ڸ� �߰�
	//����� ���� �����ڰ� ������ �⺻ �����ڸ� �߰����� �ʴ´�
	//������1 
	public Goods(String name) {
		this.name = name;
	}
	//��� �ʵ带 �ʱ�ȭ�ϴ� ������ : ������2 
	public Goods(String name, int price) {
		//this.name = name;
		//���ο� �ִ� �ٸ� ������
		this(name);
		this.price = price;
	}
	//getter/setter
	//getter�� �ְ�, setter��
	public String getName() {
		return name;
	}
	
	//public void setName(String name) {
	//	this.name = name;
		//this�� ���� instance
		
	//}
	public int getPrice() {
		return price;
	}
	//public void setPrice(int price) {
	//	this.price = price;
	//}
	//��¿� �޼���
	public void showInfo() {
		System.out.printf("��ǰ �̸� :%s%n���� : %d��%n", name,price);
	}
}
