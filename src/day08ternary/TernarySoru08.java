package day08ternary;

import java.util.Scanner;

public class TernarySoru08 {

	public static void main(String[] args) {
		
	/*
	Kullanýcýdan bir tamsayý girmesini isteyin, ekrana o tamsayýnýn mutlak degerini yazdýrýn.	 
	 */
		
		
Scanner scan = new Scanner(System.in);
System.out.println("Bir tam sayi giriniz");
int s = scan.nextInt();

// if else ile

if (s>0) {
	System.out.println("Girdiginiz "+s +" sayýsýnýn mutlak degeri: "+ s);
}else {
	System.out.println("Girdiginiz "+s +" sayýsýnýn mutlak degeri: "+(- s));
}
		
		
// ternary ile

System.out.println(s>0 ? "Girdiginiz "+s +" sayýsýnýn mutlak degeri: "+ s : "Girdiginiz "+s +" sayýsýnýn mutlak degeri: "+(- s));
scan.close();

		
	}

}
