package javapractice;

import java.util.ArrayList;
import java.util.List;

public class Day05Soru06 {

	public static void main(String[] args) {
		
		/*
		 * Input olarak verilen listteki isimlerden icinde ‘a’ harfi bulunanlari silen
		 * bir program yaziniz 
		 * INPUT : list1={Ali,Veli,Ayse,Fatma,Omer} 
		 * OUTPUT : [Veli,Omer]
		 */
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Ali");
		list.add("veli");
		list.add("ayse");
		list.add("fatma");
		list.add("ömer");
		
		List<String> list1 = new ArrayList<>();
		
//		for (int i = 0; i<list.size(); i++) {
//			if (list.get(i).toLowerCase().contains("a")) {
//				continue;
//			}else {
//				list1.add(list.get(i));
//			}
//			}
//		System.out.println(list1);
//		
		
		for (String w: list) {
			if(w.toLowerCase().contains("a")) {
				continue;
			}else {
				list1.add(w);
				
			}
		}
		System.out.println(list1);
		

	}

}
