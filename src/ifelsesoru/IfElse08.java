package ifelsesoru;

import java.util.Scanner;

public class IfElse08 {

	public static void main(String[] args) {
		/*
		Kullan�c�dan bir character al�n e�er character bir harf ise ekrana �Harf� yazd�r�n.
        Di�er durumlarda ekrana �Harf de�il� yazd�r�n.
		 */
	
Scanner scan = new Scanner(System.in);
System.out.println("bir karakter giriniz");
char ch = scan.next().charAt(0);


if((ch>='a' && ch<= 'z') || (ch>='A' && ch<='Z')){
	
	System.out.println("Harf");
}
	
else {
	System.out.println("Harf De�il");
}

scan.close();
	
	
	
	
	
	
	}

}
