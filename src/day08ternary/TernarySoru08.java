package day08ternary;

import java.util.Scanner;

public class TernarySoru08 {

	public static void main(String[] args) {
		
	/*
	Kullan�c�dan bir tamsay� girmesini isteyin, ekrana o tamsay�n�n mutlak degerini yazd�r�n.	 
	 */
		
		
Scanner scan = new Scanner(System.in);
System.out.println("Bir tam sayi giriniz");
int s = scan.nextInt();

// if else ile

if (s>0) {
	System.out.println("Girdiginiz "+s +" say�s�n�n mutlak degeri: "+ s);
}else {
	System.out.println("Girdiginiz "+s +" say�s�n�n mutlak degeri: "+(- s));
}
		
		
// ternary ile

System.out.println(s>0 ? "Girdiginiz "+s +" say�s�n�n mutlak degeri: "+ s : "Girdiginiz "+s +" say�s�n�n mutlak degeri: "+(- s));
scan.close();

		
	}

}
