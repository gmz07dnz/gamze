package day20multidimensionalarraysarraylists;


import java.util.ArrayList;
import java.util.List;

public class ArraysLists01 {

	public static void main(String[] args) {
		
		/*
		 1)List'ler primitive data type'lar�n� kaul etmez . Primitive data type'lar� yerinr wrapper class'lar� kullan�r�z.
		 */
		
		
		
     // ArrayList olusturma
		
		// 1. yol
	//	ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		// 2.yol
		
	//	ArrayList<Integer> list2 = new ArrayList<>();
		
		// 3.yol ==> recommended
	List<Integer> list3 = new ArrayList<Integer>();
		
	// console'a yazd�rma
	
	System.out.println("list3"); // [] bos olur . java default value atamaz.
	
	// eleman ekleme
	
	list3.add(12);
	System.out.println(list3); // [12]  eleman� ekledigimiz s�raya g�re koyar
	
	list3.add(3);
	System.out.println(list3); // [12, 3]
	
	
	
	
	}

}
