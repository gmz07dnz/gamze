package day12forloop;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		
		/*
		 * baslangic ve bitis degerlerini kullanicidan alin
		 * baslangic degerinden bitis degerine kadar t�m sayilarin toplamini hesaplayan programi 
		 * yaziniz
		 */
   Scanner scan = new Scanner(System.in);
   System.out.println("baslangic degerini giriniz");
   int bas = scan.nextInt(); 
   System.out.println("biti� degerini giriniz");	
   int bit = scan.nextInt();	
int toplam = 0;	
		
	if (bas>bit) {
		System.out.println("baslangic bitisten b�y�k olmamal�");
	}else {
		for (int i = bas ; i<=bit ; i++) {
			toplam = toplam + i;
			}
	 System.out.println("Toplam: " + toplam);
	}
		
		
	scan.close();	
		
	}

}
