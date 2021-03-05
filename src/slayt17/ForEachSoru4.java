package slayt17;

import java.util.Arrays;

public class ForEachSoru4 {

	public static void main(String[] args) {
		
		/*
		 * Bir String oluþturunuz, bu String’deki character’leri yukarýdan aþaðýya
           for-each loop kullanarak yazdýrýnýz.
           Ýpucu: split()
		 */

	
	String str= "fenerbahce";
	
	String arr[] = str.split("");
	
	System.out.println(Arrays.toString(arr));
	
	for ( String w: arr) {
		System.out.println(w);
	}
	
	
	
	
	
	}

}
