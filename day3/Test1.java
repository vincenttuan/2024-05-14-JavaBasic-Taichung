package day3;

public class Test1 {

	public static void main(String[] args) {
		// 數學運算子
		int result = 6/2*(1+2);
		System.out.printf("6/2*(1+2) = %d%n", result);

		// "%" 求餘數 
		int a = 15%2; // 1
		int b = 15%3; // 0
		// printf 中若要印出 % 要改成 %%, 因為 % 是特殊字元
		System.out.printf("15%%2 = %d%n", a); // 15%2 = 1
		System.out.printf("15%%3 = %d%n", b); // 15%3 = 0

		// "/" 除法
		int c = 15/2; // 7
		double d = 15/2; // 7.0
		double e = 15/2.0; // 7.5
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("15/2 = " + c);
		System.out.println("15/2 = " + d);
		System.out.println("15/2.0 = " + e);

		System.out.printf("15/2 = %d%n", c);
		System.out.printf("15/2 = %.1f%n", d);
		System.out.printf("15/2.0 = %.1f%n", e);

		System.out.println(0/10);
		//System.out.println(10/0); // 整數運算時分母不可為零,無意義
		System.out.println(10.0/0); // Infinity
		System.out.println(10/0.0); // Infinity
		System.out.println(10.0/0.0); // Infinity
	}

}