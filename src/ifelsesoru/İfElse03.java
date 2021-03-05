package ifelsesoru;

import java.util.Scanner;

public class �fElse03 {

	 
	public static void main(String[] args) {
		
	/*
	Kullan�c�dan bir gun al�n e�er gun �Cuma� ise ekrana �M�sl�manlar icin kutsal g�n� yazd�r�n.
    �Cumartesi� ise ekrana �Yahudiler icin kutsal g�n� yazd�r�n. �Pazar� ise ekrana
    �H�ristiyanlar icin kutsal g�n� yazd�r�n	
    */
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir g�n ismi giriniz");
		String day = scan.next();	
		
// string'lerde kesinlikle "==" kullan�lmaz.
// "==" Primitive data type 'larda kullan�l�r
// Stringlerde method var ona ula�mak i�in noktaya basar�z.Equals methodu iki String'i 
// b�y�k k���k harfe dikkat ederek kar��la�t�r�r.
//equalsIgnoreCase() ==> iki string'i b�y�k harf k���k harfe dikkate almadan kar��la�t�r�r.
// string'ler ayn� ise true, farkli ise false return eder.
		
		if(day.equalsIgnoreCase("cuma")){
			System.out.println("M�sl�manlar i�in kutsal g�n");
		}
		
		if(day.equalsIgnoreCase("cumartesi")) {
			System.out.println("Yahudiler i�in kutsal g�n");
		}
		
		if (day.equalsIgnoreCase("pazar")) {
			System.out.println("Hristiyanlar i�in kutsal g�n");
		}
		
		scan.close();	
		

	}

}
