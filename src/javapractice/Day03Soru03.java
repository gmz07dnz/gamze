package javapractice;

import java.util.Scanner;

public class Day03Soru03 {

	public static void main(String[] args) {
		
		
		/*
		 * SORU 3)
		 *  Kullanicidan 50 den kucuk bir sayi alin,
		 *   1 den girilen sayiya kadar
		 * tum sayilari asagidaki kurallara gore yazdirin 
		 * Kural 1) sayilar yanyana yazilacak arada 1 bosluk olacak 
		 * Kural 2) Sayi 3?e bolunuyorsa sayi yerine ?Java? yazilacak
		 *  Kural 3) Sayi 5?e bolunuyorsa sayi yerine ?Ogreniyorum? yazacak 
		 *  Kural 4) Sayi hem 3 e hem 5 e bolunuyorsa ?Java Ogreniyorum? yazacak
		 * Kural 5) Her kelime yazdiginda alt satira gececek
		 *  
		 * ORNEK: 
		 * INPUT : 20
		 *  OUTPUT : 1 2 Java 4 Ogreniyorum Java 7 8 Java Ogreniyorum ???
		 */

		
	Scanner scan = new Scanner(System.in);
	System.out.println("50'den k???k bir say? giriniz");
	int num = scan.nextInt();
	
	for (int i = 1; i<=num ;i++ ) {
		if (i%3==0 && i%5==0) {
				System.out.println("Java Ogreniyorum");
			}
	     else if(i%3 == 0) {
			System.out.println("java");
		}else if (i%5 == 0) {
			System.out.println("??reniyorum");
		}else 
		System.out.print(i +" ");
	}
		
	scan.close();
	
	
	
		
		
		
		
	}

}
