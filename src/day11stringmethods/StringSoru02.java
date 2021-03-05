package day11stringmethods;

import java.util.Scanner;

public class StringSoru02 {

	public static void main(String[] args) {
		
		/*
		 * 1)Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz.
		 * 2)Kulanici ad ve soyadini yazarken hatayla bas ve sona space koyarsa siliniz
		 * 3)Ad ve soyadin ilk harfleri buyuk diger harfleri kucuk olmali 
		 * 4)Kimlik numarasinin son 4 rakami haric hepsi * yapilmali Ornek: Ali Can *******1234
		 */
		
		
	// 1)Kullanicidan ad ve soyadini ve 11 haneli kimlik numarasini aliniz.
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen adinizi giriniz");
	String ad = scan.nextLine();
	
	System.out.println("Lütfen soyadinizi giriniz");
	String soyAd = scan.nextLine();
	
	System.out.println("Lütfen 11 haneli kimlik numaranizi giriniz");
	String kimlik = scan.nextLine();
	
	// 2)Kulanici ad ve soyadini yazarken hatayla bas ve sona space koyarsa siliniz
	
	
	ad = ad.trim();
	
	soyAd = soyAd.trim();
	
	
	// 3)Ad ve soyadin ilk harfleri buyuk diger harfleri kucuk olmali 
	
	ad = ad.substring(0, 1).toUpperCase()+ad.substring(1).toLowerCase();
	
	soyAd = soyAd.substring(0, 1).toUpperCase()+soyAd.substring(1).toLowerCase();
		
		
	// 4) Kimlik numarasinin son 4 rakami haric hepsi * yapilmali	
		
//	kimlik = "*******" +kimlik.substring(kimlik.length()-4);
	kimlik = kimlik.substring(0, 7).replaceAll("\\d", "*").concat(kimlik.substring(kimlik.length()-4));
	
	
	System.out.println(ad);
	System.out.println(soyAd);	
	System.out.println(kimlik);
		
scan.close();
	}

}
