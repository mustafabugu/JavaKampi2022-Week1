package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'F';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok Güzel. Geçtiniz.");
			break;
		case 'C':
			System.out.println("İyi.geçtiniz.");
			break;
		case 'D':
			System.out.println("Geçtiniz.");
			break;
		case 'F':
			System.out.println("Malesef kaldınız.");
			break;

		default:
			System.out.println("Geçersiz not girdiniz.");
			break;
		}
	}

}
