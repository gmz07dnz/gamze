package day20multidimensionalarraysarraylists;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewSorusu {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan bir string al�n�z.
		 * bu stringde kullan�lan t�m harflerin karakterlerin say�s�n�n ekrana yazd�r�n 
	       �rn ==> Alacan ==> A:1 ,l=1, a =2 , n=2
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir string giriniz");
	String s = scan.nextLine();
	
	// �nce split() yap�yoruz
	String ch[] = s.split("");
	
	System.out.println(Arrays.toString(ch));
	
	// sort()
	Arrays.sort(ch);
System.out.println(Arrays.toString(ch));
	
	
	// counter olustural�m
    int counter = 0;
	
	for ( int i = 1 ; i<ch.length; i++) {
		
		if (ch[i].equals(ch[i-1])) {
			counter++;
			}else {
				System.out.println(ch[i-1] +"'in say�s�: " + (counter+1));
				counter= 0;
			}
		if(i==ch.length-1) {
			System.out.println(ch[i] +"'in say�s�: " + (counter+1));
		}
	}
    
    
    
    scan.close();
    
    
    
    
	
	}

}
