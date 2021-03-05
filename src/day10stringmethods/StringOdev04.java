package day10stringmethods;

import java.util.Scanner;

public class StringOdev04 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter password, 
		 * if the password is okay for the following conditions 
		 * output will be “Your password is created successfully.”
		 * If the password is not okay for any of the following conditions 
		 * Output will be “Enter a new password according to the give conditions” 
		 * 1.First letter must be uppercase 
		 * 2.Last letter must be lowercase 
		 * 3.Password must contain 6 characters
		 */

		
	// 1. Ask user to enter password	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a password");
		
		String pwd = scan.nextLine();
		

	
	if ((pwd.length() == 6 ) && (pwd.charAt(0)<='Z' && pwd.charAt(0)>='A' ) &&
			     (pwd.charAt(pwd.length()-1)<='z' && pwd.charAt(pwd.length()-1)>='a' )) {
		
		System.out.println("Your password is created successfully.");
	}else {
		System.out.println("Enter a new password according to the give conditions");
	}
	
	
	
	scan.close();
	
	
	}

}
