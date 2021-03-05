package day10stringmethods;

public class Method12 {

	public static void main(String[] args) {
		
		/*
		 *replace(oldChar, newChar) methodu ==>  bir stringi degiþtirmek de kullanýlýr.
		 *degiþtirilen ve degiþen ayný cins yaný char char ya da string string
		 */
		
		String s1 = "Tekrar et tekrar unutma";
		
		// s1.replace(oldChar, newChar)
		
		s1.replace('e', 'E');
		System.out.println(s1.replace('e', 'E')); // TEkrar Et tEkrar unutma
		                                          // kücük e leri büyüklerle degiþtirecek 
		
		
		System.out.println(s1.replace('x', 'M')); // Tekrar et tekrar unutma
	                                              // x olmadýgý için yapacak iþ yok der aynýsýný verir
		
		System.out.println(s1.replace("krar", "miz"));// Temiz et temiz unutma
		                                              //krar yerine miz yazdý
		
		System.out.println(s1.replace("a", "")); //Tekrr et tekrr unutm
		                                         // istediðimiz birseyi imha edebiliriz. burda a a harflerini çýkarmýþ olduk
		 
		
		System.out.println(s1.replace("", "|")); // |T|e|k|r|a|r| |e|t| |t|e|k|r|a|r| |u|n|u|t|m|a|
		
		
		
		
		
		
		
		
	}

}
