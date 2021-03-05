package day31exceptions;

public class E02 {
	
	//ARITHMETICEXCEPTION
	//try bölümünde hata yoksa catch calýþmaz.

	public static void main(String[] args) {
		
		int a = 12;
		int c= 0;
		
		try {
			System.out.println(a/c);
		}catch(ArithmeticException e) {
		System.out.println("Sayilar sifira bolunemezler");	
		
		}finally {
			System.out.println("finally block");
		}
		
		
		

	}

}
