package day10stringmethods;

public class Method13 {

	public static void main(String[] args) {
		/*
		 * regular expression : replace ile specific degi�imler yap�yoruz ama bazen tamam�n� degi�tirmek gerekebiliyor.
		 * belli t�redeki karakterleri secebilmemizi saglar.
		 * char ile �al��maz . 
		 * 1) \\d ==> regular expression d�r . b�t�n rakamlar� kasteder
		 *  \\D ==> rakam d�s�ndakiler
		 * 2)\\w ==>A-> Z ve   a->z  ve   0->9  ve   _ vard�r        w harfi word
		 *   \\W ==> A-> Z ve   a->z  ve   0->9  ve   _  d���ndaki her�ey
		 * 3) \\s ==> space
		 *   \\ S ==> space d���ndakiler
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
