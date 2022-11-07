package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "Trabzon";
		sehirler[0][1] = "Rize";
		sehirler[0][2] = "Samsun";
		sehirler[1][0] = "İstanbul";
		sehirler[1][1] = "Sakarya";
		sehirler[1][2] = "Bursa";
		sehirler[2][0] = "Bingöl";
		sehirler[2][1] = "Erzurum";
		sehirler[2][2] = "Van";

		System.out.println("Karadeniz Bölgesi İlleri");

		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.println(sehirler[i][j]);
			}
		}
	}
}
