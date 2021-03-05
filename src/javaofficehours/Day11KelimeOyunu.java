package javaofficehours;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day11KelimeOyunu {
 
	
	public static void main(String[] args) {
		
		/*
		 * Kelime oyunu
		 * "ab" -> "aba" -> "kabak ->0
		 */
	
    List<String> list = new ArrayList<>();
    
    @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
    
    boolean devamMi =true;
    
    int sira =0;
    int oyunSayisi =0;
    
    
    while(devamMi) {
    	
    	sira = oyunSayisi%2 + 1;    
    
    System.out.println(sira+".oyuncu kelimeyi giriniz");
	String kelime = scan.next().toLowerCase();
	list.add(kelime);
	oyunSayisi++;
	devamMi = getDevamMi(list);
	
    }
    
    String kazanan= sira==1?"2.oyuncu kazand�":"1.oyuncu kazand�";
	System.out.println(kazanan);
	System.out.println(list);
	
	}

	private static boolean getDevamMi(List<String> list) {
		
		// Yaz�lan kelimenin uzunlugu ile bir �nceki kelimenin uzunlugu fark� 1 mi?
		// yaz�lan kelime bir �nceki kelimeyi kaps�yor mu?
		
		
		if(list.size()<2) {
			return true;
		}
		String sonKelime = list.get(list.size()-1);
		String birOncekiKelime =list.get(list.size()-2);
	
		if (sonKelime.length()-birOncekiKelime.length() !=1) {
			return false;
		}
	   if(!sonKelime.contains(birOncekiKelime)) {
		   return false;
	   }
	
	return true;
	}
}
