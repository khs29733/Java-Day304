package com.javaex.oop.goods.v2;
//v2. �ʵ��� ���� ����
//getter/setter�� �̿��� �ʵ��� ��ȸ����
public class Goods {
	//�ʵ� 
	// public > protected > default > private
	private String name;
	private int price;
	
	//getter/setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		//this�� ���� instance
		
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//��¿� �޼���
	public void showInfo() {
		System.out.printf("��ǰ �̸� :%s%n���� : %d��%n", name,price);
	}
}
