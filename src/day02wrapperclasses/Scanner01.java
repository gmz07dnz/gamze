package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {
	
	public static void main(String[] args) {
		
	// kullan�c� iki tam say� versin. // kullan�c�dan say� alacaksak Scanner kal�b�n� kullan�yoruz.
	//program bu tamsay�lar�n toplam�n� ve carp�m�n� ekrana yazd�rs�n.
		
	Scanner scan = new Scanner(System.in); // scanner class�n� import ediyoruz.
		
	System.out.println("L�tfen iki tam say� yaz�n�z."); // kullan�c�ya talimat vermem laz�m ne yapmas�n�
		                                                     //bilmesi i�in
	 
	// variable olu�turuyorum.��nk� kullan�c� bana say� verdi�inde container a alaca��m.
	//2 say� istedik. 2 variable (container)
		
   int num1 = scan.nextInt(); // 5 ==> nextInt() bu method yaz�lan 5 say�s�n� yakalar num1 container'�na koyar.
   int num2 = scan.nextInt(); //3
	
  System.out.println(num1 +  num2 ); // 5 + 3 = 8
  System.out.println(num1 * num2); // 5 * 3 =15
	
	
	scan.close();	
	
	
	
		
		
	}

}
