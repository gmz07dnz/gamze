package day06ifstatement;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		
	/*
	 Kullanicidan bir tamsayi alin ve o tamsayini mutlak degerini ekrana yazdirin.
	a>=0 ==> Mutlak Deger = a    a<0 ==> Mutlak Deger = -a
	 	
	 */
		
	Scanner scan = new Scanner(System.in);
	System.out.println("L?tfen bir integer giriniz");
	int a = scan.nextInt();	
		
	if(a >=0) {
		System.out.println(a);
	}
	else {
		System.out.println(-a);
	}
		
	scan.close();	

	}

}
