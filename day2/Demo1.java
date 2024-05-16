package day2;

public class Demo1 {

	public static void main(String[] args) {
		// 宣告一個整數變數 x, 內容初始值為 100
		int x = 100;
		System.out.println(x); // 印出 x 變數的內容
		// 宣告一個整數變數 y, 內容初始值為 50
		int y = 50;
		System.out.println(y); // 印出 y 變數的內容
		//----------------------------------------
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		//----------------------------------------
		// 利用 printf 列印格式化
		// %d 放整數, %,d 含千分號
		// %f 放浮點數, %.2f 到小數點二位
		// %c 放字元
		// %b 放布林值
		// %s 放字串
		// %n 換行符號
		System.out.printf("x = %d%n", x);
		System.out.printf("y = %d%n", y);
		
	}

}