package day11stringmethods;

import java.util.Scanner;

public class StringOdev02 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan kredi kartý numarasýný alýn ve
		 * bu numaranýn üçüncü, dördüncü ve sonuncu rakamlarýný ekrana yazdýrýn.
		 */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("kredi kartý numaranýzý giriniz");
	String kartNo = scan.nextLine();
	
	
//	System.out.println("kartýn üçüncü rakamý: " + kartNo.charAt(2));
//	
//	System.out.println("kartýn dördüncü rakamý: " + kartNo.charAt(3));
//	
//	System.out.println("kartýn son rakamý: " + kartNo.charAt(kartNo.length()-1));
	
	
	
System.out.println (("kartýn üçüncü rakamý: " + kartNo.charAt(2)) +"\n" + ("kartýn dördüncü rakamý: " + kartNo.charAt(3)) +"\n"
		+("kartýn son rakamý: " + kartNo.charAt(kartNo.length()-1)));
	scan.close();
	}

}
