package day2;

public class Demo6 {

	public static void main(String[] args) {
		// 身高 170 體重 60 求 bmi = ? (小數點2位)
		// 答案: bmi = 20.76
		double h = 170; // 170.0
		System.out.println(h);
		double w = 60.0; // 60.0
		System.out.println(w);
		// 將 h / 100
		h = h / 100;
		System.out.println(h);

		double bmi = w / (h * h);
		System.out.println(bmi);
		System.out.printf("bmi = %.2f%n", bmi);
		System.out.printf("bmi = %.2f%n", bmi);
	}

}