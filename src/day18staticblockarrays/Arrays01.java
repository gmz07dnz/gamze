package day18staticblockarrays;
import java.util.Arrays;

public class Arrays01 { 
	
	// deftere yazdým .

	 int x = 12;
	 
	 
	public static void main(String[] args) {
		// array olusturmak
		int a[] = new int[4]; // deger atamasý yapmazsak default value yazar.
		System.out.println(Arrays.toString(a));
		
		// Array eleman ekleme
		a[0]=8; // a array'inde index'i 0 olan sayý 8 olsun.
		System.out.println(Arrays.toString(a)); // [8, 0, 0, 0]

		
		// 3. eleman 15 yap ekrana yazdýr
		
		a[2]=15;
		System.out.println(Arrays.toString(a)); // [8, 0, 15, 0]
		
		a[3] = 8; 
		System.out.println(Arrays.toString(a)); // [8, 0, 15, 8]

	
	
	// array'de kac eleman oldugunu bulmak
	//	a.length (nokta koyunca cýkýyor listeden .array length 'de parantez yok
		
		System.out.println(a.length); // 4
	
	
	// string array olusturmak
		
		String s[] = new String[3];
	System.out.println(Arrays.toString(s)); // [null, null, null] 
	
	s[0] = "Ali";
	System.out.println(Arrays.toString(s)); // [Ali, null, null]
	
	s[1] = "Ayse";
	
	System.out.println(Arrays.toString(s)); // [Ali, Ayse, null]
	
	
	// Bir array'den specific bir elemaný yazdýrmak
	
	System.out.println(s[0]);// ali
	System.out.println(s[1]);// ayse
	
	
	// s arraydaki elemanlarý alt alta consola yazdýrýn
	
	for(int i =0; i<s.length; i++) {
		System.out.println(s[i]);
	}
	
	// a array'deki elemanlarý önlerine "*" koyarakterseten yazdýrýn.
	
	for(int i =a.length-1; i>=0; i--) {
		System.out.print("*" +a[i]);
	}
	
	System.out.println();
	
	// a array'inde index'i cift olanlarý yazdýrýn
	
	for(int i =0; i<s.length; i++) {
		if (i%2==0) {
		System.out.println(a[i]);
	}
		}
	
	// array'deki elemanlarý kücükten buyuge (ascending order) sýralayýnýz.
	Arrays.sort(a); 
	System.out.println(Arrays.toString(a));
	}

	
	// sort() methodunu s array'i için kullanýnýz
	// string array'lerde alfebetic sýralama yapar.
	// Java'da kucukten buyuge siralama ve alfabetik sýralama yerine "Natural Order" kullanilir.

	
}
