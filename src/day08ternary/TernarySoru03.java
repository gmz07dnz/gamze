package day08ternary;

import java.util.Scanner;

public class TernarySoru03 {

	public static void main(String[] args) {
		
	/*
	Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. 
	E�er urun miktar� 1000 den fazla ise kullan�c�ya %10 indirim yap�n.
	�demesi gereken toplam paray� ekrana yazd�r�n. 
	Di�er durumlarda �demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n.
 */
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("�r�n miktar�n� giriniz");
	int m = scan.nextInt();
	
	System.out.println("birim fiyat� giriniz");
	double f = scan.nextInt();
	
	double result = m>1000 ? f*m*9/10 : f*m;
		System.out.println(result);

	scan.close();
	
	}

}
