package javaofficehours;

import java.util.Scanner;

public class Day03Ifelse03 {

	public static void main(String[] args) {
		
		// kullanıcıdan 2 tam sayı alın ve bunların kendı aralarındaki durumu karsılastıralım.
				
		        /*
				 * 24 30 --> 
				 * 24<30 24!=30 24<=30
				 * num1>num2
				 * num1<num2
				 * num1=num2
				 * num1!=num2
				 * num1>=num2
				 * num1<=num2
				 */
	
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Karsilastırma yapmak için 1. sayıyı giriniz");
		int num1 = scan.nextInt();
		System.out.println("Karsilastırma yapmak için 2. sayıyı giriniz");
		int num2 = scan.nextInt();
	
		
		if (num1>num2) {
			System.out.println(num1+ ">"+num2);
			}
	
		if (num1<num2) {
			System.out.println(num1+ "<"+num2);
			}
		
		if (num1==num2) {
			System.out.println(num1+ "="+num2);
			}
		
		if (num1!=num2) {
			System.out.println(num1+ "!="+num2);
			}
		if (num1>=num2) {
			System.out.println(num1+ ">="+num2);
			}
		
		if (num1<=num2) {
			System.out.println(num1+ "<="+num2);
			}
	
	scan.close();
	
	
	
	}

}
