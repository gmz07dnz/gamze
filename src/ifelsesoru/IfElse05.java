package ifelsesoru;

import java.util.Scanner;

public class IfElse05 {

	public static void main(String[] args) {
		
		
	/*	
	Kullan�c�dan bir tamsay� al�n e�er tamsay� 10 dan kucuk ve 0�dan b�y�k e�it ise ekrana
	�Rakam� yazd�r�n. Di�er durumlarda ekrana �Say�� yazd�r�n.	
	*/	
		
	Scanner scan = new Scanner(System.in);
	
   System.out.println("L�tfen bir tamsayi giriniz");
		
	int num = scan.nextInt();
	
	
	if(num>=0 && num<10) {
		System.out.println("Rakam");
	}
	else {
		System.out.println("Sayi");
	}
		
	scan.close();
	}

}
