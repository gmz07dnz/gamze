package slayt15;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTerstenYazma {

	public static void main(String[] args) {
		
		/*
		 * /*
		 * Kullanýcýya kaç elemanlý bir array gireceðini sorun. Kullanýcýdan array’in elemanlarýný girmesini isteyin. 
		 * a) Bu array’in tum elemanlarýný ekrana yazdýrýn.
		 * b) bu array'i tersten yazdýrýn.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("array'in length'ini giriniz");
        int length= scan.nextInt();
        int arr[] = new int[length];
        
        
        int i = 0;
        do {
        	System.out.println("array'in index'i " + i +" olan elemaný giriniz");
        	arr[i] = scan.nextInt();
        i++;
        }while (i<length);
       System.out.println(Arrays.toString(arr)); 
       
       
       int newArr[] = new int[length];
       
       for (int k = length-1;k>=0; k--) {
    	  for(int m = (length-1)-k ; m<length -k ; m++) {
    		  newArr[k]=arr[m];
    	  }
       }
       System.out.println(Arrays.toString(newArr));
       
     scan.close();   
	}

}
