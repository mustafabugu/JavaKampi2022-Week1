package stringsDemo;

public class Main {
	public static void main(String[] Args) {
		String mesaj = "  Bugün hava çok güzel.   ";
		System.out.println(mesaj);

//		System.out.println("Mesajdaki harf sayısı : " + mesaj.length());
//		System.out.println("Beşinci eleman :" + mesaj.charAt(4));
//		System.out.println(mesaj.concat("Yaşasın!"));
//		System.out.println(mesaj.startsWith("B")); // B ile başlayan var mı ? Boolean cevap döner 
//		System.out.println(mesaj.startsWith("A"));
//		System.out.println(mesaj.endsWith("."));  // . ile biten var mı ?
//		
//		char[] karakter= new char[5];
//		mesaj.getChars(0, 5, karakter, 0);
//		System.out.println(karakter);
//		System.out.println(mesaj.indexOf('a')); // ilk bulduğu veride aramayı bitirir. Aramaya en soldan başlar
//		System.out.println(mesaj.indexOf("g"));
//		System.out.println(mesaj.indexOf("av"));
//		
//		System.out.println(mesaj.lastIndexOf("g")); // Aramaya sağdan(en sondan) başlar.
//		System.out.println(mesaj.lastIndexOf("ha"));

		String yeniMesaj = mesaj.replace('a', 'o'); // eski değeri yeni değer ile değiştirir.
		System.out.println(yeniMesaj);
		System.out.println(mesaj);

		System.out.println(mesaj.substring(2)); // 2. indexten itibaren kes
		System.out.println(mesaj.substring(2, 5)); // 2 ile 5 arasındaki değere kadar kes

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // harflerin tümünü küçüğe dönüştürür.
		System.out.println(mesaj.toUpperCase()); // harflerin tümünü büyüğe dönüştürür.

		System.out.println(mesaj.trim()); // başta ve sonraki boşlukları atarak ekrana yazdırır. DB aramalarında
											// kullanılır

	}

}
