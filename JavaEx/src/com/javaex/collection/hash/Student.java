package com.javaex.collection.hash;

public class Student {
		//�ʵ�
	int id;
	String name;
	
	//������
	public Student(String name, int id) {
			this.name = name;
			this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		//��ü�� ���� �ĺ��� -> int
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student)obj;
			return name.equals(other.name) && id == other.id;
		}
		return super.equals(obj);
	}
	
	
	
}
