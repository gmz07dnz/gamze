package ifelsesoru;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
	
/*
Kullan�c�dan cinsiyetini girmesini isteyin.
Erkek ise ya��n� kontrol edin. Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n.
Ya�� 18 den b�y�k e�it ise ekrana �Adam� yazd�r�n.
Kadin ise yasini kontrol edin. Ya�� 18 den k���k ise ekrana �K�z �ocuk� yazd�r�n.
Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n.
 */
		
   Scanner scan = new Scanner(System.in);
	System.out.println("L�tfen Cinsiyetinizi giriniz");
	String cinsiyet = scan.next();
	System.out.println(cinsiyet);
	System.out.println("L�tfen ya��n�z� giriniz");
	int age = scan.nextInt();
	System.out.println(age);

if(age<0) {
	System.out.println("L�tfen ya��n�z� do�ru giriniz");	
}else if (cinsiyet.equalsIgnoreCase("erkek")) {
	 if (age<18) {
		 System.out.println("Erkek �ocuk");
	 } else 
		 System.out.println("Adam");
 } else if (cinsiyet.equalsIgnoreCase("kadin")) {
if (age<18) {System.out.println("Kiz �ocuk");
 } else 
	 System.out.println("Kadin");
	 
scan.close();
	}
	}
}
