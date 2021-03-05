package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		// defterde ac�klama var
	
	
	int ma[][] = new int[3][2];
	
 // ekrana yazd�rma
	System.out.println(Arrays.deepToString(ma)); // [[0, 0], [0, 0], [0, 0]] atama olad�g� i�in bu sekilde yazar
	
	// eleman ekleme
	
	ma[0][0] =33;
	
	System.out.println( Arrays.deepToString(ma)); // [[33, 0], [0, 0], [0, 0]]
	
	ma[0][1] =32;
	ma[1][0] =23;
	ma[1][1] =24;
	ma[2][0] =13;
	ma[2][1] =11;
	
	System.out.println(Arrays.deepToString(ma)); // [[33, 32], [23, 24], [13, 11]]
	
	
	// [23, 24] array� yazd�r
	
	System.out.println(Arrays.toString(ma[1])); // i� i�e olana bakmad�g�m�z i�in deep olan� kullanmad�k
	
	// istenilen bir array nas�l yazd�r�l�r
	
	
			System.out.println(ma[2][0]);// 13  sadece say�  sordugu i�in toString yada deepToString methodu kullanmad�k
	
	
	}

}
