package ifelsesoru;

import java.util.Scanner;

public class IfElse06 {

 public static void main(String[] args) {

/*
Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn 
eðer üç kenar uzunluðu birbirine eþit ise ekrana
“Eþkenar üçgen” yazdýrýn. 
Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn.	
 */
	
	
Scanner scan = new Scanner(System.in);

System.out.println("üçgenin üç kenar uzunluðunu giriniz");
int kenar1 = scan.nextInt();
int kenar2= scan.nextInt();
int kenar3= scan.nextInt();

if ((kenar1 == kenar2) && (kenar2 == kenar3) && (kenar1 == kenar3)) {
	
	System.out.println("Eþkenar üçgen");
}
else {
	System.out.println("Eþkenar Degil");
}
	scan.close();
 }	
	
}
