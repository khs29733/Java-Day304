package com.javaex.api.generics.v2;

//Generic
//����ÿ��� ����Ÿ���� �������� �ʰ�
//-> �ν��Ͻ�ȭ �Ҷ� ���� Ÿ���� �������ִ� ���
public class GenericBox<T> {		//<���ø�����>
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
}
