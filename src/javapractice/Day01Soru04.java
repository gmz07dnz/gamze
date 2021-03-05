package javapractice;

import java.util.Scanner;

public class Day01Soru04 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan 3 tamsayý alýn ve bu sayýlarýn ortalamasýný bulun.
		 *
		 *örnek:
		 *inputs :15,25,50
		 *outout: girdiðiniz 15,25 ve 50'nin ortalama degeri : 30
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Ortalamasýný almak için 1. tam sayýyý giriniz");
		double num1 = scan.nextInt();
		System.out.println("Ortalamasýný almak için 2. tam sayýyý giriniz");
		double num2 = scan.nextInt();
		System.out.println("Ortalamasýný almak için 3. tam sayýyý giriniz");
		double num3 = scan.nextInt();
	
	double average = (num1+num2+num3)/3;
	
	System.out.println("girdiðiniz "+num1+","+num2+","+num3+"'nin ortalama degeri : "+ average);
		
	scan.close();	
	
	}

}
