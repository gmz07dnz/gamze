package day14whiledowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan sayi aliniz.
		 * sayi 10'dan k���kse ekrana "kazand�n�z!" yazd�r�n.
		 * say� 10 veya 10'dan b�y�kse ekrana "say� giriniz" yazd�r�n
		 */
		
	Scanner scan = new Scanner(System.in);
	int s= 0;
	
	do {
		System.out.println("sayi giriniz ");
		s= scan.nextInt();
	}while(s>=10);
		
	System.out.println("Kazand�n�z!");

	
	
scan.close();
	}

}
