package javaofficehours;

import java.util.Scanner;

public class Day01DörtIslem {

	public static void main(String[] args) {

		// kullanicidan 2 sayi alalim ve dört iþlem sonucunu ekrana yazdiralim.

		Scanner scan = new Scanner(System.in);
		System.out.println("Dört iþlem yapmak için 1. sayýyý giriniz");
		double num1 = scan.nextInt();
		System.out.println("Dört iþlem yapmak için 2. sayýyý giriniz");
		double num2 = scan.nextInt();
		
		
		System.out.println("num1+num2 = "+ (num1+num2));
		System.out.println("num1-num2 = "+ (num1-num2));
		System.out.println("num1*num2 = "+ (num1*num2));
		System.out.println("num1/num2 = "+ (num1/num2));
	
	
	scan.close();
	
	
	}

}
