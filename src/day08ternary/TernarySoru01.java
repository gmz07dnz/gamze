package day08ternary;

import java.util.Scanner;

public class TernarySoru01 {
        public static void main(String[] args) {
	
      /*
       Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
       Di�er durumlarda ekrana �Negatif degil� yazd�r�n.
      */
	
	
	
	
	// if ile ��zelim
        	
   /* Scanner scan = new Scanner(System.in);
    
    System.out.println("Bir Integer giriniz");
    
    int num = scan.nextInt();
    
    if(num == 0) {
		System.out.println("N�tr");}
	else if (num<0) {
    	System.out.println("Negatif");
    } else 
    	System.out.println("Negatif De�il");
	
    scan.close(); */
	
	// ternary ile ��zelim
    
 Scanner input = new Scanner(System.in);
    
    System.out.println("Bir sayi giriniz");
    
    int num1 = input.nextInt();
    
  String result = num1<0 ? "Negatif" : "Negatif Degil";
   
   System.out.println(result);
    
    input.close();
    
    	
}
}
