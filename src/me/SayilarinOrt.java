package me;

import java.util.Scanner;

public class SayilarinOrt {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan (negatif bir say� girinceye kadar) pozitif say�lar alarak bu
		 * say�lar�n ortalamas�n� ekrana yazd�ran bir program yaz�n�z.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int i ;
		int average = 0;
		int counter=0;
		
		do {
			System.out.println("Ortalamas�n� hesaplamak i�in say� giriniz.\nNegatif bir say� girdi�inizde i�lem sona erecektir." );
		    i = scan.nextInt();
		    if(i>=0) {
		    counter++;
		    average = (average+i)/counter;}
		     
		}while (i>=0);
		
		System.out.println(counter + " adet sayi girdiniz.");
		System.out.println("Girilen say�lar�n ortalamas�: "+ average);
		
		scan.close();
		
		
		

	}

}
