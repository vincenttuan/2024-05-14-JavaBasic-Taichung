package day5;

public class WhileDemo1 {
	public static void main(String[] args) {
		int count = 3; // 次數的變數
		System.out.println("迴圈開始");
		while(count > 0) { // 判斷 count 是否 > 0
			System.out.println("Hello Java");
			count--; // count 減 1
		}
		System.out.println("迴圈結束");
	}
}