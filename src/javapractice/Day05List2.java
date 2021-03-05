package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Day05List2 {

	public static void main(String[] args) {
		
		/*
		 *  10 elamanli bir list olusturun.
		 * 
		 *  Ardindan list’in 3. elemani ile 8. elemaninin yerlerini degistirin.
	ORNEK:
	    INPUT     : 
	    	 String[] isimler= {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
	  OUTPUT :
	         String[] isimler= {"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal" ,"Ahmet","Ali"};

*
*/

		
		List<String> list = new ArrayList<>();
		
		String isimler[] = {"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
		
		// for each ile list olusturuyoruz
		
		for(String w: isimler) {
			list.add(w);
		}
		
		System.out.println(list);
		
		
		
	
		String eleman3 = list.get(2);
		String eleman8 = list.get(7);
			
		list.remove(2);
		list.remove(6);
		System.out.println(list);  // [Umit, Emin, Kerem, Taylan, Orhan, Sinan, Ahmet, Ali]
			
		list.add(2, eleman8);
		list.add(7, eleman3);
		System.out.println(list); // [Umit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
