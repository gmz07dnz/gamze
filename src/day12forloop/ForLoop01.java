package day12forloop;

import java.util.Scanner;

public class ForLoop01 {
  public static void main(String[] args) {
	  
	  /*
		 *Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alýn ve 
		 *baþlangýç deðerinden baþlayýp bitiþ deðerinde biten tüm tamsayýlarý ekrana yazdýrýn. 
		 * 
		 * örn: kullanýcý 10 ve 15 verirse ekrana ==> 10 11 12 13 14 15 
		 */

	// 1) Kullanýcýdan baþlangýç ve bitiþ  deðerlerini alalým.
	  
	Scanner scan = new Scanner(System.in);
	System.out.println("Baslangic degerini giriniz");
	int bas = scan.nextInt();
	
	System.out.println("bitis degerini giriniz");
	  int bitis = scan.nextInt();
	  
	// 2) Baþlangýç deðerinden baþlayýp bitiþ deðerinde biten tüm tamsayýlarý ekrana yazdýrýn.
	  
	 
	if (bas>bitis) {
		System.out.println("baslangýç degeri bitis degerinden büyük olmamalý");
	}else {
	for (int i=bas; i<=bitis ; i++) {
		System.out.print(i + " ");
	}
	  
	} 
	
	scan.close();
	  
	  
	  
	  
  }
}
