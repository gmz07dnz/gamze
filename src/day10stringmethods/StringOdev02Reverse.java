package day10stringmethods;

import java.util.Scanner;

public class StringOdev02Reverse {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter a word which has 4 letters and output will be inverse of the word.
		 * For example; if user enters "MARK" output will be "KRAM"
		 */

		
//	Scanner scan = new Scanner(System.in);	
//		
//	System.out.println("write a word which has 4 letters");	
//		
//	String w = scan.next().toLowerCase();
//	
//  if(w.length()==4) {
//	  System.out.println(w.charAt(3) +""+ w.charAt(2) +""+ w.charAt(1) +""+ w.charAt(0));
//  }else {
//	  System.out.println("you entered word which hasn't 4 letters");
//  }
	  
	
  // for loop ile
  
		Scanner scan = new Scanner(System.in);	
    	System.out.println("write a word which has 4 letters");	
	
    	String w = scan.next().toLowerCase();
		
		
    	if (w.length() == 4 ) {
		for (int i = w.length()-1; i>=0 ; i--) {
			System.out.print(w.charAt(i));
		}
    	}else {
    		System.out.println(" Please write a word which has 4 letters");
    	}
  
	scan.close();
		
	}

}
