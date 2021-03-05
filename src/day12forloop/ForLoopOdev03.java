package day12forloop;

import java.util.Scanner;

public class ForLoopOdev03 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn. 
		 * Baþlangýç deðerinden veya sonrasýndan baþlayýp bitiþ deðerinde veya öncesinde biten tüm 3 ile 
		 * bölünebilen tamsayýlarý ekrana yazdýrýn.
		 */

		
	Scanner scan = new Scanner(System.in);
	System.out.println("Baslangic degerini giriniz");
	int bas = scan.nextInt();
	
	System.out.println("Bitis degerini giriniz");
    int bit = scan.nextInt();
    
   if(bas<=bit) {
    
    int i = bas;
    while (i<=bit) {
    	if ( i%3 == 0) {
    		System.out.println(i);
    	} 
     i++;
    }
   }else {
	int i = bit;   
	while (i<=bas)   {
		if(i%3==0) {
			System.out.println(i);
		}
	i++;
	}
	   
	  
   }
   scan.close(); 		
		
	}

}
