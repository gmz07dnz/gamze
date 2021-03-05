package Slayt18;

public class PassByValue {

	public static void main(String[] args) {
		
		double price = 100;
		discountForVeteran(price); // 80  ==> kopyasý degiþti
		discountForSeniors(price); // 90  ==> kopya degiþti
        System.out.println(price); // 100
	}

	
	
	public static void discountForVeteran(double price) {
		price = price*0.80;
		System.out.println(price); 
		
	}


    public static void discountForSeniors(double price) {
    	price= price*0.90;
    	System.out.println(price);
    }






}
