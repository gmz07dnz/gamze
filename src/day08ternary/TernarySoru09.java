package day08ternary;

import java.util.Scanner;

public class TernarySoru09 {

	public static void main(String[] args) {
	
  /*
  Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin. 
  En ve boy eþit ise ekrana “Kare” farklý ise ekrana “Dikdörtgen” yazdýrýn.
   */
		
		
 Scanner scan = new Scanner(System.in);
System.out.println("Dikdörtgenin en ve boy uzunlugunu giriniz");
		
double en = scan.nextDouble();
double boy = scan.nextDouble();


// if ile 

if ( en == boy) {
	System.out.println("Kare");
}else {
	System.out.println("Dikdörtgen");
}
		
 // ternary ile

String result = en == boy ? "Kare" : "Dikdörtgen";
System.out.println(result);
		
scan.close();		
		
		
	}

}
