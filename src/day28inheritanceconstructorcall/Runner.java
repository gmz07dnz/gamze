package day28inheritanceconstructorcall;

public class Runner {

	public static void main(String[] args) {
		
		
		
		Cat c1 = new Cat("X");
		
		// Ayný isimli variable'lardan hamgisinin kullanýldýgýna karar vermek için oluþturulan object'in data type'ýna bakýnýnz.
		// Variable'ý arastýrmaya data type'ý class'ýndan baslayýnýz.
		

	System.out.println(c1.a); // 0
	System.out.println(c1.c); // 2
	System.out.println(c1.d); // 5
	System.out.println(c1.m); // 1
	
	
	Mammal c2 = new Cat("X");
	
	System.out.println(c2.c); // 4
	System.out.println(c2.m); // 1
//	System.out.println(c2.d); // CTE verir d variable'ý altta kalýyor. Alta bakmýyor
	
	
	Cat c3 = new Cat();
	c3.mA();
	c3.mC();
	c3.mM();

	
	// Method cagrýlýrken ayný isimli methodlardan hangisinin kullanýlacagýna constructor karar verir.Methodlarý arastýrmaya constructor ismini
	// tasýyan classtan baslayýp parent'larda aramaya devam eder.
	
	Mammal c4= new Mammal();
	
	c4.mA();
	c4.mM();
	c4.mC();
	
	
	
	
	}

}
