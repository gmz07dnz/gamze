package javaofficehours;

import java.util.Scanner;

public class Day06For02 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan 2 sayý alalim
		 * 1.sayý taban olsun
		 * 2.sayý üst
		  
		 *1.sayýnýn üssünü hesaplayalým
		 *2 3 = 2*2*2 =8
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Üslü sayýnýn tabanýný giriniz");
		int taban = scan.nextInt();
		
		System.out.println("Üslü sayýnýn üssünü giriniz");
		int üst= scan.nextInt();
		
		long result=1;   // üslü sayý oldugu için sonuc cok büyük olabilir.
		int i =0;
		
			
		while (i!=üst) {
			result*=taban;
			i++;
			}
		
	
		System.out.println("sonuc: "+result);
		 result =1;
		
		 // 2.yol
		 
		for (int k = 0 ; k<üst ; k++) {
			result*=taban;
			
		}
		System.out.println("sonuc: "+result);
		
		result = 1;
		
		
		// 3.yol
		
		result = (long) Math.pow(taban, üst);
		System.out.println("sonuc: "+result);
		
		
		scan.close();
	}

}
