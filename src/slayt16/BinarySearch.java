package slayt16;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		// Binarysearch methodu bir elemanýn bir array'de olup olmadýgýný kontrol etmek için kullanýlýr.
		// binarysearch methodundan once mutlaka sort() methodunu kullanmalýyýz.
		
		// Arrays.binarySearch(a, key) ==> a yerine array adý , key yerine varlýgýný kontrol etmek istegimiz elemaný.
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
