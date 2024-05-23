package day4;

public class Test6 {

	public static void main(String[] args) {
		// 1:星期日, 2:星期一 ... 7:星期六
		int weekDay = 4;

		// if-else -----------------------
		if(weekDay == 1) {
			System.out.println("星期日");
		} else if(weekDay == 2) {
			System.out.println("星期一");
		} else if(weekDay == 3) {
			System.out.println("星期二");
		} else if(weekDay == 4) {
			System.out.println("星期三");
		} else if(weekDay == 5) {
			System.out.println("星期四");
		} else if(weekDay == 6) {
			System.out.println("星期五");
		} else if(weekDay == 7) {
			System.out.println("星期六");
		} else {
			System.out.println("資料錯誤");
		}

		// switch-case -----------------------
		switch(weekDay) {
			case 1:
				System.out.println("星期日");
				break;
			case 2:
				System.out.println("星期一");
				break;
			case 3:
				System.out.println("星期二");
				break;
			case 4:
				System.out.println("星期三");
				break;
			case 5:
				System.out.println("星期四");
				break;
			case 6:
				System.out.println("星期五");
				break;
			case 7:
				System.out.println("星期六");
				break;
			default:
				System.out.println("資料錯誤");	
		}

	}

}