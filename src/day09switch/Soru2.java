package day09switch;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan bir harf al�n e�er harf �a, e, i, o, u� dan biri ise ekrana �Sesli harf� yazd�r�n. 
		 * �b, c, d, f� den biri ise ekrana �Sessiz harf� yazd�r�n. 
		 * Bu harflerin d���nda bir character i�in �Ge�ersiz character�
		 * yazd�r�n.
		 */
      Scanner scan = new Scanner(System.in);
      System.out.println("L�tfen bir harf giriniz");
	 char h = scan.next().toLowerCase().charAt(0);
	  
	
	// switch ile

		switch (h) {

		case ('a'):
		case ('e'):
		case ('i'):
		case ('o'):
		case ('u'):
			System.out.println("Sesli harf");
			break;
		case ('b'):
		case ('c'):
		case ('d'):
		case ('f'):
			System.out.println("Sessiz harf");
			break;
		default:
			System.out.println("Ge�erli bir harf giriniz");
		}
	  
	//�F ile
		
   if(h == 'a' || h== 'e' || h == 'i' || h == 'o' || h == 'u') {
	   System.out.println("Sesli harf");
   } else if (h== 'b'|| h== 'c' || h== 'd' || h == 'f' ) {
	   System.out.println("Sessiz harf");
   } else {
	   System.out.println("Ge�erli bir harf giriniz");
   }
	  
	  
	  
   // ternary ile
   
   
String result =  (h == 'a' || h== 'e' || h == 'i' || h == 'o' || h == 'u') ?  "Sesli harf" :  (h== 'b'|| h== 'c' || h== 'd' || h == 'f' ) ? "Sessiz harf" : "Ge�erli bir harf giriniz";  
	  
	  System.out.println(result);
	  
	  
	  
	scan.close();  
	  
		
	}

}
