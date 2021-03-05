package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		
		
// Saati saniyeye çeviren bir program yazýnýz. (long kullanýnýz) Not 1: Saniye = Saat x 60 x 60		
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Çevirmek istediðiniz saati yazýnýz"); // 3
	
	long sa = scan.nextLong();
	
	long sn = sa * 60 *60;
		
	System.out.println(sn);	// 10800
		
	scan.close();
	
	
	}

}
