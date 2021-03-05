package javapractice;

public class Day04Hmc {

	public static void main(String[] args) {
		
	Day04Hm hesapMakinesi = new Day04Hm();
	
	
	
	hesapMakinesi.carpim2(3, 4);  // aldým getirdim ne yapayým diyor ==> return type int olan
	System.out.println(hesapMakinesi.carpim2(3, 4)); // 12 == > yazdýrýyorum , baska birsey de yapabilirim . 
	                                                 // Tekrar ekleme cýkarma yapabilirim. type olmasaydý ekstra hiçbirsey yapamazdým
	hesapMakinesi.carpim3(3, 4, 5); // 60  ==> diðer class'taki method içinde yazdýrdýgý için tekrar yazmaya gerek yok.
	
	hesapMakinesi.toplama2(2, 4); 
	System.out.println(hesapMakinesi.toplama2(2, 4)); // 6
	hesapMakinesi.toplama3(2, 4, 6); // 12
	
	}
}
