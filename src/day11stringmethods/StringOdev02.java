package day11stringmethods;

import java.util.Scanner;

public class StringOdev02 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan kredi kart� numaras�n� al�n ve
		 * bu numaran�n ���nc�, d�rd�nc� ve sonuncu rakamlar�n� ekrana yazd�r�n.
		 */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("kredi kart� numaran�z� giriniz");
	String kartNo = scan.nextLine();
	
	
//	System.out.println("kart�n ���nc� rakam�: " + kartNo.charAt(2));
//	
//	System.out.println("kart�n d�rd�nc� rakam�: " + kartNo.charAt(3));
//	
//	System.out.println("kart�n son rakam�: " + kartNo.charAt(kartNo.length()-1));
	
	
	
System.out.println (("kart�n ���nc� rakam�: " + kartNo.charAt(2)) +"\n" + ("kart�n d�rd�nc� rakam�: " + kartNo.charAt(3)) +"\n"
		+("kart�n son rakam�: " + kartNo.charAt(kartNo.length()-1)));
	scan.close();
	}

}
