package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {
		
 // kullan�c�dan ad ve soyad�n� alal�m ekrana yazd�ral�m
 // kullan�c�dan adresini alal�m ekrana yazd�ral�m.(2.cadde Bak�rk�y Istanbul T�rkiye)
 // kullan�c�dan ya��n� alal�m ekrana yazd�ral�m.
 //kullan�c�ya "T�rkiye'de ya��yorum diye soral�m cevab�n� ekrana yazd�ral�m.true veya false olarak
		
		
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("L�tfen ad ve soyad�n�z� giriniz.");
	String adSoyad = scan.nextLine();
	System.out.println(adSoyad); // gamze deniz
	
	System.out.println("l�tfen adresinizi yaz�n�z.");
	String adres = scan.nextLine();
	System.out.println(adres);
		
	System.out.println("L�tfen ya��n�z� giriniz");	
	int yas = scan.nextInt();
	System.out.println(yas);
	
	System.out.println("t�rkiye'de yas�yorum.true/false");
	boolean blTr = scan.nextBoolean();
	System.out.println(blTr);
		
	scan.close();	
		
		
	}

}
