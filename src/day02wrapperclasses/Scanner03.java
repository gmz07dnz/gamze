package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//kullanýcýdan alýnan bir sayýný küpünü bulunuz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir tamsayý giriniz.");
		int tamSayi = scan.nextInt(); // 5
		System.out.println(tamSayi*tamSayi*tamSayi);// 5*5*5 =125

		
		scan.close();
	}

}
