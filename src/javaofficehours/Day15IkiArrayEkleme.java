package javaofficehours;

import java.util.Arrays;

public class Day15IkiArrayEkleme {
  
	public static void main(String[] args) {
		
		
		 /*
	     * iki farklý Array'i birleþtiren ve olusturdugu yeni Array i retun eden bir
	     * method yaziniz
	     * 
	     * getBirlestirilmisArray(int[] array1, int[] array2)
	     * 
	     * return yeniArray;
	     * 
	     * [1,2,3] [4,5,6] [1,2,3,4,5,6]
	     * 
	     */

		int array1[] = {1,2,3};
		int array2[] = {4,5,6};
		
		int [] yeniArray = getBirlestirilmisArray(array1,array2);
		
        System.out.println(Arrays.toString(yeniArray));
		
		

}

	public static int[] getBirlestirilmisArray(int array1[], int array2[]) {
		
		int uzunluk = array1.length+array2.length;
		
		int [] yeniArray = Arrays.copyOf(array1, uzunluk);
		
		for (int i = 0; i<array2.length;i++) {
			yeniArray [i+array1.length]=array2[i]; 
		}
		
		return yeniArray;
		
		
	}

	
}
