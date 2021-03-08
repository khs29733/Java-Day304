package com.javaex.api.generics.v3;

//Generic
//T : Type
//R : Return
//K : Key
//V : Value
//... 다양한 템플릿 문자를 사용 할 수 있다
public class GenericBox<K, V> {		//내부에서 사용 할 Key, Value의 타입을 미정 상태로 설께
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
