package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		
		// liste eleman ekleme
		
		ls.add("B");
		ls.add("A");
		ls.add("M");
		ls.add("M");
		
		System.out.println(ls); // [B, A, M]  ==> biz hangi sýrayla yazarsak o sekilde yazar.
		
		
		// M ile A arasýna K koyalým
		
		ls.add(2, "K");
		System.out.println(ls); // [B, A, K, M]   ==> ayný isimli methodlar varsa "METHODOVERLOADING" diyoruz
		
		// Bnýn sol tarafýna "S" koyalým
		
		ls.add(0, "S"); //
		
		System.out.println(ls);
		
		// M'nýn sag tarafýna "T"  
		// M en sonda oldugu için direk ekleyebiliriz zaten sona koyacak index ile ugrasmaya gerek yok
		
		ls.add("T");
		System.out.println(ls); // [S, B, A, K, M, T]
		
		
		// listin eleman sayýsýný bulmak
		
		ls.size();
		System.out.println(ls.size()); // 6
		
		
		// bir list'in bos olup olmadýgýný kontrol
		
		ls.isEmpty();
		System.out.println(ls.isEmpty()); // false ==> bos mu diye soruyor
		
		
		// index ile eleman silmek
	
		System.out.println(ls.remove(2)); // A yazar index kullanarak sildigimizde bunu yazarsak sildýgý elemaný ekrana yazar.
		System.out.println(ls); // [S, B, K, M, T]
		 
		
		// bir listten eleman ismi ile eleman silmek
		
		System.out.println(ls.remove("T")); // T 'yi sil dedin görev basarýyla olmustur diyor.
		
		System.out.println(ls); // [S, B, K, M]
		
		System.out.println(ls.remove("X")); // false ==> silme iþlemini yapamadý rapor veriyor yapamadým diye
		
		System.out.println(ls.remove("M")); // ilk gördüðü M'yi siler.Arkasýnda loop calýsýr . ilki gorunce siler ve loop kýrýlýr.
		                                    // true
		
		System.out.println(ls); // [S, B, K, M]
		
		
		// bir listte istenen elemanýn varolup olmadýgýný kontrol etmek
		
		

	}

}
