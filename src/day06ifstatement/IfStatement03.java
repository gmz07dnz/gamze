package day06ifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/* Kullanýcýdan bir karakter alýn.
		 bu character büyük harf ise "Büyük Harf " yazdirin.
		 bu character küçük harf ise "Küçük Harf" yazdirin.
		 bu character harf deðil ise "Harf Deðil " yazdirin
		 
		 */
	
Scanner scan = new Scanner(System.in);
System.out.println("Lütfen bir karakter giriniz.");
char ch = scan.next().charAt(0);

if(ch>='A' && ch<= 'Z') {
	System.out.println("Büyük Harf");
}
	
if(ch>='a' && ch<= 'z')	{
	System.out.println("Küçük Harf");
}
	
if(!(ch>='A' && ch<= 'Z') && !(ch>='a' && ch<= 'z')){
System.out.println("Harf Degil");

	}
	
	scan.close();
	
/*
 Logical Operator
 1) and iþlemi : Sembolü & veya &&dir. && sembolü daha hýzlý çalýþýr. Bu yüzden genellikle && kullanýrýz.

 true && true = true
 true && false = false
 false && true = false
 false && false = false
 
 2) Or Ýþlemi :|| Sembolü 
 
 true  || false = true
 false || true = true
 true  || true = true
 false || false = false
 
 3) not iþlemi : Sembolü ! dur.
    !true = false
 
 */
	
	
	
	
	
	}	

}
