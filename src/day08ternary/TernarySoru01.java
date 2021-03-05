package day08ternary;

import java.util.Scanner;

public class TernarySoru01 {
        public static void main(String[] args) {
	
      /*
       Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
       Diðer durumlarda ekrana “Negatif degil” yazdýrýn.
      */
	
	
	
	
	// if ile çözelim
        	
   /* Scanner scan = new Scanner(System.in);
    
    System.out.println("Bir Integer giriniz");
    
    int num = scan.nextInt();
    
    if(num == 0) {
		System.out.println("Nötr");}
	else if (num<0) {
    	System.out.println("Negatif");
    } else 
    	System.out.println("Negatif Deðil");
	
    scan.close(); */
	
	// ternary ile çözelim
    
 Scanner input = new Scanner(System.in);
    
    System.out.println("Bir sayi giriniz");
    
    int num1 = input.nextInt();
    
  String result = num1<0 ? "Negatif" : "Negatif Degil";
   
   System.out.println(result);
    
    input.close();
    
    	
}
}
