package day22listsforeachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		/*
		 1)Elemanlar�n� kullan�c�n�n girdi�i bir String list olusturunuz.Stringlerin tamam� rakamlardan 
		 olussun.
		 2) Elemanlar�n�n carp�m�n� ekrana yaz�n�z.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		List<String> ls = new ArrayList<>();
		
		
		String str="";
		
		do {
		
			System.out.println("Elemanlar� rakamlardan olusan bir String giriniz \n String girmeyi durdurmak i�in 'S' ye bas�n�z");
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
