package me;

import java.util.Scanner;

public class NotDegerlendirme {

	public static void main(String[] args) {

		/*
		 * Klavyeden öðrencinin aldýðý notu okuyan ve okunan bu nota göre öðrencinin
		 * durumunu deðerlendiren (Çok Güzel, Ortalamanýn üzerinde, Ortalamanýn altýnda
		 * gibi) bilgisayar programýný Java programlama dilinde yazýnýz.
		 * 
		 * 90-100 -->Çok iyi
		 * 75-90 --> iyi
		 * 50-75 --> orta
		 * 50  altý --> ortalamanýn altýnda
		 * 25 ve altý --> kötü
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen notunuzu giriniz");
		
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
					System.out.print("notunuz ortalamanýn altýnda");
				}
			}else {
				System.out.println("lütfen notunuzu doðru giriniz");
				}
		}
		catch (Exception e) {
			System.out.println("Lütfen notunuzu doðru bir sekilde giriniz");
		}
		
		
		
		
		scan.close();	
		
	
			}
	
}
