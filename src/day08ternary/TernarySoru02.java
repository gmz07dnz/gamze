package day08ternary;

import java.util.Scanner;

public class TernarySoru02 {

	public static void main(String[] args) {
		
	/*
	Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn 
	eðer iki kenar uzunluðu birbirine eþit ise ekrana
    “Ikizkenar Ucgen” yazdýrýn. Diðer durumlarda ekrana “Ikizkenar deðil” yazdýrýn.
	*/

	// If ile 	
		
/*	Scanner scan = new Scanner(System.in);
	System.out.println("Üçgenin kenar uzunluklarýný giriniz");
	int k1 = scan.nextInt();
	int k2 = scan.nextInt();
	int k3 = scan.nextInt();
	
	if(k1 == k2 || k2==k3 || k1 == k3) {
		System.out.println("Ýkizkenar Üçgen");
	}else
		System.out.println("Ýkizkenar Deðil");
	
*/
		
// ternary ile

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Üçgenin kenar uzunluklarýný giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
				
	String result = k1 == k2 || k2 == k3 || k1 == k3 ? 	"Ýkizkenar Üçgen" : "Ýkizkenar Deðil" ;
		
		System.out.println(result);
		
		scan.close();
		
		
	}

}
