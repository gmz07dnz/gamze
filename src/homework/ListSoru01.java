package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSoru01 {

	/*
	  Elemanlarýný kullanýcýnýn gýrdýgý býr String list olusturunuz.Stringlerýn tamamý rakamlardan olussun
	  bu listin elemanlarý carpýmýný ekrana yazdýrýn
	 */
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		
		String num ="";
		do {
			System.out.println("Elemanlarý rakamlardan olusan String giriniz.\nIslemi durdurmak için'Q' harfine basýnýz");
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
