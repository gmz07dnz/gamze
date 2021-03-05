package javapractice;

import java.util.Scanner;

public class Day04ArrayElemanKontrol {

	public static void main(String[] args) {
		
		
		/*
		 * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
		 * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
		 * yaziniz 
		 
		 * Array={3,5,21,32,34,45,56,57,76,87,95} 
		 * Input : 5 
		 * Output: Girdiginiz sayi Arrayde var 
		 * Input : 15 
		 * Output: Girdiginiz sayi Arrayde yok
		 */
	
		int arr[] ={3,5,21,32,34,45,56,57,76,87,95}; // array'i buraya yazýyorum Çünkü Array'de deðiþiklik yapmak isteyebilirim.
	
		elemanKontrol(arr); // burdaki yukardaki array olmalý . Çünkü ben yukardakini kontrol etmek istiyorum.
		
		
		
	}	// main
	
	
	public static void elemanKontrol(int array[]) { // sana int'lerden olusan bir array gelecek demek , genel bir kavram yukardaki array'i
		                                            // kastettmiyor. Herhangi bir aray için calýsýr
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Array' de olup olmadýgýný kontrol etmek için bir sayý giriniz");
		int num = scan.nextInt();
		int count = 0;
		
		for (int i = 0 ; i<array.length ; i++) {
			if (array[i]==num) {
				System.out.println("Girdiginiz sayi Arrayde var");
				count++;
				break;
			}
		} if (count==0) {
			System.out.println("Girdiginiz sayi Arrayde yok");
		}
		
		scan.close();
		
			
	}
	
	
	
	
	
	
	
	
	
	
} // class