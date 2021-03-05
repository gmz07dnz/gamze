package javapractice;

import java.util.Scanner;

public class Day01Soru01 {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir tamsayý girmesini isteyin ve sayýyý kendisinden bir küçük sayý ve bir büyük sayý ile carpýp yazdýr.
		 * 
		 * Örnek:
		 * input: 10
		 * Output: 990 (9*10*11)
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("Bir tam sayý giriniz");
	int num = scan.nextInt();
	
	int result = (num-1)*num*(num+1);
	System.out.println(result+ " " + "("+(num-1)+"*"+num+"*"+(num+1)+")");
		
		
		
	scan.close();	
		
	}

}
