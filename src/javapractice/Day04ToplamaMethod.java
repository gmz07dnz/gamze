package javapractice;

import java.util.Scanner;

public class Day04ToplamaMethod {

	public static void main(String[] args) {
		
		/*
		 * SORU 2) Kullanicidan toplamak istedigi sayilari isteyen, 
		 * girilen sayilarin adedini ve toplamini yazdiran bir method olusturun 
		 * Not: kullanici 0 sayisini girerse toplama islemini bitirip sonucu yazdirin 
		 * INPUT : 23 -2 54 12 -86 0
		 * OUTPUT : Girdiginiz 5 adet sayinin toplamlari =1
		 */
		
		toplama ();
		

	}

	
	public static void toplama() {
		
	Scanner scan = new Scanner(System.in);
	int i= 0;
	int sum = 0;
	int count=0;
	do {
		
	System.out.println("toplama yapmak için bir sayý giriniz. Ýþlemi bitirmek için '0' syýsýný giriniz");	
	i = scan.nextInt();
	count++;
	sum=sum+i;
	
	}while(i!=0);
	
	count = count-1;
		
		System.out.println("Girdiðiniz "+ count+ " adet sayýnýn toplamý = "+ sum);
		
	scan.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
