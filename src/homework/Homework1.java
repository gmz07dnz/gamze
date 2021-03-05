package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		//Kullanicidan alýnan bir sayýnýn küpünü hesaplayan bir program yazýnýz.  Not: a’ nýn küpü: a x a x a
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen küp'ün bir kenarýný giriniz");
		
	double kenar = scan.nextDouble();
	
	System.out.println(kenar); // 3.1
		
	System.out.println("Alan = " + kenar*kenar*kenar); // 29.791
	
	scan.close();
		
		
		}
	
	
	
	
	
}
