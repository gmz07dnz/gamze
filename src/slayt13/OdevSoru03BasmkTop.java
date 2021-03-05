package slayt13;

import java.util.Scanner;

public class OdevSoru03BasmkTop {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýya sayý girmesini söyleyin. 
		 * Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný ekrana yazdýran bir program yazýn.
		 */
	


		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayý giriniz");
		int i1 = scan.nextInt();
	
		int rkmTop = 0;
		
		while (i1 != 0) {
			
			rkmTop = rkmTop + (i1%10);
			i1/=10;
		}
	System.out.println(rkmTop);
	
	
	
	scan.close();
	}

}
