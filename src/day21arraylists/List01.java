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
		
		System.out.println(ls); // [B, A, M]  ==> biz hangi s�rayla yazarsak o sekilde yazar.
		
		
		// M ile A aras�na K koyal�m
		
		ls.add(2, "K");
		System.out.println(ls); // [B, A, K, M]   ==> ayn� isimli methodlar varsa "METHODOVERLOADING" diyoruz
		
		// Bn�n sol taraf�na "S" koyal�m
		
		ls.add(0, "S"); //
		
		System.out.println(ls);
		
		// M'n�n sag taraf�na "T"  
		// M en sonda oldugu i�in direk ekleyebiliriz zaten sona koyacak index ile ugrasmaya gerek yok
		
		ls.add("T");
		System.out.println(ls); // [S, B, A, K, M, T]
		
		
		// listin eleman say�s�n� bulmak
		
		ls.size();
		System.out.println(ls.size()); // 6
		
		
		// bir list'in bos olup olmad�g�n� kontrol
		
		ls.isEmpty();
		System.out.println(ls.isEmpty()); // false ==> bos mu diye soruyor
		
		
		// index ile eleman silmek
	
		System.out.println(ls.remove(2)); // A yazar index kullanarak sildigimizde bunu yazarsak sild�g� eleman� ekrana yazar.
		System.out.println(ls); // [S, B, K, M, T]
		 
		
		// bir listten eleman ismi ile eleman silmek
		
		System.out.println(ls.remove("T")); // T 'yi sil dedin g�rev basar�yla olmustur diyor.
		
		System.out.println(ls); // [S, B, K, M]
		
		System.out.println(ls.remove("X")); // false ==> silme i�lemini yapamad� rapor veriyor yapamad�m diye
		
		System.out.println(ls.remove("M")); // ilk g�rd��� M'yi siler.Arkas�nda loop cal�s�r . ilki gorunce siler ve loop k�r�l�r.
		                                    // true
		
		System.out.println(ls); // [S, B, K, M]
		
		
		// bir listte istenen eleman�n varolup olmad�g�n� kontrol etmek
		
		

	}

}
