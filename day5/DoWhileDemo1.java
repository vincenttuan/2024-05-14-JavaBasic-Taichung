package day5;

import java.util.Random;
import java.util.Scanner;

// 猜數字遊戲
public class DoWhileDemo1 {

	public static void main(String[] args) {
		Random random = new Random();
		int ans = random.nextInt(9) + 1; // 1~9 的隨機數 
		int count = 3; // 最多猜 3 次
		do {
			// 使用者在鍵盤上輸入數字
			Scanner scanner = new Scanner(System.in);
			System.out.print("請輸入(1~9): ");
			int guess = scanner.nextInt();
			count--; // 次數減一
			// 比對使用者輸入的數字(guess)是否與答案(ans)相同
			if(guess > ans) {
				System.out.println("猜大了");
			} else if(guess < ans) {
				System.out.println("猜小了");
			} else {
				System.out.println("猜對了");
				break;
			}
		} while(count > 0);

	}

}