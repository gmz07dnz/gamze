package javapractice;

import java.util.Scanner;

public class Day03Soru05DoWhile {

	public static void main(String[] args) {
		
		/*
		 * Bir say�n�n m�kemmel olup olmad���n� bulan bir program yaz�n�z. M�kemmel say�
		 * : bir say�n�n kendisi hari� b�lenlerinin toplam�, kendisine e�itse o say�
		 * m�kemmeldir. ORNEK: INPUT : 6 OUTPUT : 1,2,3 1+2+3 = 6 = 6 (M�kemmel)
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int num = scan.nextInt();
		int bolenlerinToplam� = 0;
		
		int i = 1;
		
		do {
			if (num%i==0) {
			bolenlerinToplam�=bolenlerinToplam�+i;
			}
			i++;
		}while(i<num);
		
	if (bolenlerinToplam� == num ) {
		System.out.println(num + " m�kemmel say�d�r");
	}else {
		System.out.println(" m�kemmel say� degildir");
	}

	scan.close();
	
	}

}
