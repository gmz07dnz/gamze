package javaofficehours;

import java.util.Scanner;

public class Day03Ifelse03 {

	public static void main(String[] args) {
		
		// kullan�c�dan 2 tam say� al�n ve bunlar�n kend� aralar�ndaki durumu kars�last�ral�m.
				
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
		System.out.println("Karsilast�rma yapmak i�in 1. say�y� giriniz");
		int num1 = scan.nextInt();
		System.out.println("Karsilast�rma yapmak i�in 2. say�y� giriniz");
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
