package day32exception;

public class E02 {
	
	/*
	 1) Exception olustugunda console'da sadece mesaj� g�rmek isterseniz e.getMessage(); kullan�n�z
	 */
	
	public static void main(String[] args) {
		
		int a = 12;
		int b = 0;
		
		try {
		System.out.println(a/b);
	}catch (ArithmeticException e) {
		System.out.println(e.getMessage()); // by zero
	}
		
	}
	

}
