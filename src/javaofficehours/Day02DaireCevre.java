package javaofficehours;

import java.util.Scanner;

public class Day02DaireCevre {

	public static void main(String[] args) {

		/*
		 * Yaricapi girilen bir dairenin cevresini hesaplayalim.
		 * 
		 * FORMUL: 2xpixr pi=3.14
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Cevresini hesaplamak icin dairenin yaricapini giriniz");
		double daireYaricap= scan.nextDouble();
		
		double daireCevre= 2*3.14*daireYaricap;
		
		System.out.println("Dairenin cevresi: "+ daireCevre);
		
		
	scan.close();	
	}

}
