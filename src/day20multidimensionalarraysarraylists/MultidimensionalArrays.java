package day20multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		int ma[][] = {{11, 5}, {7, 11}, {21, 17, 28}, {10, 10}};
		
		Arrays.deepToString(ma);
		System.out.println(Arrays.deepToString(ma)); 
		
		// sonuncu array
		
		System.out.println(Arrays.toString(ma[ma.length-1])); // 
		
		// 17yi yazmak için
		
		System.out.println(ma[2][1]); // 17
		
		// ma multidimensional arrayinin tüm elemanlarýný ayný satýrda aralarýna boþluk býrakarak yazýnýz
		
		
		for(int i = 0 ; i<ma.length; i++) {
			
			for(int k =0 ; k<ma[i].length; k++) {
				
				System.out.print(ma[i][k]+" ");
			}
		}
		
		System.out.println();
		
		// ma multidimensional arrayinin tüm elemanlarýný toplamýný yazýnýz	
		
		int sum = 0;
		
		for(int i = 0 ; i<ma.length ; i++ ){
			for(int k = 0; k<ma[i].length; k++) {
				sum= sum + ma[i][k];
			}
			
		}System.out.println("Toplam: "+ sum);
		
		
		// ma multidimensional arrayinin tüm elemanlarýný carpýmýný ekrana yazdýrýnýz.
		
		int carpim = 1;
		for (int i = 0 ; i<ma.length; i++) {
			for(int k = 0 ; k<ma[i].length; k++) {
				carpim = carpim*ma[i][k];
			}
		}System.out.println("Carpim: "+ carpim);
		
		// ma multidimensional arrayinin tüm elemanlarýndan cift olanlarýn karesini ekrana yazdýrýnýz.
		
		
		for(int i = 0 ; i<ma.length ; i++ ){
			for(int k = 0; k<ma[i].length; k++) {
				if (ma[i][k]%2 == 0) {
					System.out.println(ma[i][k]*ma[i][k]);
				}
				}
		}
		
		
	}
}
