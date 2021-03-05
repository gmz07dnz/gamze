package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		/*
		 1)Elemanlarýný kullanýcýnýn girdiði bir String list olusturunuz.Stringlerin tamamý rakamlardan 
		 olussun.
		 2) Elemanlarýnýn carpýmýný ekrana yazýnýz.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		List<String> ls = new ArrayList<>();
		
		
		String str="";
		
		do {
		
			System.out.println("Elemanlarý rakamlardan olusan bir String giriniz \n String girmeyi durdurmak için 'S' ye basýnýz");
			 str = scan.next();	
			if (!(str.equalsIgnoreCase("s") )) {
			 ls.add(str);
			}
			
		}while ( !(str.equalsIgnoreCase("s") ));
		
		System.out.println(ls);
		
		int product = 1;
		
		for (int i = 0 ;i<ls.size(); i++) {
		
		product = product*	Integer.parseInt(ls.get(i));
			
		}
		
		System.out.println(product);
	
		scan.close();
		
	}

}
