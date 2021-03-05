package day10stringmethods;

public class Method13 {

	public static void main(String[] args) {
		/*
		 * regular expression : replace ile specific degiþimler yapýyoruz ama bazen tamamýný degiþtirmek gerekebiliyor.
		 * belli türedeki karakterleri secebilmemizi saglar.
		 * char ile çalýþmaz . 
		 * 1) \\d ==> regular expression dýr . bütün rakamlarý kasteder
		 *  \\D ==> rakam dýsýndakiler
		 * 2)\\w ==>A-> Z ve   a->z  ve   0->9  ve   _ vardýr        w harfi word
		 *   \\W ==> A-> Z ve   a->z  ve   0->9  ve   _  dýþýndaki herþey
		 * 3) \\s ==> space
		 *   \\ S ==> space dýþýndakiler
		 */

		
		String s1 = "Code1 yazarak2 ogrenilir3";
		
		//s1.replaceAll(regex, replacement)
		
	 //	s1.replaceAll("\\d", "*") ==> 1 gidecek * gelecek , 2 gidecek * gelecek , 3 gidecek * gelecek
		 
		System.out.println(s1.replaceAll("\\d", "*")); //Code* yazarak* ogrenilir*
		
		System.out.println(s1.replaceAll("\\D", "*")); // ****1********2**********3
		
		System.out.println(s1.replaceAll("\\w", "*")); // ***** ******** **********
		
		System.out.println(s1.replaceAll("\\W", "*")); // Code1*yazarak2*ogrenilir3
	   
		System.out.println(s1.replaceAll("\\s", "*")); // Code1*yazarak2*ogrenilir3
		
		System.out.println(s1.replaceAll("\\S", "*")); // ***** ******** **********
		
		
		
		
		
		
		
		
		
	}

}
