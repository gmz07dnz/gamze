package slayt15;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElemanAyn�M�Kontrol {

	public static void main(String[] args) {
		
		/*
		 * Bir array�de herhangi iki eleman�n ayn� olup olmad���n� kontrol eden bir program yaz�n�z.
		 * Ayn� eleman varsa �Ayn� eleman var� yoksa �Ayn� eleman yok� yazd�r�n�z.
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
		   System.out.println("Ayn� eleman yok");
	   }else {
		   System.out.println("Ayn� eleman var");
	   }
		
		
	}

}
