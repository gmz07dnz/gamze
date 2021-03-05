package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		// kullanýcý karenin bir kenarýný girsin.
		//karenin cevresini ve alanýný ekrana yazdýralým.
		// karenin çevresi a+a+a+ , alaný a*a
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen karenin bir kenar uzunluðunu giriniz.");
		
		// karenin bir kenar uzunluðu "a" olsun.
		
		int a = scan.nextInt(); // 5
		
		System.out.println(a+a+a+a); // 5+5+5+5 = 20
		System.out.println(a*a);// 5*5 =25
		
		scan.close();
	}

}
