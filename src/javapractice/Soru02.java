package javapractice;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {

		/*
		 Kullanicidan iki tamsayi sayi ve islem cinsini alin ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.


         Ornek :
				Inputs 	: 	sayilar : 18 , 10    islem : carpma
				Output : 	18 X 10 = 180
      */

		
   Scanner scan = new Scanner(System.in);
   System.out.println("lütfen iki tam sayý giriniz");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	System.out.println("Yapmak istediðiniz iþlem cinsini giriniz. \n1: toplama \n2: çýkarma \n3: çarpma \n4: bölme");
	String s1 = scan.next().toLowerCase();
	
	// switch ile 
	
	switch (s1) {
	case ("toplama"):
		System.out.println("num1 + num2 = " + (num1 + num2));
	break;
	case ("çýkarma"):
		System.out.println("num1 - num2 = " + (num1 - num2));
	break;
	case ("çarpma"):
		System.out.println("num1 * num2 = " + (num1 * num2));
	break;
	case ("bölme"):
		System.out.println("num1 / num2 = " + (num1 / num2));
	break;
	default:
		System.out.println("doðru bir iþlem seçeneði giriniz");
	}
	
	
	scan.close();
	
	}

}
