package javaofficehours;

import java.util.Scanner;

public class Day03IfElse02 {

	public static void main(String[] args) {
		
		
		  /*
		   * Kullanicidan 1 harf alalim bu harfin buyuk yada kucuk harf olma durumunu yazdiralim 
		   * eger harf girmedi ise "hatali giris" yazdiralim.
		   */

		
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
//		if (harf>='a' && harf<='z') {
//			System.out.println("K�c�k harf girdiniz");
//		}
//		else if (harf>='A' && harf<='Z') {
//			System.out.println("B�y�k harf girdiniz");
//		}
//		else {
//			System.out.println("hatal� giris yapt�n�z");
//		}
		
		
		
		
	// ternary ile
		
String result=  harf>='a' && harf<='z' ? "K�c�k harf girdiniz" :harf>='A' && harf<='Z' ? "B�y�k harf girdiniz":"hatal� giris yapt�n�z";
	
System.out.println(result);
		
		
		
		
		
	scan.close();	
		
		
	}

}
