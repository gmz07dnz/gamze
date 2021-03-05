package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		// defterde acýklama var
	
	
	int ma[][] = new int[3][2];
	
 // ekrana yazdýrma
	System.out.println(Arrays.deepToString(ma)); // [[0, 0], [0, 0], [0, 0]] atama oladýgý için bu sekilde yazar
	
	// eleman ekleme
	
	ma[0][0] =33;
	
	System.out.println( Arrays.deepToString(ma)); // [[33, 0], [0, 0], [0, 0]]
	
	ma[0][1] =32;
	ma[1][0] =23;
	ma[1][1] =24;
	ma[2][0] =13;
	ma[2][1] =11;
	
	System.out.println(Arrays.deepToString(ma)); // [[33, 32], [23, 24], [13, 11]]
	
	
	// [23, 24] arrayý yazdýr
	
	System.out.println(Arrays.toString(ma[1])); // iç içe olana bakmadýgýmýz için deep olaný kullanmadýk
	
	// istenilen bir array nasýl yazdýrýlýr
	
	
			System.out.println(ma[2][0]);// 13  sadece sayý  sordugu için toString yada deepToString methodu kullanmadýk
	
	
	}

}
