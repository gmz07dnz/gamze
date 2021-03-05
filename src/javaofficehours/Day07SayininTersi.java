package javaofficehours;

import java.util.Scanner;

public class Day07SayininTersi {

	public static void main(String[] args) {
		
		
		/*
		 * Girilen sayının tersini yazdıran java kodunu yazınız
		 * 
		 *123 --> 321
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen tersini alinacak bir sayi giriniz");
        int sayi = scan.nextInt();
        
        System.out.println("Girilen sayinin tersi "+ sayininTersi(sayi)  );
        
        scan.close();
       
        }

	public static int sayininTersi(int num) {
		int result = 0;
		int temp =0;
	//	int basamak =0;
		while(num>0) {
			
			temp = num%10;
			num/=10;
   //  basamak +=temp;
			result = result*10 + temp;
		}
	//	System.out.println(result);
	//	System.out.println(basamak);
		return result;
	}
	

		
	}


