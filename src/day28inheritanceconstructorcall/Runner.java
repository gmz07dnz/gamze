package day28inheritanceconstructorcall;

public class Runner {

	public static void main(String[] args) {
		
		
		
		Cat c1 = new Cat("X");
		
		// Ayn� isimli variable'lardan hamgisinin kullan�ld�g�na karar vermek i�in olu�turulan object'in data type'�na bak�n�nz.
		// Variable'� arast�rmaya data type'� class'�ndan baslay�n�z.
		

	System.out.println(c1.a); // 0
	System.out.println(c1.c); // 2
	System.out.println(c1.d); // 5
	System.out.println(c1.m); // 1
	
	
	Mammal c2 = new Cat("X");
	
	System.out.println(c2.c); // 4
	System.out.println(c2.m); // 1
//	System.out.println(c2.d); // CTE verir d variable'� altta kal�yor. Alta bakm�yor
	
	
	Cat c3 = new Cat();
	c3.mA();
	c3.mC();
	c3.mM();

	
	// Method cagr�l�rken ayn� isimli methodlardan hangisinin kullan�lacag�na constructor karar verir.Methodlar� arast�rmaya constructor ismini
	// tas�yan classtan baslay�p parent'larda aramaya devam eder.
	
	Mammal c4= new Mammal();
	
	c4.mA();
	c4.mM();
	c4.mC();
	
	
	
	
	}

}
