package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day05List {

	public static void main(String[] args) {
		
		/*
		 * SORU 1) Bes elemanli bir String list olusturup asagidaki islemleri yapin
		 * Isimler : {Jim,Jack,Tom,Lee,Pam} 
		 * Jim yerine Lucy ekleyiniz. 
		 * 3. index’e Temel’e ekleyiniz.  
		 * Jack i listeden siliniz.  
		 * Gregor 'u listeye ekleyiniz.  
		 * List’in buyuklugunu bulunuz.  
		 * Alfabetik siraya koyunuz, 
		 * List’in elemanlarinin tamamini siliniz.
		 */

	// 1- Bes elemanli bir String list olusturun. Isimler : {Jim,Jack,Tom,Lee,Pam}
		 
		// 1.yol
		
	List<String> list = new ArrayList<>();
	
	list.add("Jim");
	list.add("Jack");
	list.add("Tom");
	list.add("Lee");
	list.add("Pam");
	
	System.out.println(list); // [Jim, Jack, Tom, Lee, Pam]

	
	// 2.yol == > array olusturup liste cevirebiliriz
	
	String array[] = {"Jim", "Jack", "Tom", "Lee", "Pam"};
	
	List<String> list1 = Arrays.asList(array);
	System.out.println(list1); // [Jim, Jack, Tom, Lee, Pam]
	
	
	
	
	
	// 2- Jim yerine Lucy ekleyiniz.
	
    list.set(0, "Lucy");  
	System.out.println(list);    // [Lucy, Jack, Tom, Lee, Pam]
	
	// 3- 3. index’e Temel’e ekleyiniz.
	
	list.add(3, "Temel");
    System.out.println(list);     // [Lucy, Jack, Tom, Temel, Lee, Pam]
	
	// 4-Jack i listeden siliniz.
	
    list.remove("Jack");
    System.out.println(list);  // [Lucy, Tom, Temel, Lee, Pam]
	
	// 5 - Gregor 'u listeye ekleyiniz.
    
    list.add("Gregor");
    System.out.println(list);   // [Lucy, Tom, Temel, Lee, Pam, Gregor]
    
    // 6- List’in buyuklugunu bulunuz.
    
    System.out.println(list.size()); // 6
    
    // 7- Alfabetik siraya koyunuz.
    
    Collections.sort(list);
    System.out.println(list); //    [Gregor, Lee, Lucy, Pam, Temel, Tom ]
    
    // 8- List’in elemanlarinin tamamini siliniz.
    list.clear();
    System.out.println(list); // []
    
	
	}

}
