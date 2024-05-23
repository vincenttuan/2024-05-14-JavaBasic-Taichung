package day4;

/*
	診斷 bmi 小於等於 18 "過輕"
	診斷 bmi 大於 23 "過重"
	其餘 "正常"
*/
public class Test5 {
	public static void main(String[] args) {
		double bmi = 21.56;

		// -- 利用 if-else -----------------
		if(bmi <= 18) {
			System.out.println("過輕");
		} else if(bmi > 23) {
			System.out.println("過重");
		} else {
			System.out.println("正常");
		}

		// -- 利用三元運算子(?:) -------------

		System.out.println( (bmi <= 18) ? "過輕" : (bmi > 23) ? "過重" : "正常" );

	}
}