package day14whiledowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan isim ve soy ismini alin. Kullanicinin ilk isminin ilk harfinden
		 * soy isminin son harfine kadar olan butun harfleri buyuk harf olarak ekrana
		 * ayni satirda aralarina bosluk birakarak yaziniz.
		 */
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("isminizi giriniz");
	char isim = scan.nextLine().toUpperCase().charAt(0);
	
	System.out.println("soyIsminizi giriniz");
	String soyIsim = scan.nextLine().toUpperCase();
	char soyIsimSon = soyIsim.charAt(soyIsim.length()-1);
	
//	for(int i = 0; i <= isim.length()-1 ; i++) {
//		System.out.print(isim.charAt(i) + " ");
//	}
//	for (int i = 0; i <= soyIsim.length()-1 ; i++) {
//		System.out.print(soyIsim.charAt(i) + " ");
//	}
//	
	
	
	if (isim <soyIsimSon) {
	
	while (isim <= soyIsimSon ) {
		System.out.print(isim + " ");
		isim++;
	}
	}else {
		while (soyIsimSon <=isim ) {
			System.out.print(soyIsimSon + " ");
			soyIsimSon++;
	}
		
	}	
		
	scan.close();	
		
		
		
		
		
		
		

	}

}
