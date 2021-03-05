package Interviewcodequestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MountainArray {

	public static void main(String[] args) {
		
		/*
		 Mountain Array         ==> [0,2, 5, 3, 1]
	     Mountain Olmayan Array ==> [5, 2, 7, 1, 4]
	Logic: En buyuk degere sahip elemanin index'ini bulunuz.
	       Bu index'deki ve oncesindeki elemanlari yeni bir array'e siralarini bozmadan depolayin
	       Yeni Array'i sort edin ve olusturdugunuz array ile esit mi diye kontrol edin. Esit ise 1. kisim tamamdir
	       Ayni sekilde ikinci kismi da kontrol edin
		 */

	
	
	int a[] = { 0, 2, 5, 3, 1 };
	
	List<Integer> l1 = new ArrayList<>();

	// List'i array'e cevirelim
	
	for(int w: a) {
		l1.add(w);
	}
	
	System.out.println(l1); // [0, 2, 5, 3, 1]
	
	// En büyük sayýyý bulalým.
	
	
	Arrays.sort(a);
	System.out.println(Arrays.toString(a)); // [0, 1, 2, 3, 5]

	int maxEleman= a[a.length-1];
	System.out.println(maxEleman);
	
	
	// en büyük sayýnýn index'ini bulalým.
	
	
	System.out.println(l1.indexOf(maxEleman)); // 2
	
	// List'in ilk kýsmýný al ve bir list'e at
	List<Integer> l11 = new ArrayList<>();
	
	for(int i = 0; i<=l1.indexOf(maxEleman); i++) {
		l11.add(l1.get(i));
	}
	System.out.println(l11); // [0, 2, 5]
	
	//ilk kýsmý baska bir list'in içine koy ve sort et
	
	List<Integer> l11Sorted = new ArrayList<>();
	
	for(Integer w: l11) {
		l11Sorted.add(w);
	}
	
	System.out.println("Sort edilmeden önce: "+ l11Sorted);
	Collections.sort(l11Sorted);
	System.out.println("Sort edildikten sonra: "+ l11Sorted);
	
	if(l11.equals(l11Sorted)) {
		System.out.println("Birinci þart tamam");
	}else {
		System.out.println("Birinci þart tamam degil");
	}
	
	
	// List'in ikinci kýsmýný al ve bir list'e at
	
	List<Integer> l12 = new ArrayList<>();
	for (int i = l1.indexOf(maxEleman); i<l1.size(); i++) {
		l12.add(l1.get(i));
	}
         System.out.println(l12);	
         
         
       //ikinci kýsmý baska bir list'in içine koy önce sort et daha sonra reverse et
         
         
         List<Integer> l12Reversed = new ArrayList<>();
         
         for(Integer w: l12) {
        	 l12Reversed.add(w);
         }
         
         System.out.println("Sort edilmeden önce: "+l12Reversed);
         Collections.sort(l12Reversed);
         
         System.out.println("Sort edildikten sonra: "+l12Reversed); // [1, 3, 5]
         Collections.reverse(l12Reversed);
         
         System.out.println("reverse edildikten sonra: "+l12Reversed);// [5, 3, 1]
         
         if(l12.equals(l12Reversed)) {
     		System.out.println("Birinci þart tamam");
     	}else {
     		System.out.println("Birinci þart tamam degil");
     	} 
         
         
         
         
	}

}
