package javapractice;

import java.util.Scanner;

public class Day01Soru04 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan 3 tamsay� al�n ve bu say�lar�n ortalamas�n� bulun.
		 *
		 *�rnek:
		 *inputs :15,25,50
		 *outout: girdi�iniz 15,25 ve 50'nin ortalama degeri : 30
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Ortalamas�n� almak i�in 1. tam say�y� giriniz");
		double num1 = scan.nextInt();
		System.out.println("Ortalamas�n� almak i�in 2. tam say�y� giriniz");
		double num2 = scan.nextInt();
		System.out.println("Ortalamas�n� almak i�in 3. tam say�y� giriniz");
		double num3 = scan.nextInt();
	
	double average = (num1+num2+num3)/3;
	
	System.out.println("girdi�iniz "+num1+","+num2+","+num3+"'nin ortalama degeri : "+ average);
		
	scan.close();	
	
	}

}
