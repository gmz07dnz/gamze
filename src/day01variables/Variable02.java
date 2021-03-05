package day01variables;

public class Variable02 {
	public static void main(String[] args) {
		
		
	
		char harf1 = 'a'; // a nýn sayý degeri 97
		char harf2 = 'b'; // b nin sayý degeri 98
	
       System.out.println(harf1 + harf2); //cevap 97 + 98 = 195java: ben ztn bunlarýn sayý degerini biliyorum 
                                          // harf ile harf toplanmaz sen demekki sayý degerini istiyorsun diyor
		
	   System.out.println(harf1);	// a
	   System.out.println(harf2);   // b  , java : bunu 98 biliyrum ama sen demek ki sembolu görmek istiyorsun 
	                                // o yuzden ekranda "b" gösteriyor.
		
	// ASCII table kullanmadan bir char'ýn sayý degerini nasýl buluruz.
		  
		//'a' // 97 ==> bir tamsayý
		
		int aCharDeger = 'a'; // ýnteger'a char atadýk normalde sayý yazýlýr. sadece char'lara özel yapýlýr.
		                     // int secmiþ sonra char atamýþ demekki charýn sembolunu degil sayýsýný 
		                     //istiyor diyor
		
		System.out.println(aCharDeger);
		
		int bCharDeger = 'b';
		System.out.println(bCharDeger);
		
		int charDegerA = 'A';
		System.out.println(charDegerA);
		
		// data type int olan variable oluþturuyoruz char'ý bu variable'a atýyoruz.
		
		int charDeger1 = '!';
		System.out.println(charDeger1); // 33
		
		int charDeger2 = '%';
		System.out.println(charDeger2); // 37
		
		int charDeger3 = '*';
		System.out.println(charDeger3); // 42
		
		int charDeger4 = 'd';
		System.out.println(charDeger4); // 100
		  
	}

}
