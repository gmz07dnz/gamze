package javapractice;

import java.util.Scanner;

public class Day01Soru05 {

	public static void main(String[] args) {
		
		
		/*
		 * Kullan�c�ya gunde kac sa uyudugunu sorun
		 * Ayda, y�lda ve 40 y�lda kac gununun uykuda gect�g�n� yazd�r�n
		 * 
		 * �nput 8 sa
		 * output: Ayda 10, yilda 121, 40 y�lda 4866 gununuz uykuda geciyor
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("G�nde kac sa uyuyorsunuz");
	    int sa = scan.nextInt();
	    
	    // ayda
	    int ayda = 30*sa;
	    
	    // y�lda
	    int yil = 365*sa;
	
	    // 40 y�lda
	    
	    int k�rkY�l = 365*40*sa;
	    
	    System.out.println(" Ayda "+ayda+", yilda "+yil+", 40 y�lda "+ k�rkY�l+" g�n�n�z uykuda ge�iyor.");
	
	
	scan.close();
	
	
	
	}

}
