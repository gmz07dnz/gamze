package day10stringmethods;

import java.util.Scanner;

public class StringOdev03 {

	public static void main(String[] args) {
		
		
		  /*
		   * Ask user to enter a String and output will be the number of the characters in the String.
		   */

		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a string");
	String s = scan.nextLine();
	
	s.length();
		
	System.out.println(s.length());	
		
	scan.close();	
		
	}

}
