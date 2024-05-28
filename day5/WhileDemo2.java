package day5;

public class WhileDemo2 {

	public static void main(String[] args) {
		int count = 0;
		while(true) {
			System.out.println("Hello Java");
			count++;
			if(count == 3) {
				break; // 跳離迴圈
			}
		}

	}

}