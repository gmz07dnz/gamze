package slayt12;

import java.util.Scanner;

public class OdevForVeWhileLoop03 {

	 public static void main(String[] args) {
		 
		 /*
		  * Kullan�c�dan bir say� al�n ve bu say�n�n b�lenlerini ekrana yazd�r�n�z.
            Ornegin; 12'nin b�lenleri 1, 2, 3, 4, 6, 12 dir.
		  */
		 
	
		    Scanner scan = new Scanner(System.in);
			System.out.println("Bir say� giriniz");
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
