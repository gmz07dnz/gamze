package methodcreation;

public class Mc1 {

	
	public static void main(String[] args) {
		
	toplama(3,5);	 // 8.0
	toplama (1.2, 6.5); // 7.7
	toplama (7,9,8.7);
     carpma(2.1,8.9);
     carpma (1,2,3);
     carpma(3,5);
	}
	
	public void toplama() {      
		
	}

 public static void toplama(double a, double b) {      
		System.out.println( a+ b);
	} 

 public static void toplama(double a, double b, double c) {      
	System.out.println( a+ b +c);
}
	

 public static void carpma(double a, double b) {     
	 System.out.println(a*b);
 }
 
 public static void carpma(double a, double b,double c) {
	 System.out.println(a*b*c);
 }	
 
 public static void carpma(int a, int b) {
	 System.out.println(a*b);
 }
 public static void carpma(int a, double b) {
	 System.out.println(a*b);
 }
 
}
