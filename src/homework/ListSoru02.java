package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListSoru02 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan tam ýsmýný alýn 
		 * ismýn harflerýný býr lýste ekleyýn
		 * Harflerý alfabetýk sýrada buyuk harfler olarak yazýn
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Tam isminiz giriniz");
		String tamIsim = scan.nextLine();
		
		String isimHarfleri[] =tamIsim.replaceAll("\\s","").split("");
		
		System.out.println(Arrays.toString(isimHarfleri));
		
		List<String> list = Arrays.asList(isimHarfleri);
		
		System.out.println(list);
		
	
		Collections.sort(list);
		System.out.println(list);
		
		for(int i =0; i<list.size();i++) {
			list.set(i, list.get(i).toUpperCase());
		}
		System.out.println(list);
		
		
		scan.close();
		
	}

}
