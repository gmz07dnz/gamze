package day36collections;

import java.util.HashSet;

public class HashSet01 {

	/*
	 1)Tekrarli elemana musaade edilmez. 
	   Set'lerin icinde bir eleman sadece 1 kere kullanilabilir.
	 2)HashSet'ler Set'ler arasinda en hizli olanidir.
	 3)HashSet elemanlari siralamak ile ugrasmaz. Elemanlari rastgele dizer. 
	 4)HashSet "null" object'ini eleman olarak kullanabilir. 
	*/

	
	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Ali");
		hs1.add("Veli");
		//HashSet'e tekrarli eleman yollarsaniz ustune yazar
		
		hs1.add("Veli");
		hs1.add(null);
		System.out.println(hs1);//[null, Veli, Ali]
		
	// Hash bir tekniktir. Tekrarsýz kod yazma tekniði
	// Java her data için hashing tekniðini kullanarak bir code uretir. Bu code'u hashCode() methodu kullanýlýr.
	
		
		System.out.println(hs1.hashCode()); // 2728458 --> hs1 bir obje onun için uretilen code'u verir
		
		
		
		
		
	}


}
