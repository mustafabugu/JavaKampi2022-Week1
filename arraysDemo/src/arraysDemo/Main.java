package arraysDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ogrenciler = new String[5];
		ogrenciler[0] = "Ahmet";
		ogrenciler[1] = "Zahmet";
		ogrenciler[2] = "Mehmet";
		ogrenciler[3] = "Ali";
		ogrenciler[4] = "Azamet";

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		System.out.println("--------------------");
		
		for(int i = 0;i<ogrenciler.length; i ++)
		{
			System.out.println(ogrenciler[i]);
		}
	}

}
