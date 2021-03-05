package day10stringmethods;

import java.util.Scanner;

public class StringOdev06 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter his kid’s name, 
		 * if the name contains “a” output will be “This name contains ‘a’.” 
		 * if the name contains “z” output will be “This name contains ‘z’.” 
		 * Otherwise, output will be “This name contains neither ‘a’ nor ‘z’. 
		 */


		
		Scanner scan = new Scanner(System.in);
		System.out.println("cocugunuzun ismini giriniz");
		String s = scan.nextLine().toLowerCase();
		
		if (!(s.contains("a") || s.contains("z"))) {
			System.out.println("This name contains neither a nor z");
		}
			else if (s.contains("a")) {
			System.out.println("This name contains a " );
	   }
		if (s.contains("z")){
			System.out.println("This name contains z ");
		} 
		
		
		
		
	scan.close();
	
	
	}

}
