package javaofficehours;

import java.util.Scanner;

public class Day04SwitchCase01 {

	public static void main(String[] args) {
		
		 /* 
	      * kullan�c�Dan 1 ile 7 aras� bir gun secmesini isteyelim ve o gunun hang� gun oldugunu yazd�ral�m.
	      */

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Hangi g�n oldugunu belirlemek i�in \n 1 ile 7 aras�nda bir say� giriniz.");
	int g�nSayi = scan.nextInt();
	
	switch (g�nSayi) {
	
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
		System.out.println("L�tfen gecerli bir say� giriniz");
	
	}
		
	scan.close();	
		
		
		
	}

}
