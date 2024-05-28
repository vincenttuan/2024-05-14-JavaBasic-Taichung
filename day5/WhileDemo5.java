package day5;

import java.util.Random; // 隨機數匯入

public class WhileDemo5 {

	public static void main(String[] args) {
		// 連續印出 0~99 間的隨機數
		Random random = new Random(); // 建立一個隨機數物件

		while(true) {
			int num = random.nextInt(100); // 取 0~99 的隨機數
			
			if(num % 2 == 1) { // 判斷 num 是否是奇數, 若為奇數則 num 不印出
				continue; // 直接跳下一次的迴圈
			}
			
			System.out.println(num);

			if(num == 0) {
				break; // 跳離迴圈
			}
		}


	}

}
