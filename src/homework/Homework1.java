package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		//Kullanicidan al�nan bir say�n�n k�p�n� hesaplayan bir program yaz�n�z.  Not: a� n�n k�p�: a x a x a
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("L�tfen k�p'�n bir kenar�n� giriniz");
		
	double kenar = scan.nextDouble();
	
	System.out.println(kenar); // 3.1
		
	System.out.println("Alan = " + kenar*kenar*kenar); // 29.791
	
	scan.close();
		
		
		}
	
	
	
	
	
}
