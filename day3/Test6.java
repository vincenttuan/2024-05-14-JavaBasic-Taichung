package day3;

public class Test6 {

	public static void main(String[] args) {
		// 飲料一瓶定價 15 元
		// 打七折後賣多少錢 ?

		int originalPrice = 15; // 定價(原價)
		double discountRate = 0.7; // 七折

		// 折扣後的價格(強制轉型 int)
		//int discountedPrice = (int)(originalPrice * discountRate); // 只取整數
		//int discountedPrice = (int)Math.round(originalPrice * discountRate); // 只取整數,四捨五入
		//int discountedPrice = (int)Math.ceil(originalPrice * discountRate); // 只取整數,無條件進入
		int discountedPrice = (int)Math.floor(originalPrice * discountRate); // 只取整數,無條件捨去

		System.out.printf("飲料定價 %d 元%n", originalPrice);
		System.out.printf("打七折後的價格 %d 元%n", discountedPrice);

	}

}