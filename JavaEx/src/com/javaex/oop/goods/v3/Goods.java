package com.javaex.oop.goods.v3;
//v3. ������
//new Ű����� �Բ� ���ǰ� ��ü�� �ʱ�ȭ�� ����Ѵ�
public class Goods {
	//�ʵ� 
	private String name;
	private int price;
	
	//�ڵ� ���� �����ڰ� �ϳ��� ������ �����Ϸ��� �⺻ �����ڸ� �߰�
	//����� ���� �����ڰ� ������ �⺻ �����ڸ� �߰����� �ʴ´�
	//��� �ʵ带 �ʱ�ȭ�ϴ� ������ 
	public Goods(String name, int price) {
		this.name = name;
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
