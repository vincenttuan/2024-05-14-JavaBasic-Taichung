package day2;

public class Demo4 {

	public static void main(String[] args) {
		// 半徑 = 1234, 求球體積 = ?
		int r = 1234;
		//double pi = Math.PI;
		double v = 4/3.0 * Math.PI * r * r * r;
		// --列印-------------------------------
		System.out.printf("球體積 = %f%n", v);
		System.out.printf("球體積 = %,.2f%n", v);
	}

}