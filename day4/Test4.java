package day4;

public class Test4 {

	public static void main(String[] args) {
		int score = 75;
		// -- 利用 if-else -------------------
		if(score >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
		
		// -- 利用三元運算子(?:) --------------
		System.out.println(  (score >= 60) ? "及格" : "不及格"  );

	}

}