package javapractice;

public class Day04Hmc {

	public static void main(String[] args) {
		
	Day04Hm hesapMakinesi = new Day04Hm();
	
	
	
	hesapMakinesi.carpim2(3, 4);  // ald�m getirdim ne yapay�m diyor ==> return type int olan
	System.out.println(hesapMakinesi.carpim2(3, 4)); // 12 == > yazd�r�yorum , baska birsey de yapabilirim . 
	                                                 // Tekrar ekleme c�karma yapabilirim. type olmasayd� ekstra hi�birsey yapamazd�m
	hesapMakinesi.carpim3(3, 4, 5); // 60  ==> di�er class'taki method i�inde yazd�rd�g� i�in tekrar yazmaya gerek yok.
	
	hesapMakinesi.toplama2(2, 4); 
	System.out.println(hesapMakinesi.toplama2(2, 4)); // 6
	hesapMakinesi.toplama3(2, 4, 6); // 12
	
	}
}
