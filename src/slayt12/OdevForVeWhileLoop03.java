package slayt12;

import java.util.Scanner;

public class OdevForVeWhileLoop03 {

	 public static void main(String[] args) {
		 
		 /*
		  * Kullanýcýdan bir sayý alýn ve bu sayýnýn bölenlerini ekrana yazdýrýnýz.
            Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		  */
		 
	
		    Scanner scan = new Scanner(System.in);
			System.out.println("Bir sayý giriniz");
			int num = scan.nextInt();	 
		 
		 
		// for loop 
		 
	for(int i = 1; i<=num ; i++) {
		if(num%i == 0) {
			System.out.println(i);
		}
	}
		 
		 
	// while loop 
		 
	int i = 1;
	while (i<=num) {
		if(num%i == 0) {
			System.out.println(i);
		}
    i++;   
	}
		 
	scan.close();	 
		 
		 
		 
		 
		 
		 
		 
	 }
	
	
	
}
