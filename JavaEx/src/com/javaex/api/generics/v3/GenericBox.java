package com.javaex.api.generics.v3;

//Generic
//T : Type
//R : Return
//K : Key
//V : Value
//... �پ��� ���ø� ���ڸ� ��� �� �� �ִ�
public class GenericBox<K, V> {		//���ο��� ��� �� Key, Value�� Ÿ���� ���� ���·� ����
	K Key;
	V Content;
	public K getKey() {
		return Key;
	}
	public void setKey(K key) {
		Key = key;
	}
	public V getContent() {
		return Content;
	}
	public void setContent(V content) {
		Content = content;
	}
	
	
	
	
}
