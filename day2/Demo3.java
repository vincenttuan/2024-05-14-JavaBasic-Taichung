package day2;

public class Demo3 {

	public static void main(String[] args) {
		// 半徑
		int r = 3395;
		// 圓周率
		double pi = 3.14159265359;
		// 面積
		double area = r * r * pi;
		//--印出 1----------------------------
		System.out.println(area);
		//--印出 2----------------------------
		System.out.println("面積 = " + area);
		//--印出 3----------------------------
		System.out.printf("面積 = %f%n", area);
		System.out.printf("面積 = %,f%n", area);
		System.out.printf("面積 = %,.2f%n", area);
	}

}