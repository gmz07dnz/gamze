package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day05ArrayTekrarSil {

	public static void main(String[] args) {
		
		
		/*
		 * Verilen array�deki tekrar eden sayilari ilki haric silip, tekrarsiz
		 * sayilardan olusan bir array haline getiren bir program yaziniz. 
		 * INPUT :{1,2,2,3,1,4,2,5,6,8,7,5,9,1} 
		 * OUTPUT : [1,2,3,4,5,6,7,8,9]
		 */
		
	int arr[] =	{1,2,2,3,1,4,2,5,6,8,7,5,9,1};
	
	List<Integer> tekrars�z = new ArrayList<>();
	
	for( Integer w: arr){
		if ( tekrars�z.contains(w)) {
			continue;
		}else {
			tekrars�z.add(w);
		}

	}System.out.println(tekrars�z);
	
	Object[] arr1 = tekrars�z.toArray();
	
	System.out.println(Arrays.toString(arr1));

	
	int arr2[] = new int[tekrars�z.size()];
	
	for (int i = 0; i<arr2.length; i++) {
		arr2[i]= tekrars�z.get(i);
	}
	System.out.println(Arrays.toString(arr2));
	
	}


	
	
	
	
}
