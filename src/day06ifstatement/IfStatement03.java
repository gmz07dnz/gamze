package day06ifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/* Kullan�c�dan bir karakter al�n.
		 bu character b�y�k harf ise "B�y�k Harf " yazdirin.
		 bu character k���k harf ise "K���k Harf" yazdirin.
		 bu character harf de�il ise "Harf De�il " yazdirin
		 
		 */
	
Scanner scan = new Scanner(System.in);
System.out.println("L�tfen bir karakter giriniz.");
char ch = scan.next().charAt(0);

if(ch>='A' && ch<= 'Z') {
	System.out.println("B�y�k Harf");
}
	
if(ch>='a' && ch<= 'z')	{
	System.out.println("K���k Harf");
}
	
if(!(ch>='A' && ch<= 'Z') && !(ch>='a' && ch<= 'z')){
System.out.println("Harf Degil");

	}
	
	scan.close();
	
/*
 Logical Operator
 1) and i�lemi : Sembol� & veya &&dir. && sembol� daha h�zl� �al���r. Bu y�zden genellikle && kullan�r�z.

 true && true = true
 true && false = false
 false && true = false
 false && false = false
 
 2) Or ��lemi :|| Sembol� 
 
 true  || false = true
 false || true = true
 true  || true = true
 false || false = false
 
 3) not i�lemi : Sembol� ! dur.
    !true = false
 
 */
	
	
	
	
	
	}	

}
