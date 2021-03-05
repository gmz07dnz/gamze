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
//			System.out.println("Kücük harf girdiniz");
//		}
//		else if (harf>='A' && harf<='Z') {
//			System.out.println("Büyük harf girdiniz");
//		}
//		else {
//			System.out.println("hatalý giris yaptýnýz");
//		}
		
		
		
		
	// ternary ile
		
String result=  harf>='a' && harf<='z' ? "Kücük harf girdiniz" :harf>='A' && harf<='Z' ? "Büyük harf girdiniz":"hatalý giris yaptýnýz";
	
System.out.println(result);
		
		
		
		
		
	scan.close();	
		
		
	}

}
