package slayt17;

import java.util.Arrays;

public class ForEachSoru4 {

	public static void main(String[] args) {
		
		/*
		 * Bir String olu�turunuz, bu String�deki character�leri yukar�dan a�a��ya
           for-each loop kullanarak yazd�r�n�z.
           �pucu: split()
		 */

	
	String str= "fenerbahce";
	
	String arr[] = str.split("");
	
	System.out.println(Arrays.toString(arr));
	
	for ( String w: arr) {
		System.out.println(w);
	}
	
	
	
	
	
	}

}
