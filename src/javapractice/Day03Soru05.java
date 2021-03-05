package javapractice;

import java.util.Scanner;

public class Day03Soru05 {

	public static void main(String[] args) {
		

		/*
		 * Bir say�n�n m�kemmel olup olmad���n� bulan bir program yaz�n�z. 
		 * M�kemmel say� : bir say�n�n kendisi hari� b�lenlerinin toplam�, kendisine e�itse o say�
		 * m�kemmeldir. ORNEK: INPUT : 6 OUTPUT : 1,2,3 1+2+3 = 6 = 6 (M�kemmel)
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("m�kemmel say� olup olmad�g�n� kontrol etmek i�in bir say� giriniz ");
		int num = scan.nextInt();
		
		int bolenlerintoplam� = 0;
		
		for (int i= 1 ; i<num ; i++) {
			if (num%i == 0) {
				bolenlerintoplam� = bolenlerintoplam�+i;
			}
		}
		
		if (bolenlerintoplam� == num) {
			System.out.println(num + " say�s� m�kemmel say�d�r.");
		}else {
			System.out.println(num + " say�s� m�kemmel say� de�ildir.");
		}
		
		
	scan.close();	
	}

}
