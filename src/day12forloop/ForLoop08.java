package day12forloop;

import java.util.Scanner;

public class ForLoop08 {

	public static void main(String[] args) {
		
		
		/*
		 * kullanicidan baslangic ve bitis degerlerini aliniz.
		 * Baslangic ve bitis degerleri nasil olursa olsun baslangic degerinden 
		 bitis degerine kadar tum sayilarin carpimini hesaplayan programi yaziniz.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("baslangic degeri giriniz");
		int bas = scan.nextInt();
		System.out.println("bitis degeri giriniz");
		int bit = scan.nextInt();
		
		int carpim = 1;
	
	
if (bas<=bit) {
	
for (int i = bas; i<=bit ; i++) {
	carpim = carpim*i;
}
}else {
	
	for(int i = bas ; i>= bit ; i--) {
		carpim = carpim*i;
	}System.out.println("carpim: " + carpim);
	
}
	
scan.close();	
	
	
	
	
	}
}
