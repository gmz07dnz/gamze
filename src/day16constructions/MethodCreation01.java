package day16constructions;

public class MethodCreation01 {

	public static void main(String[] args) {
		
	System.out.println(add(3,5));	// ekrana yazdýrmak için burayý tercih ediyoruz void dýþýnda biryere okutma pek tercih edilmez
		
	System.out.println(concatenate("ali", "veli"));	
	
	
	
		// return type void olunca java sikayet etmiyor.Onun dýsýndaki her type için
        //  þikayet ediyor.Bunu onune gecmek için altýna mutlaka "return" yazýn.Yoksa Compile Time Error olur                       
		// neyi return edecegini ( yani sunun sonucunu ýstýyoruz diyoruz)soylemeliyiz. Return son noktadýr daha yazmaz	
		// cunku sonuctur bitmiþtir . Dolayýsyla sonda olur .
		
	}
		
	public static int add(int a, int b) {
		return(a +b);
	}
    		 
    		 
	// Iki tane String'i concenate eden ve string return eden bir method olusturunuz.
	   // Bu method'u main method içinden cagirip String'i ekrana yazdýrýnýz.		 
    		 
	public static String concatenate(String a, String b) {
		return(a.concat(b));
	}		 
    		 
    		 
    		 
    		 
    		 
    		 
		 
	}