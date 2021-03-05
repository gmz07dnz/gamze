package slayt16;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		// Binarysearch methodu bir eleman�n bir array'de olup olmad�g�n� kontrol etmek i�in kullan�l�r.
		// binarysearch methodundan once mutlaka sort() methodunu kullanmal�y�z.
		
		// Arrays.binarySearch(a, key) ==> a yerine array ad� , key yerine varl�g�n� kontrol etmek istegimiz eleman�.
		// Index'i return eder
		
		int arr[] = {2, 1, 7, 6};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));  // [1, 2, 6, 7]
		
		
		System.out.println(Arrays.binarySearch(arr, 2)); //  1
		System.out.println(Arrays.binarySearch(arr, 7)); // 3
		System.out.println(Arrays.binarySearch(arr, 3)); // -2 **
		System.out.println(Arrays.binarySearch(arr, 9)); // -5
	
		
		String str[] = { "A", "C", "D", "B"};
		Arrays.sort(str);
		System.out.println(Arrays.toString(str)); // [A, B, C, D]
		System.out.println(Arrays.binarySearch(str, "A")); // 0
		System.out.println(Arrays.binarySearch(str, "C")); // 2
		System.out.println(Arrays.binarySearch(str, "E")); // -4
		System.out.println(Arrays.binarySearch(str, "G")); // -6
		
		
		
		
	
	}

}
