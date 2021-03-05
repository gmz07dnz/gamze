package day08ternary;

import java.util.Scanner;

public class TernarySoru03 {

	public static void main(String[] args) {
		
	/*
	Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. 
	Eðer urun miktarý 1000 den fazla ise kullanýcýya %10 indirim yapýn.
	Ödemesi gereken toplam parayý ekrana yazdýrýn. 
	Diðer durumlarda ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.
 */
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("ürün miktarýný giriniz");
	int m = scan.nextInt();
	
	System.out.println("birim fiyatý giriniz");
	double f = scan.nextInt();
	
	double result = m>1000 ? f*m*9/10 : f*m;
		System.out.println(result);

	scan.close();
	
	}

}
