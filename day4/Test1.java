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

		int sum = chineseScore + mathScore + englishScore;
		System.out.printf("總分 = %d%n", sum);


	}
}