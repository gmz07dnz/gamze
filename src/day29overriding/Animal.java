package day29overriding;

public class Animal {
	
	
	public void ses() {
		System.out.println("ses cıkarırlar");
	}

	protected Integer add() {
		return 3+4;
	}
	
	public int multiply () {
		return 3*4;
	}
	
	
	public Animal create() {
		return new Animal();
	}
	
	
	public static void eat() {
		System.out.println("yerler");
	}
	
	
	public final void eat1() {
		System.out.println("yerler");
	}
}
