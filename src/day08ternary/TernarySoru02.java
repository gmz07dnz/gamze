package day08ternary;

import java.util.Scanner;

public class TernarySoru02 {

	public static void main(String[] args) {
		
	/*
	Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n 
	e�er iki kenar uzunlu�u birbirine e�it ise ekrana
    �Ikizkenar Ucgen� yazd�r�n. Di�er durumlarda ekrana �Ikizkenar de�il� yazd�r�n.
	*/

	// If ile 	
		
/*	Scanner scan = new Scanner(System.in);
	System.out.println("��genin kenar uzunluklar�n� giriniz");
	int k1 = scan.nextInt();
	int k2 = scan.nextInt();
	int k3 = scan.nextInt();
	
	if(k1 == k2 || k2==k3 || k1 == k3) {
		System.out.println("�kizkenar ��gen");
	}else
		System.out.println("�kizkenar De�il");
	
*/
		
// ternary ile

		
		Scanner scan = new Scanner(System.in);
		System.out.println("��genin kenar uzunluklar�n� giriniz");
		int k1 = scan.nextInt();
		int k2 = scan.nextInt();
		int k3 = scan.nextInt();
				
	String result = k1 == k2 || k2 == k3 || k1 == k3 ? 	"�kizkenar ��gen" : "�kizkenar De�il" ;
		
		System.out.println(result);
		
		scan.close();
		
		
	}

}
