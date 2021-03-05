package ifelsesoru;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {

/*
 Kullanıcıdan iki sayı alın eğer sayıların işaretleri aynı ise ekrana “Aynı işaretli” yazdırın.
Sayıların işaretleri farklı ise ekrana “Farklı işaretli” yazdırın.
 */
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen iki sayi giriniz");
	int num1 = scan.nextInt();
	int num2= scan.nextInt();
	
	if((num1>0 && num2>0) || (num1<0 && num2<0)) {
		System.out.println("Ayni işaretli");
	}
		
	else {
		System.out.println("Farkli işaretli");
	}
scan.close();
	}

}
