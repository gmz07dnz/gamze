package day27Inheritance;

public class Runner {

	public static void main(String[] args) {
		
		
//	Animal anm = new Animal();  // Animal() ==> default constructor'dýr. Kendimiz olusturalým class'a gidip
//	
//	anm.action();
//	anm.feed();
//	System.out.println(anm.isBirth); // true
//	
//	System.out.println("==========");
	
	
//	Mammal mml = new Mammal();
//	
//	mml.action();   // animal class'tan
//	mml.feed();     // animal class'tan
//	mml.see();
//	mml.sutIleBeslen();
//    System.out.println(mml.isBirth);  // animal class'tan
//	System.out.println(mml.isFly);
//	System.out.println(mml.name);
//	
//	System.out.println("===========");
//	
//	
	Cat ct = new Cat();
	
	ct.action();   // animal class'tan
	ct.feed();     // animal class'tan
	ct.see();      // Mammal Class'tan
	ct.sutIleBeslen();   // Mammal Class'tan
    System.out.println(ct.isBirth);  // animal class'tan
	System.out.println(ct.isFly);  // Mammal Class'tan
	System.out.println(ct.name);   // Mammal Class'tan
	
	ct.miyav();
	
	}

}
