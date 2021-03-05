package day08ternary;

import java.util.Scanner;

public class NestedTernarySoru01 {

	public static void main(String[] args) {
		
	/*
	 Kullanýcýdan bir tamsayý girmesini isteyin, o tamsayý 3 basamaklý ise ekrana “3 Basamaklý” yazdýrýn.
     3 basamaklý degilse çift olup olmadigini kontrol edin. 
     Çift ise “3 basamaklý olmayan çift sayý” yazdýrýn.
     Çift sayý degilse “3 basamaklý olmayan tek sayý yazdýrýn.”
	 */
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("bir sayi giriniz");
	int s = scan.nextInt();
	
   
    String result = s>99 && s<1000  ? "3 basamaklý" : s%2==0 ? "3 basamaklý olmayan çift" : "3 basamaklý olmayan tek";	
		
	System.out.println(result);
	
	scan.close();
		
		
		
		
		
	}

}
