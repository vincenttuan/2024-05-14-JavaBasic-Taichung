package day2;

public class Demo7 {

	public static void main(String[] args) {
		// 判斷分數是否及格 ?
		// 國文成績 = 75, 英文成績 = 45
		// 試問國文與英文是否及格 ?
		int chinese = 75;
		int english = 45;

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
		

	}

}