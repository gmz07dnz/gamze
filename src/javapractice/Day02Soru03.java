package javapractice;

import java.util.Scanner;

public class Day02Soru03 {

	public static void main(String[] args) {


		/*
		 * Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin 
		 * Ornek : 
		 * Inputs : 853 Output : 
		 * Girdiginiz sayinin birler basamagi : 3 
		 * Girdiginiz sayinin onlar basamagi : 5 
		 * Girdiginiz sayinin yuzler basamagi : 8
		 */


		Scanner scan = new Scanner(System.in);
		System.out.println("3 basamaklý bir tam sayý giriniz");
	    int num = scan.nextInt();
	    
	    int birler = num%10;
	    int onlar = num/10;
	    onlar%=10;
	    int yüzler = num/100;
	    
	    System.out.println("Girdiginiz sayinin birler basamagi :"+ birler);
	    System.out.println("Girdiginiz sayinin onlar basamagi :"+ onlar);
	    System.out.println("Girdiginiz sayinin yüzler basamagi :"+ yüzler);
	
	
	scan.close();
	
	
	}

}
