package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class OdevSorusu {

	public static void main(String[] args) {
		
	
		/*
        4)A�a��daki multi dimensional array�in i� array�lerindeki tum elemanlar�n toplam�n� birer birer bulan
          ve herbir sonucu yeni bir array�in eleman� yapan ve yeni array�i ekrana yazd�ran bir program yaz�n�z 
          Ornegin; { {1,2,3}, {4,5}, {6,7} }  ==> 1+2+3=6  4+5=9  6+7=13  ==>  output: {6, 9, 13}
        */

	
	int arr[][] = { {1,2,3}, {4,5}, {6,7} };
	
    int newArr [] = new int[arr.length]; // [0, 0, 0] 
	
	
	int sum = 0;
	
	for (int  i = 0; i<arr.length; i++) {
		for (int k = 0; k<arr[i].length; k++) {
			  sum = arr[i][k] + sum;
			}newArr[i] = sum;
			sum= 0;
	} System.out.println(Arrays.toString(newArr));
	
	
	
	
	
	
	}

}
