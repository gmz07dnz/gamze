package slayt15;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		/*
		 * Kullan�c�ya ka� elemanl� bir array girece�ini sorun. Kullan�c�dan array�in elemanlar�n� girmesini isteyin. 
		 * a) Bu array�in tum elemanlar�n� ekrana yazd�r�n.
		 * b) Bu aray�n son eleman�n� ilk eleman yap�n ve tum elemanlar�n� ekrana yazd�r�n. 
		 * Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazd�r�n.
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("array'in length'ini giriniz");
	int length = scan.nextInt();

	int arr[] = new int[length];
	
	int i =0;
    do {
    	System.out.println("array'in index'i " +i + " olan eleman� giriniz");
       
    	arr[i]= scan.nextInt();  
        i++;
    
    
    }while (i<length);
	
	System.out.println(Arrays.toString(arr));
	
	// array'de degi�iklik yapam�yoruz .Bunun i�in yeni bir array olusturmam�z lzm
	
int newArr[] = new int[length];
newArr[0] = arr[arr.length-1];

	for(int k=1; k<length ; k++) {
		newArr[k]= arr[k-1];
	}
System.out.println(Arrays.toString(newArr));

scan.close();

	}

}
