package day29overriding;

public class Cat extends Animal {
	
	@Override   // annotaion'dýr. ==> bunu yazýnca java benim kodlarýmý kontrol ediyor.override yazmasaydýk bunu yeni bir method olarak anlar
	public void ses() {
		
		System.out.println("kediler miyavlar");
		
	}

	@Override
	protected Integer add() {
		
		return 1+2;
	}

	@Override
	public int multiply() {
		return 1*2;
	}

	@Override
	public Animal create() {
		return new Cat();  //  Cat yazabiliyoruz cünkü cat animal'ýn cocugu
	}
	
//	@Override              == > static merthodlar override edilemezler
//	public static void eat() {
//	System.out.println("kediler süt içerler");
//	}

}
