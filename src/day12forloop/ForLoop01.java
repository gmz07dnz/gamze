package day12forloop;

import java.util.Scanner;

public class ForLoop01 {
  public static void main(String[] args) {
	  
	  /*
		 *Kullan�c�dan ba�lang�� ve biti�  de�erlerini al�n ve 
		 *ba�lang�� de�erinden ba�lay�p biti� de�erinde biten t�m tamsay�lar� ekrana yazd�r�n. 
		 * 
		 * �rn: kullan�c� 10 ve 15 verirse ekrana ==> 10 11 12 13 14 15 
		 */

	// 1) Kullan�c�dan ba�lang�� ve biti�  de�erlerini alal�m.
	  
	Scanner scan = new Scanner(System.in);
	System.out.println("Baslangic degerini giriniz");
	int bas = scan.nextInt();
	
	System.out.println("bitis degerini giriniz");
	  int bitis = scan.nextInt();
	  
	// 2) Ba�lang�� de�erinden ba�lay�p biti� de�erinde biten t�m tamsay�lar� ekrana yazd�r�n.
	  
	 
	if (bas>bitis) {
		System.out.println("baslang�� degeri bitis degerinden b�y�k olmamal�");
	}else {
	for (int i=bas; i<=bitis ; i++) {
		System.out.print(i + " ");
	}
	  
	} 
	
	scan.close();
	  
	  
	  
	  
  }
}
