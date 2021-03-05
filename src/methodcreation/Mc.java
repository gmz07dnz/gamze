package methodcreation;

public class Mc {

	public static void main(String[] args) {
	
   toplama(3,5);
   toplama (6.3,1.2);
   carpma(1.1, 5.2);	
  
		
	}
	
	public static void toplama(double a, double b) {      // 5 adým var
		
		System.out.println(a+b);
	}

	
	public static void carpma(double a, double b) {
		System.out.println(a*b);
	
	}
	public static void carpma(int a, double b) {
		System.out.println(a*b);
	
	}
	public static void carpma(double a, int b) {
		System.out.println(a*b);
	
	}
	
	public static void carpma (double a, double b, double c) {
		System.out.println(a*b*c); 
	}
	
	public static void carpma(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void carpma(int a, int b,int c) {
		System.out.println(a*b*c);
	}
}
