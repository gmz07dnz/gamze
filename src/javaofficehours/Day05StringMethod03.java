package javaofficehours;

import java.util.Scanner;

public class Day05StringMethod03 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan al�nacak c�mle i�erisinde sececegimiz bir harfin kac kere gecti�ini bulal�m
		 * 
		 * �rnek:
		 * bug�n hava cok s�cak == a   return -> 3
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir c�mle giriniz");
		String c�mle = scan.nextLine().toLowerCase();
		System.out.println("Tekrar� bulunacak harfi giriniz");
	//	char harf = scan.nextLine().toLowerCase().charAt(0);
		String harf = scan.nextLine().toLowerCase().substring(0, 1);
		
		int count = 0;
//		
//		for(int i = 0 ; i<c�mle.length(); i++) {
//			if(c�mle.charAt(i)==harf) {
//				count++;
//			}
//		}
//		System.out.println("Girdi�iniz c�mlede "+ harf +" harfi "+ count + " kere geciyor.");
		
		for(int i = 0 ; i<c�mle.length(); i++) {
			if(c�mle.substring(i, i+1).equals(harf)) {
				count++;
			}
			
		}
		System.out.println("Girdi�iniz c�mlede "+ harf +" harfi "+ count + " kere geciyor.");
	
		scan.close();
	
	}

}
