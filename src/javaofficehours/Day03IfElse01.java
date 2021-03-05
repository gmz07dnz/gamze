package javaofficehours;

import java.util.Scanner;

public class Day03IfElse01 {

	public static void main(String[] args) {

		// kullanýcýdan yas ve kilo bilgisini alalým.
		// 18 yasýndan kucuk ise "kan bagiþi yapamaz".
		// 18 yasýndan buyuk ve 50 kg hafýf ise "kanbagiþi yapamaz"
		// 18 yasýndan buyuk ve 50 kg agýr ise "kan bagiþi yapabilir".

		Scanner scan = new Scanner(System.in);

		System.out.println("yasýnýzý giriniz");
		int yas = scan.nextInt();
		
		if(yas<18) {
			System.out.println("18 yasýndan kücük olanlar kan bagisi yapamaz");
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
//		System.out.println("yasýnýzý giriniz");
//		int yas = scan.nextInt();
//		System.out.println("kilonuzu giriniz");
//		double kilo = scan.nextDouble();
//		
//	String result=yas>18 ?kilo <50 ? "50 kilonun altinda olanlar kan bagisi yapamaz":"Kan bagisi yapabilir": "18 yasýndan kücük olanlar kan bagisi yapamaz" :;
//		System.out.println(result);
//		
	
	
	
	scan.close();
	}

}
