package javaofficehours;

import java.util.Scanner;

public class Day03IfElse04 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan 3 tane pozitif tam sayi alalim
		 * 
		 * a+b > c >a-b 
		 * a+c > b > a-c
		 *  b+c > a > b-c Ucgen cizilebiliniz 
		 *  ! Ucgen cizilemez
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Üçgen cizebilmek için 1.kenar uzunlugunu giriniz");
		double num1 = scan.nextInt();	
		System.out.println("Üçgen cizebilmek için 2.kenar uzunlugunu giriniz");
		double num2 = scan.nextInt();
		System.out.println("Üçgen cizebilmek için 3.kenar uzunlugunu giriniz");
		double num3 = scan.nextInt();
		
		
		
		if((num1+num2>num3 && num1-num2<num3) && (num2+num3>num1 && num2-num3<num1) && (num1+num3>num2 &&num1-num3<num2)) {
			if (num1==num2 && num2==num3) {
			System.out.println("Eskenar ücgen cizilebilir");
			}else if(num1 == num2 || num2== num1 || num1==num3) {
				System.out.println("Ikizkenar ücgen cizilebilir");
			}else {
				System.out.println("Ucgen cizilebilir");
			}
		}else {
			System.out.println("Ucgen cizilemez");
		}
		
		
		scan.close();
		
		
	}

}
