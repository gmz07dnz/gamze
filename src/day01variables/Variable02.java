package day01variables;

public class Variable02 {
	public static void main(String[] args) {
		
		
	
		char harf1 = 'a'; // a n�n say� degeri 97
		char harf2 = 'b'; // b nin say� degeri 98
	
       System.out.println(harf1 + harf2); //cevap 97 + 98 = 195java: ben ztn bunlar�n say� degerini biliyorum 
                                          // harf ile harf toplanmaz sen demekki say� degerini istiyorsun diyor
		
	   System.out.println(harf1);	// a
	   System.out.println(harf2);   // b  , java : bunu 98 biliyrum ama sen demek ki sembolu g�rmek istiyorsun 
	                                // o yuzden ekranda "b" g�steriyor.
		
	// ASCII table kullanmadan bir char'�n say� degerini nas�l buluruz.
		  
		//'a' // 97 ==> bir tamsay�
		
		int aCharDeger = 'a'; // �nteger'a char atad�k normalde say� yaz�l�r. sadece char'lara �zel yap�l�r.
		                     // int secmi� sonra char atam�� demekki char�n sembolunu degil say�s�n� 
		                     //istiyor diyor
		
		System.out.println(aCharDeger);
		
		int bCharDeger = 'b';
		System.out.println(bCharDeger);
		
		int charDegerA = 'A';
		System.out.println(charDegerA);
		
		// data type int olan variable olu�turuyoruz char'� bu variable'a at�yoruz.
		
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
