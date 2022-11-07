package sayiAsalMi;

public class Main {

	public static void main(String[] args) {

		int number = 17;
		// int remainder = number % 2; // kalan 25%2
		// System.out.println(remainder);

		if(number==1) {
			System.out.println(number + " bir asal sayı değildir.");
			return;
		}
		if(number < 1) {
			System.out.println("Lütfen 1'den büyük bir sayı giriniz.");
		}
		
		for (int i = 2; i < 51;i++) {
			int remainder = number % i;

			if (remainder == 0) {
				System.out.println(number + " bir asal sayı değildir.");
				break;
			} else {
				System.out.println(number + " bir asal sayıdır.");
				break;
			}
		}
	}
}
