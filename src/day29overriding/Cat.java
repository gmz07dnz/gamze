package day29overriding;

public class Cat extends Animal {
	
	@Override   // annotaion'd�r. ==> bunu yaz�nca java benim kodlar�m� kontrol ediyor.override yazmasayd�k bunu yeni bir method olarak anlar
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
		return new Cat();  //  Cat yazabiliyoruz c�nk� cat animal'�n cocugu
	}
	
//	@Override              == > static merthodlar override edilemezler
//	public static void eat() {
//	System.out.println("kediler s�t i�erler");
//	}

}
