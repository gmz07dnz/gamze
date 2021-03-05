package day28inheritanceconstructorcall;

public class Mammal extends Animal {
	
	public int m = 1;
	public int c= 4;
	
	
	public Mammal() {
		this('y');              // super(); ==> örüünür yapmak yada yapmamak arasında bir fark yok. her zaman ilk satırda olur.
		System.out.println("parametresiz mammal");
	}
	
	
	public Mammal(char c) {
		super(17);
		System.out.println("parametreli mammal");
	}
	public void mM() {
		System.out.println("Mammal");
	}
	
		public void mC() {
	    	System.out.println("Mammal + Cat");
	}
	
	
}
