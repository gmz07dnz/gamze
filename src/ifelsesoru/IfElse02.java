package ifelsesoru;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		
	/*
	 Kullan�c�dan bir harf al�n 
	 e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n.
     �b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n.
	 */
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("L�tfen bir harf giriniz");	

	char harf = scan.next().charAt(0);
	
	System.out.println(harf);
	
	if(harf == 'a' || harf == 'e'  || harf == 'i' || harf == 'o' || harf == 'u'||
	  harf == 'A' || harf == 'E'  || harf == 'I' || harf == 'O' || harf == 'U' ) {
		System.out.println("Sesli Harf");
	}
	else {
		System.out.println("sessiz harf");
	}
	
	scan.close();
	
	
	}

}
