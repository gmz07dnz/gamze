package javaofficehours;

import java.util.Scanner;

public class Day04SwitchCase01 {

	public static void main(String[] args) {
		
		 /* 
	      * kullanýcýDan 1 ile 7 arasý bir gun secmesini isteyelim ve o gunun hangý gun oldugunu yazdýralým.
	      */

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Hangi gün oldugunu belirlemek için \n 1 ile 7 arasýnda bir sayý giriniz.");
	int günSayi = scan.nextInt();
	
	switch (günSayi) {
	
	case 1 :
		System.out.println("Pazartesi");
	break;
	case 2 :
		System.out.println("Sali");
	break;
	case 3 :
		System.out.println("Carsamba");
	break;
	case 4 :
		System.out.println("Persembe");
	break;
	case 5 :
		System.out.println("Cuma");
	break;
	case 6 :
		System.out.println("Cumartesi");
	break;
	case 7 :
		System.out.println("Pazar");
	break;
	default :
		System.out.println("Lütfen gecerli bir sayý giriniz");
	
	}
		
	scan.close();	
		
		
		
	}

}
