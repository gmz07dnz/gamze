package javapractice;

import java.util.Scanner;

public class Day01Soru01 {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir tamsay� girmesini isteyin ve say�y� kendisinden bir k���k say� ve bir b�y�k say� ile carp�p yazd�r.
		 * 
		 * �rnek:
		 * input: 10
		 * Output: 990 (9*10*11)
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("Bir tam say� giriniz");
	int num = scan.nextInt();
	
	int result = (num-1)*num*(num+1);
	System.out.println(result+ " " + "("+(num-1)+"*"+num+"*"+(num+1)+")");
		
		
		
	scan.close();	
		
	}

}
