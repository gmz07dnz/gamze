package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//kullan�c�dan al�nan bir say�n� k�p�n� bulunuz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir tamsay� giriniz.");
		int tamSayi = scan.nextInt(); // 5
		System.out.println(tamSayi*tamSayi*tamSayi);// 5*5*5 =125

		
		scan.close();
	}

}
