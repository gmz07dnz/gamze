package day16constructions;

public class Car {

	int price;
	int year;
	String make;
	String model;
	String color;
	boolean isDiesel;
	double km;
	
	//  public Car() {  }   bu bir costructor'dýr. Kendimiz ürettik
	
	/*
	  this'deki " = " solundaki instance variable ,sagdaki parametre. int price'da , price yerine 5000 lira koyunca 
	  this.price = price' a gelir esitliðin sag tarýndaki price'a yollar aynýsý cunku . soldaki normalde class 
	  içindeki instance variable'a atama yapmýþ olur.Basta ataama olmadýgý için default value = 0'dý.
	  Class içindeki price'ý constructor kullanarak kendi istegimize göre degistirmis olduk.
	  Artýk car class'ý fiyatý 5000 olan bir araba verecek 
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
