package javaofficehours;

import java.util.Scanner;

public class Day01D�rtIslem {

	public static void main(String[] args) {

		// kullanicidan 2 sayi alalim ve d�rt i�lem sonucunu ekrana yazdiralim.

		Scanner scan = new Scanner(System.in);
		System.out.println("D�rt i�lem yapmak i�in 1. say�y� giriniz");
		double num1 = scan.nextInt();
		System.out.println("D�rt i�lem yapmak i�in 2. say�y� giriniz");
		double num2 = scan.nextInt();
		
		
		System.out.println("num1+num2 = "+ (num1+num2));
		System.out.println("num1-num2 = "+ (num1-num2));
		System.out.println("num1*num2 = "+ (num1*num2));
		System.out.println("num1/num2 = "+ (num1/num2));
	
	
	scan.close();
	
	
	}

}
