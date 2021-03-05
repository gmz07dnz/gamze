package me;

import java.util.Scanner;

public class NotDegerlendirme {

	public static void main(String[] args) {

		/*
		 * Klavyeden ��rencinin ald��� notu okuyan ve okunan bu nota g�re ��rencinin
		 * durumunu de�erlendiren (�ok G�zel, Ortalaman�n �zerinde, Ortalaman�n alt�nda
		 * gibi) bilgisayar program�n� Java programlama dilinde yaz�n�z.
		 * 
		 * 90-100 -->�ok iyi
		 * 75-90 --> iyi
		 * 50-75 --> orta
		 * 50  alt� --> ortalaman�n alt�nda
		 * 25 ve alt� --> k�t�
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen notunuzu giriniz");
		
		try {
			int point = scan.nextInt();
			if(point>=0 && point<=100) {
				if (point>=90 ) {
					System.out.println("not durumuz cok iyi");
				}else if (point>=75 && point<90) {
					System.out.println("not durumunuz iyi");
				}else if (point>=50 && point<75) {
					System.out.println("not durumunuz orta");
				}else if ( point<50) {
					System.out.print("notunuz ortalaman�n alt�nda");
				}
			}else {
				System.out.println("l�tfen notunuzu do�ru giriniz");
				}
		}
		catch (Exception e) {
			System.out.println("L�tfen notunuzu do�ru bir sekilde giriniz");
		}
		
		
		
		
		scan.close();	
		
	
			}
	
}
