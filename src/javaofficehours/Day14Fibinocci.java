package javaofficehours;

import java.util.Scanner;

public class Day14Fibinocci {

	public static void main(String[] args) {
		
		 
			    /* Kullanicadan  1 sayi alalim ve o sayi kadar fibonacci sayi dizisini yazdiralim
			     * 
			     * 
			     * girilen sayi 10 = 0 1 1 2 3 5 8 13 21 34
			     
			     */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Fbinocci serisi için bir sayý giriniz");
		int sayi = scan.nextInt();
		
		int sayi1 = 0;
		int sayi2 = 1;
		int ikiSayiTop = 0;
		System.out.print(sayi1+ " "+ sayi2);
		
		for(int i = 2; i<sayi;i++) {
			
			ikiSayiTop= sayi1+sayi2;
			sayi1=sayi2;
			sayi2= ikiSayiTop;
			System.out.print(" "+ ikiSayiTop);
		}
		
		scan.close();
	}

}
