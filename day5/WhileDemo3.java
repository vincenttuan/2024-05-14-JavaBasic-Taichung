package day5;

/*
	印出
	@@@@@
	@@@@@
	@@@@@
*/
public class WhileDemo3 {
	public static void main(String[] args) {
		int row = 3;
		while(row > 0) {

			//-----------------------------
			int count = 5;
			while(count > 0) {
				// 一次只印一個 "@""
				System.out.print("@");
				count--;
			}
			//-----------------------------
			System.out.println(); // 換行
			row--;
		}



		
	}
}