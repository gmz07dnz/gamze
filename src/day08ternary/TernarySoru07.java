package day08ternary;

import java.util.Scanner;

public class TernarySoru07 {

	public static void main(String[] args) {
		
	/*
	 Kullan�c�dan iki tamsay� girmesini isteyin, ekrana her zaman b�y�k olan�n� yazd�r�n	
	 */
		
Scanner scan = new Scanner(System.in);
System.out.println("�ki tam sayi giriniz");
int s1 = scan.nextInt();
int s2 = scan.nextInt();

// if else ile

if (s1>s2) {
	System.out.println(s1);
}else {
	System.out.println(s2);
	}
		

// ternary ile

int result = s1>s2 ? s1:s2;

System.out.println(result);

scan.close();

	}

}
