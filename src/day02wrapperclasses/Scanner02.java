package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		// kullan�c� karenin bir kenar�n� girsin.
		//karenin cevresini ve alan�n� ekrana yazd�ral�m.
		// karenin �evresi a+a+a+ , alan� a*a
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("L�tfen karenin bir kenar uzunlu�unu giriniz.");
		
		// karenin bir kenar uzunlu�u "a" olsun.
		
		int a = scan.nextInt(); // 5
		
		System.out.println(a+a+a+a); // 5+5+5+5 = 20
		System.out.println(a*a);// 5*5 =25
		
		scan.close();
	}

}
