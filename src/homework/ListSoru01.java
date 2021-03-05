package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSoru01 {

	/*
	  Elemanlar�n� kullan�c�n�n g�rd�g� b�r String list olusturunuz.Stringler�n tamam� rakamlardan olussun
	  bu listin elemanlar� carp�m�n� ekrana yazd�r�n
	 */
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		
		String num ="";
		do {
			System.out.println("Elemanlar� rakamlardan olusan String giriniz.\nIslemi durdurmak i�in'Q' harfine bas�n�z");
			num=scan.next();
			if(num.equalsIgnoreCase("Q")) {
				break;
			}
			list.add(num);
			
		}while(!num.equalsIgnoreCase("Q"));
		
		System.out.println(list);
		
		
		int product=1;
		
		for(int i=0; i<list.size();i++) {
			int listEleman = Integer.parseInt(list.get(i));
			product=product*listEleman;
			
		}
		
		System.out.println(product);
		
		scan.close();
		
	}
	
}
