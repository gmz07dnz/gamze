package day18staticblockarrays;

public class StaticBlock01 {

	
	static double pi;  // variable atamad�g�m�z i�in java bunu "  0.00" atad�.
	
	static String s;
	
	/*
	 1) Static block static variable'lara deger atamas� yapmak(initialize) i�in kullan�l�r.
	 static double pi = 3.14; yapabiliriz ve i�imizi de g�r�r ama static block daha fasrkl� bir �zelli�i var.
	 
	 2) Static block class olusturulurken b�t�n methodlardan (main method dahil) �nce cal�st�r�l�r.
	 
	 3 ) bir class'ta birden fazla static block olabilir.�stteki �nce cal�s�r.
	 */
	
	static {
		pi=3.14;
	System.out.println(pi); // 3.14
	}
  
	static {
		s = "Ali" + pi;
	System.out.println(s); // Ali3.14
	}
	
	
	public static void main(String[] args) {
		alanDaire(10);
		
	}

	public static void alanDaire(double r) {
		
		System.out.println("Dairenin alan�: "+ pi *r*r); // pi staticte oldugu i�in tekrar degerini belirtmeye gerek yok.�nce 
		                                                 // o cal�sacak her methodda kullan�labilir. tekrar tekrar her methodda 
		                                                 // belirtmeye gerek yok
	}
	
	
	
}
