package day16constructions;

public class MethodCreation01 {

	public static void main(String[] args) {
		
	System.out.println(add(3,5));	// ekrana yazd�rmak i�in buray� tercih ediyoruz void d���nda biryere okutma pek tercih edilmez
		
	System.out.println(concatenate("ali", "veli"));	
	
	
	
		// return type void olunca java sikayet etmiyor.Onun d�s�ndaki her type i�in
        //  �ikayet ediyor.Bunu onune gecmek i�in alt�na mutlaka "return" yaz�n.Yoksa Compile Time Error olur                       
		// neyi return edecegini ( yani sunun sonucunu �st�yoruz diyoruz)soylemeliyiz. Return son noktad�r daha yazmaz	
		// cunku sonuctur bitmi�tir . Dolay�syla sonda olur .
		
	}
		
	public static int add(int a, int b) {
		return(a +b);
	}
    		 
    		 
	// Iki tane String'i concenate eden ve string return eden bir method olusturunuz.
	   // Bu method'u main method i�inden cagirip String'i ekrana yazd�r�n�z.		 
    		 
	public static String concatenate(String a, String b) {
		return(a.concat(b));
	}		 
    		 
    		 
    		 
    		 
    		 
    		 
		 
	}