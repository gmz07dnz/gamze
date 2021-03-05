package day06ifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {

  /* 
   Kullanicidan bir sayi alin bu sayi çift sayi ise console'a "Çift " 
   tek sayi ise console'a "tek" yazdirin.
   */
		
	Scanner scan = new Scanner(System.in);
	System.out.println("lütfen bir tam sayi giriniz");
	
	int num = scan.nextInt();
	
	System.out.println(num);
		
	if(num%2==0) {
		System.out.println(num + " sayisi çifttir");
		
	}
		
	if(num%2 != 0)	{
		System.out.println(num + " sayisi tektir.");
	
		scan.close();
	
	
	}
	
	
		
		
		
		
		
		

	}

}
