package day08ternary;

import java.util.Scanner;

public class TernarySoru06 {

	public static void main(String[] args) {
		
		
  /*
  Kullanýcýdan bir tamsayý girmesini isteyin, tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek”
  yazdýrýn	
 */
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen bir tam sayý giriniz.");
	int s = scan.nextInt();
	
	// if ile çözelim

	
	if(s%2==0) {
		System.out.println("Çift");
	}else {
		System.out.println("tek");
	}
		
	// ternary ile cözelim
	
String result = s%2==0 ? "Çift" : "Tek";
System.out.println(result);
	
scan.close();

	
	
	}

}
