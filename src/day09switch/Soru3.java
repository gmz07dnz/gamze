package day09switch;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan bir tamsay� al�n e�er tamsay� 9 ise ekrana �Bir basamakl� en b�y�k say�� yazd�r�n. 
		 * 99 ise ekrana ��ki basamakl� en b�y�k say�� yazd�r�n.
		 * 999 ise ekrana ��� basamakl� en b�y�k say�� yazd�r�n. 
		 * Bu say�lar�n d���ndaki say�lar i�in �Yorum yok� yazd�r�n. 
		 */

    Scanner scan = new Scanner(System.in);		
		
	System.out.println("Bir tam sayi giriniz");
		
	int s = scan.nextInt();
	
	
	// Switch ile
	
	switch(s) {
	case 9 :
		System.out.println("Bir basamakl� en b�y�k say�");
	break;
	case 99:
		System.out.println("�ki basamakl� en b�y�k sayi");
	break;
	case 999 :
		System.out.println("�� basamakl� en b�y�k sayi");
	
	break;
	default:
		System.out.println("Yorum yok");
	
	}
		
	
	// If ile
	
	if (s== 9 ) {
		System.out.println("Bir basamakli en b�y�k sayi");
	}else if (s==99) {
		System.out.println("�ki basamakl� en b�y�k sayi");
	}else if (s== 999) {
		System.out.println("�� basamakli en b�y�k sayi");
	}else {
		System.out.println("Yorum yok");
	}
		
		
   // Ternary ile 		
		
String result = s== 9 ? "Bir basamakli en b�y�k sayi" : s==99 ? "�ki basamakl� en b�y�k sayi" :s== 999 ? "�� basamakli en b�y�k sayi" : "Yorum yok";
 System.out.println(result);
	
	
	scan.close();
	}

}
