package javaofficehours;

import java.util.Scanner;

public class Day06GirilenSayiTersi {

	public static void main(String[] args) {
		
		/*
		 * Girilen sayýnýn tersini yazdýran java kodunu yazýnýz
		 * 
		 *123 --> 321
		 */

		
	Scanner scan = new Scanner(System.in);
	System.out.println("tersini yazdýrmak için bir sayý giriniz");
	

		
		
	int sayi = scan.nextInt();
	
	int result= 0;
	
	int temp = 0;
	
	while (sayi>0) {   
		temp = sayi%10;    //  123%10 ==> 3  birler basamagý
		
		sayi = sayi/10;   // 123/10 =12 
		
		result = result*10 +temp;   // 1.tur temp = 3  ==> sayi =12  result = result*10 +temp;==> 0= 0*10+3 result=3 
		                            // 2.tur temp=12%10 =>2 sayi= 12/10 = 1 --> result = result*10 +temp;==> 3 =3*10+2 = 32
		                            // 3.tur temp = 1%10 => 1 sayi = 1/10 =0.2 --> result = result*10 +temp;==> 32 =32*10+1 = 321
	                                // 4.tur dönmez sayi =0.1<0 old için
	}
	
	System.out.println(result);		
	
	scan.close();
	}

}
