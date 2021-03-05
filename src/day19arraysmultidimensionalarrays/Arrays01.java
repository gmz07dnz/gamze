package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		int a[] = {2, 5, 2, 8, 6}; 
	
	/*
	 Bir array'de belli bir elemanýn var olup olmadýgýný kontrol etmek
	 binarysearch() methodu bir array'de belli bir elemanýn var olup olmadýgýný kontrol etmek 
	 için kullanýlýr. 
	 Binarysearch() methodunu kullanmadan önce mutlaka sort() kullanmalýsýnýz.
	 sort() kullanmadan önce Binarysearch() kullanýrsanýz buldugunuz sonuc manalý olmaz.
	 Binarysearch() methodu var olan elemanlar için o elemanýn sort edilmiþ array'deki index'ini 
	 gösterir
	  */
	
	Arrays.sort(a); // 2, 2, 5, 6, 8
	System.out.println(Arrays.binarySearch(a, 8));// 4
	System.out.println(Arrays.binarySearch(a, 5));// 2
	
	System.out.println(Arrays.binarySearch(a, 2));// tekrarlý sayýlar için binarysearch() kullanmayýnýz
	
	System.out.println(Arrays.binarySearch(a, 4));// -3
	
	System.out.println(Arrays.binarySearch(a, 7));// -5
	
	// iki array'in esit olup olmadýgýný kontrol etmek
	
	String s1[] = {"A", "D", "C"}; 
	String s2[] = {"A", "C", "D"};
	String s3[] = {"A", "C", "D"};
	
	// 1ve 2 esit degil , 2 ve 3 esit
	
	System.out.println(Arrays.equals(s1, s2)); // false
	System.out.println(Arrays.equals(s2, s3)); // true
	System.out.println(s3==s2); // bu sekilde yapýlmaz adres farklý 
	
	
	
	
	
	
	
	}

}
