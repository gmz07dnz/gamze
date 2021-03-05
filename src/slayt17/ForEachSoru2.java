package slayt17;

import java.util.ArrayList;
import java.util.List;

public class ForEachSoru2 {

	public static void main(String[] args) {

		/*
		 * Bir integer list oluþturunuz ve bu list’deki tum sayýlarýn karesinin
		 * toplamýný For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
		 */

		
		List<Integer> ls = new ArrayList<>();
		
		ls.add(1);
		ls.add(2);
		ls.add(3);
		
		System.out.println(ls);
		
		int sum = 0;
		
		for (Integer w: ls) {
			sum=sum+ (w*w);
		}
		System.out.println(sum);
		
		
		
		
	}

}
