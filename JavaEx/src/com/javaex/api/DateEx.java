package com.javaex.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx {
		
		public static void main(String[] args) {
//				dateClassEx();
				calendarEx();
		}
		
		//Ķ���� ��ü
		private static void calendarEx() {
			//Ķ���� �ҷ�����
			Calendar now = Calendar.getInstance();
			Calendar custom = Calendar.getInstance();
			
			//���� ������ ���� ���� get(��¥ ���)
			System.out.printf("���� %d�� %d�� %d��%n", now.get(Calendar.YEAR),
					now.get(Calendar.MONTH)+ 1,	//�߿� : 1���� 0
					now.get(Calendar.DATE));
			
			//����� ������ �˰� ������
			custom.set(2012, 8, 24);	//��, �� -1, ��
			System.out.println("custom : %d�� %d�� %d��%n",
					custom.get(Calendar.YEAR),
					custom.get(Calendar.MONTH) + 1,
					custom.get(Calendar.DATE));
			
			//��¥�� ����
			Calendar future = Calendar.getInstance(); 		//���� ��¥
			// 100�� �ڷ� �̵�
			future.add(Calendar.DATE, 100);
			System.out.printf("�̷� : %d�� %d�� %d��%n",
					future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,
				future.get(Calendar.DATE));
			
			//�� ���� ���� �����ϱ�?
			//Calendar.DAY_OF_WEEK : 1(��)~
			int dow = future.get(Calendar.DAY_OF_WEEK); 	//��������
			System.out.println("���� : " + dow);
			
			String dowStr;
			
			switch (dow) {
			case Calendar.SUNDAY :
				dowStr = "�Ͽ���";
				break;
				
			case Calendar.MONDAY:
				dowStr = "������";
				break;
				
			case Calendar.TUESDAY:
				dowStr = "ȭ����";
				break;
				
			case Calendar.WEDNESDAY :
				dowStr = "������";
				break;
				
			case Calendar.THUSDAY :
				dowStr = "�����";
				break;
				
			case Calendar.FRIDAY :
				dowStr = "�����";
				break;
				
			case Calendar.SUNDAY:
				dowStr = "�Ͽ���"
					break;
			}
			
			System.out.println(dowStr);
		}
		//��¥ �ð�
		private static void dateClassEx() {
			//��¥ ��� ����
			Date now = new Date();	//���� ��¥�� �ð�
			System.out.println("���� : " + now.toString());	
			
			//��� ������ ����
			DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
			System.out.println("FULL : " + df.format(now));
			df = DateFormat.getDateInstance(DateFormat.Long);
			System.out.println("LONG : "  + df.format(now));
			df = DateFormat.getDateInstance(DateFormat.MEDIUM);
			System.out.println("MEDIUM : " + df.format(now));
			df = DateFormat.getDateInstance(DateFormat.SHORT);
			System.out.println("SHORT : " + df.format(now));
			
			//������ ������ �� -> SimpleDateFormat
			//2021�� 03�� 08�� 13�� 20�� _��
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� DD�� HH�� SS�� ");
			System.out.println("SDF : " + sdf.format(now));
			
			
		}
}
