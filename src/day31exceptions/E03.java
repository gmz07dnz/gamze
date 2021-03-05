package day31exceptions;

public class E03 {

	// NullPointerException
	public static void main(String[] args) {
		
		String s = "";
		System.out.println(s.length()); //0
		
		String t = null;
		
		try {
		System.out.println(t.length()); // exception verir.

		}catch(NullPointerException e) {
			System.out.println("null Stringlerde length() methodu kullanýlmaz");
		}
		
		
	}

}
