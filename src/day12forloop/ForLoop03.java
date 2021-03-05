package day12forloop;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan bir sayi alin 
		 * o sayidan kucuk olan tum pozitif tek sayilari
		 * buyuktem kucuge dogru ayni satirda aralarina bosluk birakarak yazdirin
		 * 
		 */
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen bir tamsayý giriniz");
	
    int num = scan.nextInt();
    
    if (num<1) {
    	System.out.println("lütfen pozitif bir sayý giriniz");
    }else {
    	for (int i = num ; i>=1 ; i-- ) {
    		if(i%2 != 0) {
    			System.out.print(i + " ");
    		}
    	}
    }
		
	scan.close();	
		
		
	}

}
