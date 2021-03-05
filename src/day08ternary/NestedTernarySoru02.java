package day08ternary;

import java.util.Scanner;

public class NestedTernarySoru02 {

	public static void main(String[] args) {
		
		/*
		Artik Yil(Lep Year): 100'e bolunen yillardan 400'e bolunenler artik yildir.
		                     100'e bolunmeyenlerden 4'e bolunenler artik yildir.
		 Kullanicidan alinan yilin artik yil olup olmadigini belirleyen kodu yaziniz.
		*/

	Scanner scan = new Scanner(System.in);
	System.out.println("bir yil giriniz");
		
	int y = scan.nextInt();
	
String result = y%100==0 ? y%400==0 ? "Artýk yýl" : "Artýk yýl degildir" : y%4==0 ? "Artýk yýl" : "Artýk yýl degildir";
		
	System.out.println(result);	
		
		scan.close();
		
		
		
		
	}

}
