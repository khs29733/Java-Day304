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
				message = "일요일";
				break;
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY :
			case THURSDAY:
				meesage = "열공";
			case FRIDAY :
				message = "불금";
			case SATURDAY :
				message = "주말";
				break;
				defaul :
					message = "?";
				
			}
			System.out.printf("%s에는 %s%n", todayy.name(), message);
		}
		private static void enumTest() {
			Week today = week.WEDNESDAY;
			
			System.out.printf("Today is %s(%d)%n", today.name();//열거상수;
			today.ordinal());
			
			//String -> 열거상수로 변환
			Week other = Week.valueOf("FRIDAY");
			System.out.printf("other is %s(%d)%n", other.name(), other.oridinal());
			//열거상수의 순번 비교
			System.out.println(other.compareTo(today));//두 열거 상수의 순번차
			
			Week[]days = Week.values();//week enum타입의 모든열거 상수를 반환
			
			//순회
			for(int i = 0; i < days.length; i++) {
				System.out.printf(%s(%d)%n,
						days[i].name(),
						days[i].oridinal());
			}
			
		
		}
}
