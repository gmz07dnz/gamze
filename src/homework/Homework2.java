package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

// Boyutlarý kullanýcýdan alýnan bir dikdörtgenler prizmasýnýn hacmini hesaplayan bir program yazýnýz. 
// Not: Dikdörtgenler Prizmasýnýn Hacmi:  En x Boy x Yükseklik 
		
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen dikdörtgenler prizmasýnýn enini giriniz.");
	double en = scan.nextDouble();
	System.out.println(en);	
	
	System.out.println("Lütfen dikdörtgenler prizmasýnýn boyunu giriniz.");
	double boy = scan.nextDouble();
	System.out.println(boy);
	
    System.out.println("Lütfen dikdörtgenler prizmasýnýn yüksekliðini giriniz");
	double yükseklik = scan.nextDouble();
	System.out.println(yükseklik);
	
	 
	System.out.println("Alan = " + en*boy*yükseklik);
	
	scan.close();
	
	
	
	
	
	
		
	}

}
