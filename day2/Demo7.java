package day2;

public class Demo7 {

	public static void main(String[] args) {
		// 判斷分數是否及格 ?
		// 國文成績 = 75, 英文成績 = 40
		// 試問國文與英文是否及格 ?
		int chinese = 75;
		int english = 40;

		boolean chineseIsPass = chinese >= 60;
		boolean englishIsPass = english >= 60;
		//-------------------------------------
		System.out.println(chinese);
		System.out.println(english);
		System.out.println(chineseIsPass);
		System.out.println(englishIsPass);
		//-------------------------------------
		System.out.printf("國文 %d 及格 %b%n", chinese, chineseIsPass);
		System.out.printf("英文 %d 及格 %b%n", english, englishIsPass);
		// 請算出總分與平均(小數點1位)各為多少?並印出
		int sum = chinese + english;
		double avg = sum / 2.0;
		System.out.printf("總分 %d 平均 %.1f%n", sum, avg);

	}

}