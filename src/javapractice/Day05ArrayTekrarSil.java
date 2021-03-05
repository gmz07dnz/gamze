package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day05ArrayTekrarSil {

	public static void main(String[] args) {
		
		
		/*
		 * Verilen array’deki tekrar eden sayilari ilki haric silip, tekrarsiz
		 * sayilardan olusan bir array haline getiren bir program yaziniz. 
		 * INPUT :{1,2,2,3,1,4,2,5,6,8,7,5,9,1} 
		 * OUTPUT : [1,2,3,4,5,6,7,8,9]
		 */
		
	int arr[] =	{1,2,2,3,1,4,2,5,6,8,7,5,9,1};
	
	List<Integer> tekrarsýz = new ArrayList<>();
	
	for( Integer w: arr){
		if ( tekrarsýz.contains(w)) {
			continue;
		}else {
			tekrarsýz.add(w);
		}

	}System.out.println(tekrarsýz);
	
	Object[] arr1 = tekrarsýz.toArray();
	
	System.out.println(Arrays.toString(arr1));

	
	int arr2[] = new int[tekrarsýz.size()];
	
	for (int i = 0; i<arr2.length; i++) {
		arr2[i]= tekrarsýz.get(i);
	}
	System.out.println(Arrays.toString(arr2));
	
	}


	
	
	
	
}
