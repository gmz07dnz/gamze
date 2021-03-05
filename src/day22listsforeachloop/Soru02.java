package day22listsforeachloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		

		/*
		 Kullan�c�dan tam ismini al�n.
		 ismin harflerini bir liste ekleyin
		 harfleri alfebetik s�rada b�y�k harfler oalrak yaz�n
		 harfleri alfebetik s�ran�n tersinde buyuk harfler olarak yaz�n
		 */

		//  Kullan�c�dan tam ismini al�n
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Tam isminiz giriniz");
	String name = scan.nextLine().toUpperCase().replace(" ", "");
	
	// ismin harflerini bir liste ekleyin
	
	List<Character> ls = new ArrayList<>();
	
	for ( int i = 0 ; i<name.length(); i++) {
		
		ls.add(name.charAt(i));
	}
	System.out.println(ls);

	// harfleri alfebetik s�rada b�y�k harfler olarak yaz�n
	
	Collections.sort(ls);
	System.out.println(ls);
	
	// harfleri alfebetik s�ran�n tersinde buyuk harfler olarak yaz�n
	
	   // 1.yol
	
//	Collections.reverse(ls);
//	System.out.println(ls);
	
	
	// 2.yol
	
	List<Character> ls1 = new ArrayList<>();
	for (int k = ls.size()-1; k >= 0; k--) {
		ls1.add(ls.get(k));
	}
	System.out.println(ls1);
	
	
	
	
	scan.close();
	
	}
}
