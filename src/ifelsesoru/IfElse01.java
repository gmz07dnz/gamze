package ifelsesoru;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
	/*	Kullan�c�dan bir tamsay� al�n 
	 e�er tamsay� 3 ile b�l�nebiliyorsa ekrana �3��n kat�� yazd�r�n.
	 3 ile b�l�nemiyorsa ekrana �3��n kat� de�ildir� yazd�r�n.	
	 */
		
		
	Scanner scan = new Scanner(System.in);
		
	System.out.println("L�tfen bir integer giriniz");	
	int num = scan.nextInt();
	System.out.println(num);
		
	int birler = num%10;
	int onlar = num/10;
	onlar = onlar%10;
	int y�zler = num/100;
		
	/*System.out.println(birler);	
	System.out.println(onlar);
	System.out.println(y�zler);*/
	
	
	if((birler+onlar+y�zler)%3 == 0 ) {
		System.out.println("3'�n kat�");
	}
	else {
		System.out.println("3'�n kat� de�ildir");
	}
	
	
	scan.close();
	
	}

}
