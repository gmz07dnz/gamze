package day08ternary;

import java.util.Scanner;

public class NestedTernarySoru01 {

	public static void main(String[] args) {
		
	/*
	 Kullan�c�dan bir tamsay� girmesini isteyin, o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
     3 basamakl� degilse �ift olup olmadigini kontrol edin. 
     �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
     �ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
	 */
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("bir sayi giriniz");
	int s = scan.nextInt();
	
   
    String result = s>99 && s<1000  ? "3 basamakl�" : s%2==0 ? "3 basamakl� olmayan �ift" : "3 basamakl� olmayan tek";	
		
	System.out.println(result);
	
	scan.close();
		
		
		
		
		
	}

}
