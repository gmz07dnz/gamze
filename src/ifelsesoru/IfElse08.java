package ifelsesoru;

import java.util.Scanner;

public class IfElse08 {

	public static void main(String[] args) {
		/*
		Kullanýcýdan bir character alýn eðer character bir harf ise ekrana “Harf” yazdýrýn.
        Diðer durumlarda ekrana “Harf deðil” yazdýrýn.
		 */
	
Scanner scan = new Scanner(System.in);
System.out.println("bir karakter giriniz");
char ch = scan.next().charAt(0);


if((ch>='a' && ch<= 'z') || (ch>='A' && ch<='Z')){
	
	System.out.println("Harf");
}
	
else {
	System.out.println("Harf Deðil");
}

scan.close();
	
	
	
	
	
	
	}

}
