package day06ifstatement;

import java.util.Scanner;

public class Swap01 {

	public static void main(String[] args) {

	/* 
	  a variable'in degeri 12, b variable'in degeri 25 olsun.
	  �yle bir kod yaziniz ki a 25 , b 12 olsun.
	  Sayilari kullanidan alin.
	*/	
		
	
	Scanner scan = new Scanner(System.in);	
	
	System.out.println("L�tfen iki sayi giriniz ");	
	double a= scan.nextDouble(); // 12
	double b = scan.nextDouble(); // 25
	System.out.println("Yer degi�tirmeden �nce");
	System.out.println("a: "+ a );
	System.out.println("b: " + b);
	
	// 1.yol
	
	double temp = 0.0;
	
	temp = a; // temp = 12 , a= 12
	a = b;   // a = 25 , b = 25
	b= temp; // b = 12 , temp = 12
	
	System.out.println("Yer degi�tirdikten sonra");
	System.out.println("a: "+ a);
	System.out.println("b: " + b);
	
  // 2.yol : ���nc� bir variable kullanma 1.yolda a = 25 , b = 12 olmustu
	
	a = a + b;
	b = a - b;
	a = a - b;
	
	System.out.println("Yer degi�tirdikten sonra 2.yol");
	
	System.out.println("a: "+ a);
	System.out.println("b: " + b);
	
		scan.close();

	}

}
