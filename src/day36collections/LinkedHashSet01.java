package day36collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {

	/*
	 * LinkedHashSet'ler 1)Tekrarl� eleman kabul etmezler
	 *                   2)Elemanlar� ekleme s�ras�na(insetion order) g�re dizilirler
	 *                   3)LinkedHashSet, HashSet'ten yavast�r.
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
