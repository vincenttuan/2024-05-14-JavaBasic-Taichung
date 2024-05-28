package day5;

public class WhileDemo4 {
	public static void main(String[] args) {
		// 九九乘法表
		int x = 1;
		while(x <= 9) {
			//----------------------------------------------
			int y = 1;
			while(y <= 9) {
				System.out.printf("%dx%d=%-2d ", x, y, (x*y));
				y++;
			}
			//----------------------------------------------
			System.out.println(); // 換行
			x++;
		}


	}
}