package day4;

import java.util.Scanner;
/**
	使用者可以根據活動編號與活動時間計算卡路里(Calorie), 進行診斷
	活動編號: 1-跑步, 2-游泳, 3-騎單車 由使用者自行輸入(1,2或3)
	活動時間: 由使用者自行輸入(單位:分鐘)
	卡路里計算: 1-跑步每分鐘消耗 10.0 卡路里
			   2-游泳每分鐘消耗 8.0 卡路里
			   3-騎單車每分鐘消耗 7.0 卡路里
	根據所消耗的卡路里進行診斷:
		卡路里 < 100 顯示 "卡路里消耗量偏低"
		卡路里 > 500 顯示 "卡路里消耗量過高"
		其餘顯示 "卡路里消耗量適中"
*/
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("活動編號: 1-跑步, 2-游泳, 3-騎單車: ");
		int no = sc.nextInt(); // 得到活動編號
		System.out.print("活動時間(分鐘): ");
		int minute = sc.nextInt(); // 得到活動時間
		// -- 計算卡路里 -------------------------
		double calorie = 0; // 卡路里預設值 = 0
		if(no == 1) {
			calorie = 10.0 * minute;
		} else if(no == 2) {
			calorie = 8.0 * minute;
		} else if(no == 3) {
			calorie = 7.0 * minute;
		} else {
			System.out.println("活動編號輸入錯誤");
			return; // main 方法結束(以下不做)
		}
		// -- 進行診斷並印出資訊 ------------------
		System.out.printf("卡路里消耗量 = %.1f%n", calorie);
		if(calorie < 100) {
			System.out.println("卡路里消耗量偏低");
		} else if(calorie > 500) {
			System.out.println("卡路里消耗量偏高");
		} else {
			System.out.println("卡路里消耗量適中");
		}
	}
}
