package day31exceptions;

import java.util.Scanner;

public class E07 {

	// IllegalArgumentException
	
	public static void main(String[] args) {
		
		int age = -23; // java g�nl�k hayat� bilmez exception atmaz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yas�n�z� giriniz");
		int yas = scan.nextInt();
		
		
		if (yas<0) {
			throw new IllegalArgumentException();
		}else {
			System.out.println(age);
		}
 
	}

}
