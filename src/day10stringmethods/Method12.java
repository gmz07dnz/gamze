package day10stringmethods;

public class Method12 {

	public static void main(String[] args) {
		
		/*
		 *replace(oldChar, newChar) methodu ==>  bir stringi degi�tirmek de kullan�l�r.
		 *degi�tirilen ve degi�en ayn� cins yan� char char ya da string string
		 */
		
		String s1 = "Tekrar et tekrar unutma";
		
		// s1.replace(oldChar, newChar)
		
		s1.replace('e', 'E');
		System.out.println(s1.replace('e', 'E')); // TEkrar Et tEkrar unutma
		                                          // k�c�k e leri b�y�klerle degi�tirecek 
		
		
		System.out.println(s1.replace('x', 'M')); // Tekrar et tekrar unutma
	                                              // x olmad�g� i�in yapacak i� yok der ayn�s�n� verir
		
		System.out.println(s1.replace("krar", "miz"));// Temiz et temiz unutma
		                                              //krar yerine miz yazd�
		
		System.out.println(s1.replace("a", "")); //Tekrr et tekrr unutm
		                                         // istedi�imiz birseyi imha edebiliriz. burda a a harflerini ��karm�� olduk
		 
		
		System.out.println(s1.replace("", "|")); // |T|e|k|r|a|r| |e|t| |t|e|k|r|a|r| |u|n|u|t|m|a|
		
		
		
		
		
		
		
		
	}

}
