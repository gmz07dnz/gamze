package ifelseifsoru;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		
	/*
    Kullanýcýdan bir harf girmesini isteyin.
    Girdiði küçük harf ise harfin “a” olup olmadýðýný kontrol edin. 
    Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn.
    “a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn.
    Girdiði büyük harf ise harfin “Z” olup olmadýðýný kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdýrýn.
   “Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn.	
	 */
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen bir harf giriniz");
	char ch = scan.next().charAt(0);
	

	
if((ch<='z') && (ch>='a')){
  if (ch=='a') {
	  System.out.println("Ilk küçük harf");
  }else
	  System.out.println("Ilk küçük harf deðil");
} if (ch<='Z' && ch>='A' ) {
	if (ch == 'Z') {
		System.out.println("Son büyük harf");
	}else 
		System.out.println("Son büyük harf deðil");
}
		
	scan.close();	

	}

}
