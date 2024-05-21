package day3;

public class Test3 {

	public static void main(String[] args) {
		/********************************************************************
		 * 請設計一個 Java 程式, 計算當購買飲料並付現金時, 應該如何找零 ?
		 * 假設飲料價格為13元, 買一箱24瓶付現金 1000 元, 則需要找錢多少? 如何找 ?
		 * (500元 ? 張, 100元 ? 張, 50元 ? 個, 10元 ? 個, 5元 ? 個, 1元 ? 個)		
		********************************************************************/

		int pricePerBottle = 13; // 單瓶價格
		int numberOfBottles = 24; // 一箱飲料的瓶數
		int cash = 1000;

		int totalCost = pricePerBottle * numberOfBottles; // 總價格
		int change = cash - totalCost;

		System.out.printf("飲料一瓶 %d 元%n", pricePerBottle);
		System.out.printf("飲料一箱 %d 元%n", totalCost);
		System.out.printf("付現金 %d 元%n", cash);
		System.out.printf("找 %d 元%n", change);

		int fiveHundred = change / 500;  // 找500元的數量
		change = change % 500;           // 找完50元之後剩餘的錢
		//---------------------------------------------------
		int hundred = change / 100;      // 找100元的數量
		change = change % 100;           // 找完100元之後剩餘的錢
		//---------------------------------------------------
		int fifty = change / 50; // 找50元的數量
		change = change % 50;    // 找完50元之後剩餘的錢
		//---------------------------------------------------
		int ten = change / 10;   // 找10元的數量
		change = change % 10;    // 找完10元之後剩餘的錢
		//---------------------------------------------------
		int five = change / 5;   // 找5元的數量
		change = change % 5;     // 找完5元之後剩餘的錢
		//---------------------------------------------------
		int one = change;        // 找1元的數量
		//---------------------------------------------------

		System.out.printf("500元 %d 枚%n", fiveHundred);
		System.out.printf("100元 %d 枚%n", hundred);
		System.out.printf("50元 %d 枚%n", fifty);
		System.out.printf("10元 %d 枚%n", ten);
		System.out.printf("5元 %d 枚%n", five);
		System.out.printf("1元 %d 枚%n", one);


	}

}