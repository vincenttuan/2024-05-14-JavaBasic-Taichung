package day3;

public class Test2 {

	public static void main(String[] args) {
		// 請設計一個 Java 程式, 計算當購買一瓶飲料並付現金時, 應該如何找零 ?
		// 假設飲料價格為13元, 付現金 100 元, 則需要找錢多少? 如何找 ?
		// (50元 ? 個, 10元 ? 個, 5元 ? 個, 1元 ? 個)
		int price = 13; // 飲料價格
		int cash = 100; // 付現金 100 元
		int change = cash - price; // 找錢
		System.out.printf("飲料一瓶 %d 元%n", price);
		System.out.printf("付現金 %d 元%n", cash);
		System.out.printf("找 %d 元%n", change);

		int fifty = change / 50; // 找50元的數量 = 1
		change = change % 50;    // 找完50元之後剩餘的錢 = 37
		//---------------------------------------------------
		int ten = change / 10;   // 找10元的數量 = 3
		change = change % 10;    // 找完10元之後剩餘的錢 = 7
		//---------------------------------------------------
		int five = change / 5;   // 找5元的數量 = 1
		change = change % 5;     // 找完5元之後剩餘的錢 = 2
		//---------------------------------------------------
		int one = change;        // 找1元的數量 = 2
		//---------------------------------------------------

		System.out.printf("50元 %d 枚%n", fifty);
		System.out.printf("10元 %d 枚%n", ten);
		System.out.printf("5元 %d 枚%n", five);
		System.out.printf("1元 %d 枚%n", one);

	}

}