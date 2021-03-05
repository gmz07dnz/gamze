package day34Interface;

public class Civic extends Honda implements IcDonanim,Lastik{

	
	/*
	 Class'lari bir class'in parent'i yaparken "extends"
	 keyword kullanilir, "interface"leri bir class'in 
	 parent'i yaparken "implements" keyword kullanilir.
	*/
	
	
	@Override
	public void hareket() {
		System.out.println("hýzlý ve ekonomik hareket eder.");
		
	}

	@Override
	public void far() {
		System.out.println("led far");
		
	}

	@Override
	public void kaporta() {
		System.out.println("paslanmaz celik");
		
	}

	@Override
	public void koltuk() {
		System.out.println("ortopedik koltuk");
	}

	@Override
	public void direksiyon() {
	System.out.println("deri hidrolik direksiyon");	
		
	}

	@Override
	public void ayna() {
		System.out.println("oto karama özelliði var");
		
	}

	@Override
	public void garanti() {
		System.out.println("100000 km garanti");
		
	}

	@Override
	public void jant() {
		System.out.println("celik jant");
		
	}

	

}
