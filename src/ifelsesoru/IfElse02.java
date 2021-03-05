package ifelsesoru;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
		
	/*
	 Kullanýcýdan bir harf alýn 
	 eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
     “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn.
	 */
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("Lütfen bir harf giriniz");	

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
