package day16constructions;

public class Car {

	int price;
	int year;
	String make;
	String model;
	String color;
	boolean isDiesel;
	double km;
	
	//  public Car() {  }   bu bir costructor'd�r. Kendimiz �rettik
	
	/*
	  this'deki " = " solundaki instance variable ,sagdaki parametre. int price'da , price yerine 5000 lira koyunca 
	  this.price = price' a gelir esitli�in sag tar�ndaki price'a yollar ayn�s� cunku . soldaki normalde class 
	  i�indeki instance variable'a atama yapm�� olur.Basta ataama olmad�g� i�in default value = 0'd�.
	  Class i�indeki price'� constructor kullanarak kendi istegimize g�re degistirmis olduk.
	  Art�k car class'� fiyat� 5000 olan bir araba verecek 
	 */
	
	
	public Car( int price, int year, String make, boolean isDiesel  ) {  
	 this.price = price;	                                             
	 this.year = year;
	 this.make = make;
	 this.isDiesel = isDiesel;
	    }
	
	
	public Car(int price, int year, String make, boolean isDiesel , String model, String color, double km) {
		this.price = price;
		this.year = year;
		this.make = make;
		this.isDiesel = isDiesel;
		this.model = model;
		this.color = color;
		this.km = km;
	}

public static void main(String[] args) {
		
 Car car1 = new Car(5000, 2018, "Toyota", true);
	
 System.out.println(car1.price);  // 5000   
 System.out.println(car1.make); // Toyota
 System.out.println(car1.year); // 2018
 
 
 Car car2 = new Car(30000, 2017, "BMW", false, "3.35i", "Red", 50000);
 
 System.out.println(car2.price);

}

}
