package arkadasSayilar;

// Arkadaş sayılar: kendileri hariç pozitif tam sayı bölenleri birbirlerine eşit olan sayıları arkadas sayılar denir.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sayi1 = 220;
		int sayi2 = 284;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i<sayi1; i++) {
			if (sayi1 % i == 0) {
				total1 += i;
			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				total2 += i;
			}
		}

		if (sayi1 == total2 && sayi2 == total1) {
			System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayılardır.");
		} else {
			System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayılar değildir.");

		}
	}

}
