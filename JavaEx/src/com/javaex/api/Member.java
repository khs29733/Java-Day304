package com.javaex.api;
// ����� ���� Ŭ������ ���� ��
//(��Ʈ��)
//comparable �������̽��� �����ϰ� �־���Ѵ�
public class Member implements Comparable{
	String name;
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	//�� ��ü�� ��� �� ����
	@Override
	public int compareTo(Object o) {
		// -1, 0, 1
		//�� ����� ������ : 0
		//���� ���� ������ : -1
		//���� ���� ū ��� : 1
		//�Ķ���� o�� Member���� Ȯ��
		if(o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name); //�� ��ü �ʵ� name�� ���İ��� ��
		}
		return 0;
	}
	
}
