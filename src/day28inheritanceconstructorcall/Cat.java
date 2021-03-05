package day28inheritanceconstructorcall;

public class Cat extends Mammal {
	
	public int c = 2;
	public int d = 5;
	
	
	public Cat () {
		
		System.out.println("parametresiz cat");
	}
	
	
	public Cat(String s) {
		this();
		System.out.println(super.c);  // 4 parent class'tan variable veya method secmek için "super" keywordunu kullanabilirsiniz.
		System.out.println("parametreli cat");
	}
	
	public void mC() {
    	System.out.println("Cat");
	}
    
}
