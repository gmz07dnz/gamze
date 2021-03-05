package javaofficehours;

import java.util.Scanner;

public class Day02Scanner01 {

	public static void main(String[] args) {
		
		/*
		 * ögrenciden final,vize,proje notunu alalým.Yýlsonu notunu yazdýralým
		 * final%50,vize%30,proje%20
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Final notunuzu giriniz");
		double fnl = scan.nextDouble();
		System.out.println("Vize notunuzu giriniz");
		double vize = scan.nextDouble();
		System.out.println("Proje notunuzu giriniz");
		double proje = scan.nextDouble();
		
		double yilSonuNot= (fnl*50/100)+(vize*30/100)+(proje*20/100);
		
		System.out.println("Yil Sonu Notunuz: "+ yilSonuNot);
		
		
		scan.close();
	}

}
