package day19arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		
		
		/*
		 * Kullanýcýya kaç elemanlý bir array gireceðini sorun. Kullanýcýdan array’in elemanlarýný girmesini isteyin. 
		 * a) Bu array’in tum elemanlarýný ekrana yazdýrýn.
		 * b) Bu arayýn son elemanýný ilk eleman yapýn ve tum elemanlarýný ekrana yazdýrýn. 
		 * Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdýrýn.
		 */
		

	Scanner scan = new Scanner(System.in);
	System.out.println("array'in length'ini giriniz");
	int length = scan.nextInt();
	
	int arr[] = new int[length];    // Kullanýcýnýn girdiði uzunluk kadar default value atanýr.
	
	
	int i = 0;
	
	while (i<arr.length) {
	System.out.println("index'i "+ i + " olan elemaný giriniz");
	   arr[i]= scan.nextInt();
	  i++;
	
	
	}
	System.out.println(Arrays.toString(arr));
	
	int newArr[] = new int[length]; //array içinde degiþim yapamayacagýmýz için yeni bir array olusturuyoruz
	newArr[0] = arr[arr.length-1];
	
	for (int k = 1; k<(arr.length); k++ ) {
		newArr[k] = arr[k-1];
	}
	
	System.out.println(Arrays.toString(newArr));
	
	scan.close();
	
	}

}
