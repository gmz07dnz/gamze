package day06ifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {

  /* 
   Kullanicidan bir sayi alin bu sayi �ift sayi ise console'a "�ift " 
   tek sayi ise console'a "tek" yazdirin.
   */
		
	Scanner scan = new Scanner(System.in);
	System.out.println("l�tfen bir tam sayi giriniz");
	
	int num = scan.nextInt();
	
	System.out.println(num);
		
	if(num%2==0) {
		System.out.println(num + " sayisi �ifttir");
		
	}
		
	if(num%2 != 0)	{
		System.out.println(num + " sayisi tektir.");
	
		scan.close();
	
	
	}
	
	
		
		
		
		
		
		

	}

}
