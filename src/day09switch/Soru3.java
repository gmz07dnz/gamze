package day09switch;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan bir tamsayý alýn eðer tamsayý 9 ise ekrana “Bir basamaklý en büyük sayý” yazdýrýn. 
		 * 99 ise ekrana “Ýki basamaklý en büyük sayý” yazdýrýn.
		 * 999 ise ekrana “Üç basamaklý en büyük sayý” yazdýrýn. 
		 * Bu sayýlarýn dýþýndaki sayýlar için “Yorum yok” yazdýrýn. 
		 */

    Scanner scan = new Scanner(System.in);		
		
	System.out.println("Bir tam sayi giriniz");
		
	int s = scan.nextInt();
	
	
	// Switch ile
	
	switch(s) {
	case 9 :
		System.out.println("Bir basamaklý en büyük sayý");
	break;
	case 99:
		System.out.println("Ýki basamaklý en büyük sayi");
	break;
	case 999 :
		System.out.println("Üç basamaklý en büyük sayi");
	
	break;
	default:
		System.out.println("Yorum yok");
	
	}
		
	
	// If ile
	
	if (s== 9 ) {
		System.out.println("Bir basamakli en büyük sayi");
	}else if (s==99) {
		System.out.println("Ýki basamaklý en büyük sayi");
	}else if (s== 999) {
		System.out.println("Üç basamakli en büyük sayi");
	}else {
		System.out.println("Yorum yok");
	}
		
		
   // Ternary ile 		
		
String result = s== 9 ? "Bir basamakli en büyük sayi" : s==99 ? "Ýki basamaklý en büyük sayi" :s== 999 ? "Üç basamakli en büyük sayi" : "Yorum yok";
 System.out.println(result);
	
	
	scan.close();
	}

}
