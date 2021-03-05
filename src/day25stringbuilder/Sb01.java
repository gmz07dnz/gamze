package day25stringbuilder;

public class Sb01 {

	public static void main(String[] args) {
		
		/*
		 1) String Class'� immutable (Degi�tirilemez)'d�r. Java "mutable" (Degi�tirilebilir) Stringler uretebilmemiz i�in 
		 "StringBuilder" isimli bir class �retti.
		 
		 2) Java'da StringBuilder ile hemen hemen ayn� i�i yapan StringBuffer Class'� var.StringBuffer class'� StringBuilder class'�ndan �nce
		 �retilmi�ti. StringBuffer yavas , StringBuilder h�zl� cal���r. StringBuffer "syncronize" i�lemlerini yapabilir ama StringBuilder
		 yapamaz.
		 
		 3) ayn� anda bir cok i�in yap�lmas�na "mult� threading " denir. multi ==> cok , thread ==> yap�lan i�lerin herbiri 
		 Multi threading varsa, bu i�ler�n s�raya konmas�n� laz�m . Buna "synchorization " denir.
		 */
		
		String str = "Learn";
		
		concat(str);   // bu method i�ine learn alacak X ekleyecek ==> LearnX yazd�. bu degi�en str'nin kopyas�
		               //str = concat(str); yapsak str degi�irdi.

		System.out.println(str); // Learn ==> sonun X eklemi�tik oysa ki ust k�s�mda ama str'yi yani orj�nal hali yazd�r�nca y�ne eski haline d�nuyr
		
	/*
	Stringler'de atama yapmadan degeri degi�tirmek m�mk�n degildir .Bunun 2 sebebi var.
    1) Java pass by value kullan�r.
    2) String class'� immutable(Degi�tirilemez) Class't�r.
	*/
		
	}

	private static void concat(String str) {// metodu getirirken i�ine bir string atacak ve ona "X" ekleyecek 
		System.out.println(str+"X");
		
	}

	
	
	
	
	
	
}
