package slayt15;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemanAynýMýKontrol {

	public static void main(String[] args) {
		
		/*
		 * Bir array’de herhangi iki elemanýn ayný olup olmadýðýný kontrol eden bir program yazýnýz.
		 * Ayný eleman varsa “Ayný eleman var” yoksa “Ayný eleman yok” yazdýrýnýz.
		 */
		
int arr[] = {1, 2,2, 33, 6, 7, 9};
		
		int flag=0;
		
		for (int i= 0 ; i<arr.length; i++) {
			for (int j = 0 ; j<i; j++) {
			if(arr[i] == arr[j]) {
			flag++;
			
			}
		} 
	   
		}
		
		if (flag == 0) {
		   System.out.println("Ayný eleman yok");
	   }else {
		   System.out.println("Ayný eleman var");
	   }
		
		
	}

}
