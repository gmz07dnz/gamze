package day20multidimensionalarraysarraylists;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewSorusu {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan bir string alýnýz.
		 * bu stringde kullanýlan tüm harflerin karakterlerin sayýsýnýn ekrana yazdýrýn 
	       örn ==> Alacan ==> A:1 ,l=1, a =2 , n=2
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir string giriniz");
	String s = scan.nextLine();
	
	// önce split() yapýyoruz
	String ch[] = s.split("");
	
	System.out.println(Arrays.toString(ch));
	
	// sort()
	Arrays.sort(ch);
System.out.println(Arrays.toString(ch));
	
	
	// counter olusturalým
    int counter = 0;
	
	for ( int i = 1 ; i<ch.length; i++) {
		
		if (ch[i].equals(ch[i-1])) {
			counter++;
			}else {
				System.out.println(ch[i-1] +"'in sayýsý: " + (counter+1));
				counter= 0;
			}
		if(i==ch.length-1) {
			System.out.println(ch[i] +"'in sayýsý: " + (counter+1));
		}
	}
    
    
    
    scan.close();
    
    
    
    
	
	}

}
