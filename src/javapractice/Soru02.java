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
   System.out.println("l�tfen iki tam say� giriniz");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	System.out.println("Yapmak istedi�iniz i�lem cinsini giriniz. \n1: toplama \n2: ��karma \n3: �arpma \n4: b�lme");
	String s1 = scan.next().toLowerCase();
	
	// switch ile 
	
	switch (s1) {
	case ("toplama"):
		System.out.println("num1 + num2 = " + (num1 + num2));
	break;
	case ("��karma"):
		System.out.println("num1 - num2 = " + (num1 - num2));
	break;
	case ("�arpma"):
		System.out.println("num1 * num2 = " + (num1 * num2));
	break;
	case ("b�lme"):
		System.out.println("num1 / num2 = " + (num1 / num2));
	break;
	default:
		System.out.println("do�ru bir i�lem se�ene�i giriniz");
	}
	
	
	scan.close();
	
	}

}
