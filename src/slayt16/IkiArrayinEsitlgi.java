package slayt16;

import java.util.Arrays;

public class IkiArrayinEsitlgi {

	public static void main(String[] args) {
		
		
		int arr1[] = {2, 1, 7, 6};
		int arr2[] = {2, 1, 7, 6};
		
		System.out.println(Arrays.equals(arr1, arr2)); // true
		
		int arr3[] = {1, 2, 3};
		int arr4[] = {1, 2, 3};
		
		if (Arrays.equals(arr3, arr4)) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}  // same

	}

}
