package slayt13;

import java.util.Scanner;

public class OdevSoru04 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayý seçmesini söyleyin.
          Hangi þekli seçerse, o þeklin alanýný ve çevresini ekrana yazdýran programý yazýnýz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Aþagýdakilerden birini seçiniz" +"\n" + "paralelkenar"+"\n"+"dikdörtgen"+"\n"+"üçgen");
		String isim = scan.nextLine().toLowerCase();
		
		System.out.println("1.sayýyý giriniz");
		int i1 = scan.nextInt();
		System.out.println("2.sayýyý giriniz");
		int i2 = scan.nextInt();
		
		switch (isim) {
		case "üçgen":
			System.out.println(i1*i2/2);
			break;
		case "dikdörtgen":
			System.out.println(i1*i2);
			break;
		case "paralelkenar":
			System.out.println(i1*i2);
			break;
		default:
			System.out.println("lütfen dogru bir seçim yapýnýz");
			break;
		}
		
		scan.close();
		
	}

}
