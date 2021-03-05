package javaofficehours;

import java.util.Scanner;

public class Day14Faktoriyel {

	public static void main(String[] args) {
		
		 //Girilen sayinin faktoriel sonucu bulan bir method yaziniz
        /*
         0!=1
         1!= 1x1=1
         2!=2X1=2
         3!=3X2X1=6
         */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Faktoriyelini hesaplamak için bir sayý giriniz");
        long sayi = scan.nextLong();
        
        System.out.println("Girilen sayinin faktoriyel degeri: "+ getFaktoriyel(sayi));
        
       
        scan.close();
	}

	public static long getFaktoriyel(long sayi) {
		 long faktoriyel= 1; 
	        
	        while(sayi>0) {
	        	faktoriyel*=sayi;
	        	sayi--;
	        	
	        }

	        
			return faktoriyel;
	        
		
	}

}
