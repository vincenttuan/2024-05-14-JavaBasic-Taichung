package day2;

public class Demo2 {

	public static void main(String[] args) {
		// 數學: +加 -減 *乘 /除 %餘數
		// 長方形長10cm,寬5cm 求面積 ?
		// 先宣告一個變數用來存放長10cm的內容
		int length = 10; // 代表長10cm
		// 再宣告一個變數用來存放寬5cm的內容
		int width = 5; // 代表寬5cm
		// 最後先告一個變數用來存放面積的值
		int area = length * width;
		//--印出 1-------------------------------
		System.out.println(length);
		System.out.println(width);
		System.out.println(area);
		//--印出 2-------------------------------
		System.out.println("長 = " + length + " cm");
		System.out.println("寬 = " + width + " cm");
		System.out.println("面積 = " + area + " cm^2");
		//--印出 3-------------------------------
		System.out.printf("長 = %d cm%n", length);
		System.out.printf("寬 = %d cm%n", width);
		System.out.printf("面積 = %d cm^2%n", area);
	}

}