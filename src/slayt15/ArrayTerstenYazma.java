package slayt15;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTerstenYazma {

	public static void main(String[] args) {
		
		/*
		 * /*
		 * Kullan�c�ya ka� elemanl� bir array girece�ini sorun. Kullan�c�dan array�in elemanlar�n� girmesini isteyin. 
		 * a) Bu array�in tum elemanlar�n� ekrana yazd�r�n.
		 * b) bu array'i tersten yazd�r�n.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("array'in length'ini giriniz");
        int length= scan.nextInt();
        int arr[] = new int[length];
        
        
        int i = 0;
        do {
        	System.out.println("array'in index'i " + i +" olan eleman� giriniz");
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
