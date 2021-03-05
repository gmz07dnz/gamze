package javapractice;

import java.util.Scanner;

public class Day03Soru04 {

	public static void main(String[] args) {
		
		
		/*
		 * SORU 4) Kullanicidan email girmesini isteyin,
		 * 
		 * @ isareti icermiyorsa “gecerli bir email girin” yazdirin
		 * 
		 * @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
		 * 
		 * @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa “Lutfen gmail
		 * hesabinizi girin” yazdirin ORNEK: INPUT : techproed.com OUTPUT : “gecerli bir
		 * email girin” INPUT : techproed@gmail.com OUTPUT : “email onaylandi” INPUT :
		 * techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin
		 * 
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("e-mail'inizi giriniz");
		
		String eMail = scan.nextLine();
		int no=eMail.indexOf("@");
		
		if (!(eMail.contains("@"))) {
			System.out.println("gecerli bir email girin");
		}else {
			if (eMail.substring(no+1).equalsIgnoreCase("gmail.com")) {
		
			System.out.println("email onaylandý");}
		else {
			System.out.println("Lutfen gmail hesabinizi girin");
		}
	
		}
		
	scan.close();
		
	}

}
