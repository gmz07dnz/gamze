package day08ternary;

import java.util.Scanner;

public class TernarySoru09 {

	public static void main(String[] args) {
	
  /*
  Kullan�c�dan bir dikd�rtgenin en ve boyunu girmesini isteyin. 
  En ve boy e�it ise ekrana �Kare� farkl� ise ekrana �Dikd�rtgen� yazd�r�n.
   */
		
		
 Scanner scan = new Scanner(System.in);
System.out.println("Dikd�rtgenin en ve boy uzunlugunu giriniz");
		
double en = scan.nextDouble();
double boy = scan.nextDouble();


// if ile 

if ( en == boy) {
	System.out.println("Kare");
}else {
	System.out.println("Dikd�rtgen");
}
		
 // ternary ile

String result = en == boy ? "Kare" : "Dikd�rtgen";
System.out.println(result);
		
scan.close();		
		
		
	}

}
