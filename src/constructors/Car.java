package constructors;

public class Car {

	int price;
	int year;
	String make;
	String model;
	String color;
	boolean isDiesel;
	double km;

	
	
	public Car(int price,int year,String make,String color) {
       	this.price=price;
       	this.year =year;
       	this.make = make;
       	this.color = color;
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
		
	Car car2 = new Car(50000, 2020, "Toyota", false, "3.35i", "black", 0);	//Const olan class yanýna gelip parantez koymadan bekleyip 
	                                                                        // ctrl space basýnca cýkan pencerede const secenekleri oluyor

	
	Car car1 = new Car(10000000, 2020, "Ferrari", "mor"); // goncanýn arabasý
	System.out.println(car1.price);
	System.out.println(car1.km);// 0.0
	
		
	Car car3 = new Car (100000, 2021,"BMV","white"); // mervenin arabasý
	
	System.out.println(car3.color); // white
	}

}
