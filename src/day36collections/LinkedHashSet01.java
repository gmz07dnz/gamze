package day36collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

	/*
	 * LinkedHashSet'ler 1)Tekrarlý eleman kabul etmezler
	 *                   2)Elemanlarý ekleme sýrasýna(insetion order) göre dizilirler
	 *                   3)LinkedHashSet, HashSet'ten yavastýr.
	 */
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("Ali");
		lhs1.add("Canan");
		lhs1.add("Veli");
		lhs1.add("Remziye");
		System.out.println(lhs1); // [Ali, Canan, Veli, Remziye]
	}
	

	
}
