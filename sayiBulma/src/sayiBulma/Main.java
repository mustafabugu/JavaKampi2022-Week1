package sayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 6,5 ,5 };
		int aranacak = 5;
		int count = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == aranacak) {
				System.out.println(aranacak + " sayısı sayılar dizisinde var.");
				count++;
				// break;
			} else {
				System.out.println(aranacak + " sayısı sayılar dizisinde yok! ");
			}
			System.out.println(count);

		}

	}

}
