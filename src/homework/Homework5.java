package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		
	//  Mil�i kilometreye �eviren bir program yaz�n�z. (double kullan�n�z) Not 1: km = mile x 1.6	
		
	Scanner scan = new Scanner(System.in);	
	
	System.out.println("L�tfen �evirmek istedi�iniz kilometre miktar�n� giriniz"); // 8
	
	double km = scan.nextDouble();
	
	double mile = 1 / 1.6;
	 System.out.println(km * mile); // 5.0
	
	scan.close();	
		
		
	}

}
