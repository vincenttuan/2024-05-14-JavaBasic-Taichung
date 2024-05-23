package day4;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入國文考試成績:");
		int chineseScore = sc.nextInt();

		System.out.print("請輸入數學考試成績:");
		int mathScore = sc.nextInt();
		
		System.out.print("請輸入英文考試成績:");
		int englishScore = sc.nextInt();

		// 判斷各科是否及格 ?
		if(chineseScore >= 60) {
			System.out.println("國文及格");
		} else {
			System.out.println("國文不及格");
		}

		if(mathScore >= 60) {
			System.out.println("數學及格");
		} else {
			System.out.println("數學不及格");
		}

		if(englishScore >= 60) {
			System.out.println("英文及格");
		} else {
			System.out.println("英文不及格");
		}
		
		// 計算總分
		int sum = chineseScore + mathScore + englishScore;
		System.out.printf("總分 = %d%n", sum);

		// 計算平均到小數點1位
		double avg = (double)sum / 3;
		System.out.printf("平均 = %.1f%n", avg);		


	}
}