package day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 使用者輸入身高與體重
		// 系統算出 bmi 值與診斷
		// 診斷 bmi 小於等於 18 "過輕"
		// 診斷 bmi 大於 23 "過重"
		System.out.print("請輸入身高:");
		double h = sc.nextDouble(); // 將使用者在鍵盤中所輸入的資料轉換成 double

		System.out.print("請輸入體重:");
		double w = sc.nextDouble();

		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("BMI = %.2f%n", bmi);

		// 診斷
		if(bmi <= 18) {
			System.out.println("過輕");
		} else if(bmi > 23) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}

	}

}