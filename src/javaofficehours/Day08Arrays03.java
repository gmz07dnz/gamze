package javaofficehours;

import java.util.Scanner;

public class Day08Arrays03 {
	
	public static void main(String[] args) {
		

		//Bir array icerisindeki aradigimiz sayiyi kontrol eden java kodunu methodla yaziniz.
		
				//[12,32,34,54,45]
		
		
		
		
		int arr[] = {12,32,34,54,45};
		
	sayiKontrol(arr);
	
	
	}

	public static void sayiKontrol(int arr[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Array'de aranacak say�y� giriniz");
		int sayi = scan.nextInt();
		
		int flag = 0;
		for (int j = 0; j < arr.length; j++) {
			
			if (sayi == arr[j]) {
			System.out.println("Arad���n�z "+sayi +" say�s� array i�inde vard�r");
			flag++;
			break;
			}
		}
		if (flag !=1)
				System.out.println("Arad���n�z "+sayi +" say�s� array i�inde yoktur.");
		
		
		scan.close();
		
	}
		
		
			
			

			
		} 
	


