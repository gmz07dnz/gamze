package ifelsesoru;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
	
/*
Kullanýcýdan cinsiyetini girmesini isteyin.
Erkek ise yaþýný kontrol edin. Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn.
Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn.
Kadin ise yasini kontrol edin. Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn.
Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn.
 */
		
   Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen Cinsiyetinizi giriniz");
	String cinsiyet = scan.next();
	System.out.println(cinsiyet);
	System.out.println("Lütfen yaþýnýzý giriniz");
	int age = scan.nextInt();
	System.out.println(age);

if(age<0) {
	System.out.println("Lütfen yaþýnýzý doðru giriniz");	
}else if (cinsiyet.equalsIgnoreCase("erkek")) {
	 if (age<18) {
		 System.out.println("Erkek Çocuk");
	 } else 
		 System.out.println("Adam");
 } else if (cinsiyet.equalsIgnoreCase("kadin")) {
if (age<18) {System.out.println("Kiz Çocuk");
 } else 
	 System.out.println("Kadin");
	 
scan.close();
	}
	}
}
