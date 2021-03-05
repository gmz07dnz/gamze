package ifelsesoru;

import java.util.Scanner;

public class ÝfElse03 {

	 
	public static void main(String[] args) {
		
	/*
	Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
    “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. “Pazar” ise ekrana
    “Hýristiyanlar icin kutsal gün” yazdýrýn	
    */
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir gün ismi giriniz");
		String day = scan.next();	
		
// string'lerde kesinlikle "==" kullanýlmaz.
// "==" Primitive data type 'larda kullanýlýr
// Stringlerde method var ona ulaþmak için noktaya basarýz.Equals methodu iki String'i 
// büyük küçük harfe dikkat ederek karþýlaþtýrýr.
//equalsIgnoreCase() ==> iki string'i büyük harf küçük harfe dikkate almadan karþýlaþtýrýr.
// string'ler ayný ise true, farkli ise false return eder.
		
		if(day.equalsIgnoreCase("cuma")){
			System.out.println("Müslümanlar için kutsal gün");
		}
		
		if(day.equalsIgnoreCase("cumartesi")) {
			System.out.println("Yahudiler için kutsal gün");
		}
		
		if (day.equalsIgnoreCase("pazar")) {
			System.out.println("Hristiyanlar için kutsal gün");
		}
		
		scan.close();	
		

	}

}
