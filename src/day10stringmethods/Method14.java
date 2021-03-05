package day10stringmethods;

public class Method14 {

	public static void main(String[] args) {
		
		/*
		 * s1.startsWith(prefix); methodu     ... ile baþlar.
		 * boolean return eder.
		 * char kabul etmez
		 */
		
		
		String s1 = "Code1 yazarak2 ogrenilir3";

		s1.startsWith("C");
		
		System.out.println(s1.startsWith("C"));// true
		
		System.out.println(s1.startsWith("c"));// false
		
	    System.out.println(s1.startsWith("Code"));// true
		
		// s1 String'inin 4. character'i (index 3) "e" mi?
	    
	    System.out.println(s1.startsWith("e" , 3));// true
		
		
		
	}

}
