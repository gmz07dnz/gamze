package constructors;

public class Animal {

	int age;
	String name;
	String cins;
	int numberOfLegs;
	
	public Animal () {
		System.out.println("parametresiz Animal");
	}
	public Animal(String name) {
		this();    // constructor cagrýsý , iki constructor'ý birbirine baglýyor.
		System.out.println("Name parametreli");
		}
	
	 public Animal(int age) {
	
	System.out.println("Age parametreli");
	}
	
  public Animal(String name, int age) {
		
	  System.out.println("name ve age parametreli");
	}
	
	public static void main(String[] args) {
	
		Animal a1 = new Animal("Cat");

	}

}
