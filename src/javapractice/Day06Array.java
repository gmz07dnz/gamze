package javapractice;

import java.util.Arrays;

public class Day06Array {

	public static void main(String[] args) {
		
		/*
		 * - Bir array olusturun, icerisinde 5 tane eleman olsun - Array’in elamanlarini
		 * yazdirin - Bir for loop olusturun, loop ile arrayin tum elemanlarini 2
		 * artirin ve yazdirin - Loop’dan sonra Arrayi yeniden yazdirin
		 */
		
		int arr[] = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		
		int arr1[] = new int[5];
		
		for (int i = 0; i<arr.length; i++){
			arr1[i]= arr[i]+2;
			System.out.print(arr1[i]);
		}
		System.out.println();
        System.out.println(Arrays.toString(arr1));
		}

}
