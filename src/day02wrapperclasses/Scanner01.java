package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {
	
	public static void main(String[] args) {
		
	// kullanýcý iki tam sayý versin. // kullanýcýdan sayý alacaksak Scanner kalýbýný kullanýyoruz.
	//program bu tamsayýlarýn toplamýný ve carpýmýný ekrana yazdýrsýn.
		
	Scanner scan = new Scanner(System.in); // scanner classýný import ediyoruz.
		
	System.out.println("Lütfen iki tam sayý yazýnýz."); // kullanýcýya talimat vermem lazým ne yapmasýný
		                                                     //bilmesi için
	 
	// variable oluþturuyorum.Çünkü kullanýcý bana sayý verdiðinde container a alacaðým.
	//2 sayý istedik. 2 variable (container)
		
   int num1 = scan.nextInt(); // 5 ==> nextInt() bu method yazýlan 5 sayýsýný yakalar num1 container'ýna koyar.
   int num2 = scan.nextInt(); //3
	
  System.out.println(num1 +  num2 ); // 5 + 3 = 8
  System.out.println(num1 * num2); // 5 * 3 =15
	
	
	scan.close();	
	
	
	
		
		
	}

}
