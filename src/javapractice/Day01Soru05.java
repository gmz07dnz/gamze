package javapractice;

import java.util.Scanner;

public class Day01Soru05 {

	public static void main(String[] args) {
		
		
		/*
		 * Kullanýcýya gunde kac sa uyudugunu sorun
		 * Ayda, yýlda ve 40 yýlda kac gununun uykuda gectýgýný yazdýrýn
		 * 
		 * ýnput 8 sa
		 * output: Ayda 10, yilda 121, 40 yýlda 4866 gununuz uykuda geciyor
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Günde kac sa uyuyorsunuz");
	    int sa = scan.nextInt();
	    
	    // ayda
	    int ayda = 30*sa;
	    
	    // yýlda
	    int yil = 365*sa;
	
	    // 40 yýlda
	    
	    int kýrkYýl = 365*40*sa;
	    
	    System.out.println(" Ayda "+ayda+", yilda "+yil+", 40 yýlda "+ kýrkYýl+" gününüz uykuda geçiyor.");
	
	
	scan.close();
	
	
	
	}

}
