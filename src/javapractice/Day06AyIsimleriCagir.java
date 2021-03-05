package javapractice;

public class Day06AyIsimleriCagir extends Day06AyIsimleri {

	public static void main(String[] args) {
		
		
		/*
		 * Day06AyIsimleriCagir class’ini olusturun ve AyIsimleri class’indaki ay yazdirma methodunu yeni class’dan kullanin
		 */

		//1.yontem methodu kullanmak istedigim Class'dan bir obje olusturup o obje uzerinden o Class'daki tum methodlara ulasabilirim
		
		
		Day06AyIsimleri obj = new Day06AyIsimleri();
		
		obj.ayIsimleri(1); // ocak
		
		
		// 2. yöntem inheritance
		
		
		ayIsimleri(1); // ocak

	}

}
