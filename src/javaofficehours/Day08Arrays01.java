package javaofficehours;

import java.util.Arrays;

public class Day08Arrays01 {

	public static void main(String[] args) {
		
		
		/*
		 * Array elemanlarýný büyükten küçüðe dogru sýralayan java kodunu yazýnýz
		 * 12,1,5,15,18,9
		 */

		int arr[] = {12,1,5,15,18,9};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); // 1 5 9 12 15 18
		
		int arrYeni[] = new int[arr.length];
		
		for( int i = 0 ; i<arr.length ; i++) {
			arrYeni[i] = arr[(arr.length -1)-i];
		}
		System.out.println(Arrays.toString(arrYeni));
	}

}
