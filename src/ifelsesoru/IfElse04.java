package ifelsesoru;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {

/*
 Kullan�c�dan iki say� al�n e�er say�lar�n i�aretleri ayn� ise ekrana �Ayn� i�aretli� yazd�r�n.
Say�lar�n i�aretleri farkl� ise ekrana �Farkl� i�aretli� yazd�r�n.
 */
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("L�tfen iki sayi giriniz");
	int num1 = scan.nextInt();
	int num2= scan.nextInt();
	
	if((num1>0 && num2>0) || (num1<0 && num2<0)) {
		System.out.println("Ayni i�aretli");
	}
		
	else {
		System.out.println("Farkli i�aretli");
	}
scan.close();
	}

}
