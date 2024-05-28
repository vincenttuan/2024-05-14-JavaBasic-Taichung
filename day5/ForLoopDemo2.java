package day5;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		// 利用 for-loop 寫出九九乘法表

		for(int x=1;x<=9;x++) {

			for(int y=1;y<=9;y++) {

				System.out.printf("%dx%d=%-2d ", x, y, (x*y));

			}
			System.out.println();

		}

	}
}