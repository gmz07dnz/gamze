package day06ifstatement;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
	/*
	 Kullanicidan pozitif bir tamsayi alin.
	 sayi 3 basamakli ise console' a "3 Basamakli " yazdirin
	 sayi 2 basamakli ise console' a "2 Basamakli " yazdirin
	 sayi 3 basamakli veya sayi 2 basamakli degil ise console'a "ikisi de değil " yazdirin
	 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen pozitif bir tamsayi girin");
		int num = scan.nextInt();
		
		if (num>99 && num<1000) {
			System.out.println("3 Basamakli ");
		}
		
		if(num>9 && num<100) {
			System.out.println("2 Basamakli ");
		}
		
		if(!(num>99 && num<1000) && !(num>9 && num<100)) {
			System.out.println("ikisi de değil ");
		}
		
	scan.close();
	
	}

}
