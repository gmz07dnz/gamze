package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev07 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir rakam al�n ve bu rakam icin �arp�m tablosunu ekrana
		 * yazd�r�n. Kullan�c�n�n hata yapmad���n� farz edin. Ornegin kullan�c� 3
		 * girerse; 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
		 * 
		 */
	
	
	
	Scanner scan= new Scanner(System.in);
	System.out.println("l�tfen bir rakam giriniz");
	int rkm = scan.nextInt();
	
	int i = 1;
	
	while (i<=10) {
		System.out.println(i+ " x "+ rkm + "= " + (i*rkm));
	//i++;260o*--75;
	}
	
	scan.close();
	
	
	}

}

