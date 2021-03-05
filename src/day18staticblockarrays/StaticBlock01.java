package day18staticblockarrays;

public class StaticBlock01 {

	
	static double pi;  // variable atamadýgýmýz için java bunu "  0.00" atadý.
	
	static String s;
	
	/*
	 1) Static block static variable'lara deger atamasý yapmak(initialize) için kullanýlýr.
	 static double pi = 3.14; yapabiliriz ve iþimizi de görür ama static block daha fasrklý bir özelliði var.
	 
	 2) Static block class olusturulurken bütün methodlardan (main method dahil) önce calýstýrýlýr.
	 
	 3 ) bir class'ta birden fazla static block olabilir.Üstteki önce calýsýr.
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
		
		System.out.println("Dairenin alaný: "+ pi *r*r); // pi staticte oldugu için tekrar degerini belirtmeye gerek yok.önce 
		                                                 // o calýsacak her methodda kullanýlabilir. tekrar tekrar her methodda 
		                                                 // belirtmeye gerek yok
	}
	
	
	
}
