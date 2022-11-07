package mukemmelSayi;

public class Main {
// kendisi hariç bölenler toplamı kendisine eşit olan sayılar mükemmel sayılardır.
	public static void main(String[] args) {

		int number = 6;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println(total + " bir mükemmel sayıdır.");
		}else {
			System.out.println(total + " bir mükemmel sayı değildir.");

		}

	}

}
