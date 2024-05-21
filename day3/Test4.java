package day3;

public class Test4 {

	public static void main(String[] args) {
		// 飲料一瓶 15 元, 買二送一
		// 請問買 10 瓶要花多少錢 ?
		int pricePerBottle = 15;
		int numberOfBottles = 10;

		// 計算實際需要付錢的瓶數
		int bottles = (numberOfBottles/3) * 2 + (numberOfBottles%3);
		System.out.println(bottles);

		// 計算總價格
		int totalCost = pricePerBottle * bottles;
		System.out.printf("買 10 瓶共需 %d 元%n", totalCost);

	}

}