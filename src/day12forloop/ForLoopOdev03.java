package day12forloop;

import java.util.Scanner;

public class ForLoopOdev03 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n. 
		 * Ba�lang�� de�erinden veya sonras�ndan ba�lay�p biti� de�erinde veya �ncesinde biten t�m 3 ile 
		 * b�l�nebilen tamsay�lar� ekrana yazd�r�n.
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
