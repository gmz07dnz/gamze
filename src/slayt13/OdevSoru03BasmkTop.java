package slayt13;

import java.util.Scanner;

public class OdevSoru03BasmkTop {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�ya say� girmesini s�yleyin. 
		 * Kullan�c�n�n girdi�i say�n�n rakamlar� toplam�n� ekrana yazd�ran bir program yaz�n.
		 */
	


		Scanner scan = new Scanner(System.in);
		System.out.println("bir say� giriniz");
		int i1 = scan.nextInt();
	
		int rkmTop = 0;
		
		while (i1 != 0) {
			
			rkmTop = rkmTop + (i1%10);
			i1/=10;
		}
	System.out.println(rkmTop);
	
	
	
	scan.close();
	}

}
