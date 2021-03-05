package day31exceptions;

public class E05 {
	
	//NumberFormatException

	public static void main(String[] args) {
		
		// javada sadce rakamlardan olusan stringleri say�ya dwegi�tirebiriz.
		// Integer wrapper class'�n�n i�inde parseInt() methodunu kullan�r�z.
		
		String s = "1234";
		System.out.println(s+5); //12345
		
		int iS = Integer.parseInt(s);
		System.out.println(iS+5);  // 1239
		
		String t = "1a2b";
		System.out.println(t +5);//1a2b5
		
		try {
		int iT = Integer.parseInt(t);
		System.out.println(iT +5); // exception
		}catch(NumberFormatException e) {
			System.out.println("String olu�turulurken rakam d�s�nda characterler kullan�lm�s");
		}

	}

}
