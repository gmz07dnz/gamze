package javaofficehours;

import java.util.Scanner;

public class Day06For02 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan 2 say� alalim
		 * 1.say� taban olsun
		 * 2.say� �st
		  
		 *1.say�n�n �ss�n� hesaplayal�m
		 *2 3 = 2*2*2 =8
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("�sl� say�n�n taban�n� giriniz");
		int taban = scan.nextInt();
		
		System.out.println("�sl� say�n�n �ss�n� giriniz");
		int �st= scan.nextInt();
		
		long result=1;   // �sl� say� oldugu i�in sonuc cok b�y�k olabilir.
		int i =0;
		
			
		while (i!=�st) {
			result*=taban;
			i++;
			}
		
	
		System.out.println("sonuc: "+result);
		 result =1;
		
		 // 2.yol
		 
		for (int k = 0 ; k<�st ; k++) {
			result*=taban;
			
		}
		System.out.println("sonuc: "+result);
		
		result = 1;
		
		
		// 3.yol
		
		result = (long) Math.pow(taban, �st);
		System.out.println("sonuc: "+result);
		
		
		scan.close();
	}

}
