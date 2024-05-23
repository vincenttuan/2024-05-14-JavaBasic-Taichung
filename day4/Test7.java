package day4;

public class Test7 {

	public static void main(String[] args) {
		
		int weekDay = 4; // 1

		// 若 weekDay = 2, 3, 4, 5, 6 印出 "平日"
		// 若 weekDay = 1, 7 印出 "假日"

		// if-else ---------------------------------------------------------------------
		if (weekDay == 2 || weekDay == 3 || weekDay == 4 || weekDay == 5 || weekDay == 6) {
			System.out.println("平日");
		} else if (weekDay == 1 || weekDay == 7) {
			System.out.println("假日");
		} else {
			System.out.println("日期錯誤");
		}

		// switch-case ------------------------------------------------------------------
		switch(weekDay) {
			case 1:
			case 7:
				System.out.println("假日");	
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("平日");
				break;
			default:
				System.out.println("日期錯誤");		
		}


	}

}