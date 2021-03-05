package day10stringmethods;

import java.util.Scanner;

public class StringOdev05 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter an integer, 
		 * if it is less than 10, calculate its square and print it on the console. 
		 * If it is greater than 10 multiply it by 2 and print
		 * it on the console. 
		 */

	
	// 1.Ask user to enter an integer
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen bir integer giriniz");
		int s = scan.nextInt();
		
	// if it is less than 10, calculate its square and print it on the console.	
	// If it is greater than 10 multiply it by 2 and print it on the console.	
	//	Otherwise keep the number same and print it on the console.
		
	
	if (s<10) {
		System.out.println(s*s);
	} else if(s>10) {
		System.out.println(s*2);
	}else {
		System.out.println(s);
	}
	
	
	
	scan.close();
	
	
	
	
	
	
	
	}

}
