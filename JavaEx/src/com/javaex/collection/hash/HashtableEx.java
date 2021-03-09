package com.javaex.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx {
		public static void main(String[] args) {
			//Map �������̽�
			Map<String, ClassRoom> map = new Hashtable<>();
			
			// �ε��� ������ �ƴ϶� Ű�� �̿��� ����
			map.put("101", new ClassRoom("Java", "R101"));
			map.put("202", new ClassRoom("C", "R202"));
			map.put("303", new ClassRoom("Python", "R303"));
			
			System.out.println("MAP" + map);
			//Ű�� -> Hashset -> ������ ����
			
			//��ȸ
			ClassRoom room = map.get("202");//Ű ����
			System.out.println("202 ���ǽ� : " + room);
			
			//����
			map.put("202", new ClassRoom("Linux", "R202"));
			System.out.println("Map : " + map);
			//������ Ű�� ����ϸ� -> ������ �����
			
			//Ư�� Ű�� ���ԵǾ� �ִ°�?
			System.out.println("map has 202? key ?" + map.containsKey("202"));
			// Ư�� ���� ���ԵǾ� �ִ°�? ->subject�� Java�� ��ü�� �ִ°�?
			System.out.println("map has subject Java ?" +
										map.containsValue("Java"));
			
			// �ݺ��� Ȱ��
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				ClassRoom item = map.get(it.next());
				System.out.println(item);
			}
			//����
			map.remove("202");
			System.out.println("MAP" + map);
			
			//������ô�
			map.clear();
			System.out.println("MAP : " + map);
			
			
			
		}
}
