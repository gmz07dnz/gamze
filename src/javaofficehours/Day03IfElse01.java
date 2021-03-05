package javaofficehours;

import java.util.Scanner;

public class Day03IfElse01 {

	public static void main(String[] args) {

		// kullan�c�dan yas ve kilo bilgisini alal�m.
		// 18 yas�ndan kucuk ise "kan bagi�i yapamaz".
		// 18 yas�ndan buyuk ve 50 kg haf�f ise "kanbagi�i yapamaz"
		// 18 yas�ndan buyuk ve 50 kg ag�r ise "kan bagi�i yapabilir".

		Scanner scan = new Scanner(System.in);

		System.out.println("yas�n�z� giriniz");
		int yas = scan.nextInt();
		
		if(yas<18) {
			System.out.println("18 yas�ndan k�c�k olanlar kan bagisi yapamaz");
		}else {
		System.out.println("kilonuzu giriniz");
		double kilo = scan.nextDouble();
		
		if(kilo <50) {
			System.out.println("50 kilonun altinda olanlar kan bagisi yapamaz");
		}else {
			System.out.println("Kan bagisi yapabilir");
		}
		
		}
		
	
		// TERNARY ILE
		
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("yas�n�z� giriniz");
//		int yas = scan.nextInt();
//		System.out.println("kilonuzu giriniz");
//		double kilo = scan.nextDouble();
//		
//	String result=yas>18 ?kilo <50 ? "50 kilonun altinda olanlar kan bagisi yapamaz":"Kan bagisi yapabilir": "18 yas�ndan k�c�k olanlar kan bagisi yapamaz" :;
//		System.out.println(result);
//		
	
	
	
	scan.close();
	}

}
