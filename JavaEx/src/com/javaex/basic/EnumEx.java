package com.javaex.basic;

public class EnumEx {
		public static void main(String[] args) {
			
			//enumTest();
			enumTest2();
		}
		
		
		
		private static void enumTest2() {
			Week today = Week.WEDNESDAY;
			String message;
			
			switch(today) {
			case SUNDAY :
				message = "�Ͽ���";
				break;
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY :
			case THURSDAY:
				meesage = "����";
			case FRIDAY :
				message = "�ұ�";
			case SATURDAY :
				message = "�ָ�";
				break;
				defaul :
					message = "?";
				
			}
			System.out.printf("%s���� %s%n", todayy.name(), message);
		}
		private static void enumTest() {
			Week today = week.WEDNESDAY;
			
			System.out.printf("Today is %s(%d)%n", today.name();//���Ż��;
			today.ordinal());
			
			//String -> ���Ż���� ��ȯ
			Week other = Week.valueOf("FRIDAY");
			System.out.printf("other is %s(%d)%n", other.name(), other.oridinal());
			//���Ż���� ���� ��
			System.out.println(other.compareTo(today));//�� ���� ����� ������
			
			Week[]days = Week.values();//week enumŸ���� ��翭�� ����� ��ȯ
			
			//��ȸ
			for(int i = 0; i < days.length; i++) {
				System.out.printf(%s(%d)%n,
						days[i].name(),
						days[i].oridinal());
			}
			
		
		}
}
