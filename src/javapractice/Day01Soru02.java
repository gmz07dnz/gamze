package javapractice;

import java.util.Scanner;

public class Day01Soru02 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan bir character girmesini isteyin ve girilen karakteri ve ascii
		 * degerini yazin
		 * 
		 * Ornek : Input : a Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
		 * 
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("bir character giriniz");
	char ch = scan.next().charAt(0); // String gibi yazýp ilk index'i alýyoruz.
	
//	int chAscii = ch; 
//	System.out.println(ch+0);
	
	int asciiValue = ch;
	System.out.println("Girdiðiniz "+"'"+ch+"'"+ " karakterinin ascii degeri: " +asciiValue);
	
	scan.close();
	}
}
