package day24varargsaccessmodifiers;

public class Vrgs01 {

	public static void main(String[] args) {
		
		/*
		 * her argument için method olusutrmsak gerekiyor. Bunu varargs ile cözeriz. 
		 * Varargs list gibi davranan bir array'dir. Ne kadar arguments olursa olur alýr.
		 * Uzunlukta esnektir.Bu yönuyle list gibi davranýyor. 
		 * Ama arakada array'leri kullanýr.Array'in tüm methodlarýný kullanýr
		 * Varargs bir objedir. Uretilen herseye isim verilir.Her data tipi ile caliþir.Array'in özelliklerini tasidýgý ýcýn
		 * Kac tane argument koyarsak koyalým calýsýr.
		 * Method parantezi içinde birden fazla parametre varsa. Varargs en sona yazýlmalý.
		 * Method parantezi içinde birden fazla birden fazla varargs olamaz. En az birisi sondan baska biryere konmalýdýr.
		 * Bir tane olmalý en sonda olmalý 
		 * 
		 */
		
		add(3, 5);
		add(3,5,7);
        add (3,5,7,10,11);
        concat("gamze","deniz","derya");
        yazdýr( "isim","A", "B","C");
	}

	
	
//	public static void add(int a, int b) {  // static ==> main method içinde kullanýlacak, void ==> ekrana yazacak.
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
	
	
	
	
	// varargs kullanarak verilen stringleri birleþtiren concat isimli bir method olusturunuz
	
	
	public static void concat(String... str) {
		String result ="";
		for ( String w: str) {
			result = result.concat(w);
		}
		System.out.println(result);
	}
	
	public static void yazdýr(String a, String... s) { // ==>main'deki yazdýr methodu gelir burayý bulur.ilk "isim" argumenti var.
		System.out.println(a);                         // onu alýr . Ilk parametre String a içine koyar.Bir tane alýr ve dolar.
		String s1 ="";                                 // Diger argumentleri varargs içine koyar.önce varargs olsaydý doyma bilmediði
		for ( String w: s) {                           // için hepsini alýr.Sýra diðerine gelmez boþ kalmaz.
			s1 = s1.concat(w);                         
		}
		System.out.println(s1);
	}
	
}
