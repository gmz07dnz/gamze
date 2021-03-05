package javapractice;

import java.util.Scanner;

public class Day01Soru07 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan 3 kelime isyeyin ve cumle olarak yazdýrýn.
		 * Sonuna "." koyun
		 * 
		 *  örnek : 
		 *  ýnputs : Ali, topu, tut
		 *  output: Ali topu tut.
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("Cümle olusturmak için 3 kelimeden 1.sini yazýnýz");
	String word1 = scan.next();
	System.out.println("Cümle olusturmak için 3 kelimeden 2.sini yazýnýz");
	String word2 = scan.next();
	System.out.println("Cümle olusturmak için 3 kelimeden 3.sünü yazýnýz");
	String word3 = scan.next();	
		
	System.out.println(word1+" "+word2+" "+word3+".");	
		
	
	scan.close();
	
	
	}

}
