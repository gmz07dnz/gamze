package day24varargsaccessmodifiers;

public class Vrgs01 {

	public static void main(String[] args) {
		
		/*
		 * her argument i�in method olusutrmsak gerekiyor. Bunu varargs ile c�zeriz. 
		 * Varargs list gibi davranan bir array'dir. Ne kadar arguments olursa olur al�r.
		 * Uzunlukta esnektir.Bu y�nuyle list gibi davran�yor. 
		 * Ama arakada array'leri kullan�r.Array'in t�m methodlar�n� kullan�r
		 * Varargs bir objedir. Uretilen herseye isim verilir.Her data tipi ile cali�ir.Array'in �zelliklerini tasid�g� �c�n
		 * Kac tane argument koyarsak koyal�m cal�s�r.
		 * Method parantezi i�inde birden fazla parametre varsa. Varargs en sona yaz�lmal�.
		 * Method parantezi i�inde birden fazla birden fazla varargs olamaz. En az birisi sondan baska biryere konmal�d�r.
		 * Bir tane olmal� en sonda olmal� 
		 * 
		 */
		
		add(3, 5);
		add(3,5,7);
        add (3,5,7,10,11);
        concat("gamze","deniz","derya");
        yazd�r( "isim","A", "B","C");
	}

	
	
//	public static void add(int a, int b) {  // static ==> main method i�inde kullan�lacak, void ==> ekrana yazacak.
//		System.out.println(a+b);
//		
//	}
//	
//	public static void add(int a, int b, int c) { 
//		System.out.println(a+b+c);
//		
//	}
	
	
	public static void add(int... a) { 
		int sum= 0;
		for ( int w: a) {
			sum = sum+w;
		}
		System.out.println(sum);
	}
	
	
	
	
	// varargs kullanarak verilen stringleri birle�tiren concat isimli bir method olusturunuz
	
	
	public static void concat(String... str) {
		String result ="";
		for ( String w: str) {
			result = result.concat(w);
		}
		System.out.println(result);
	}
	
	public static void yazd�r(String a, String... s) { // ==>main'deki yazd�r methodu gelir buray� bulur.ilk "isim" argumenti var.
		System.out.println(a);                         // onu al�r . Ilk parametre String a i�ine koyar.Bir tane al�r ve dolar.
		String s1 ="";                                 // Diger argumentleri varargs i�ine koyar.�nce varargs olsayd� doyma bilmedi�i
		for ( String w: s) {                           // i�in hepsini al�r.S�ra di�erine gelmez bo� kalmaz.
			s1 = s1.concat(w);                         
		}
		System.out.println(s1);
	}
	
}
