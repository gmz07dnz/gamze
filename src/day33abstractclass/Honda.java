package day33abstractclass;

public abstract class Honda {
	
	/*
	 1) Bazen child class'lar parent class'daki methodlar�n body'lerini hep de�i�tirerek kullan�rlar.
	 Bu tip durumlarda parent class'daki methoda body koymak manas�z olur.��nk� parent class'daki method body hi� kullan�lmaz.
	 Bu manas�zl�g� gidermek i�in Java bize body'siz method �retme imkan� verir.Body'siz methodlara "abstract method" denir.
	 
	 2)Parent class'taki body'siz methodlar� child class'lar override etmek zorundad�rlar. Biz bir app olustururken child class'lar�
	 parent class'daki baz� methodlar� override etmek zorunda b�rakmak istersek o methodlar� abstract method yapar�z.
	 
	 3) Abstract method olu�turmak i�in 
	    a- "{}" k�sm�n� yazmay�n
	    b- access modifier'dan sonra "abstract" keywordunu kullan�n.
	  
	 4) Abstract method'lar sadece abstract class'lar i�inde olu�turulabilir.
	 
	 5) Abstract class olusturmak i�in access modifier'dan sonra "abstract" keywordunu kullan�n 
	 
	 6) Abstract keywordu ile method baody bir arada kullan�lmaz.
	 
	 7) Abstract class i�inde hem abstract hem de abstract olmayan (concrete) methodlar kullan�labilir.
	   
	  8) Bir concrete class abstract class�a extend ettiginde, abstract class icindeki tum abstract
	  methodlari override etmek zorundadir. Aksi takdirde Java Compile Time Error verir.Fakat concrete
	  methodlari override etmek zorunda degildir. Concrete methodlarin override edilmesi istege baglidir.
	  
	  9) Bir abstract class baska bir abstract class'a extend etti�inde herhangi bir methodu override etmek zorunda de�ildir. 
	  Isterse override eder istemezse etmez.
	  
	  10) Final class�larin child class�i olamaz. abstract class�lar child class�lara talimat vermek
	  icin olusturulurlar. Eger bir class�i final yaparsaniz o class�in child class�i olamayacagindan 
	  abstract olmasi mantikli degildir.Bu yuzden Java abstract class�larin final olmasina musaade etmez.
	  
	  11)abstract method uretmemizin sebebi child class'larin kullanabilmesidir.Eger methodu "final" yaparsak
	    bu o method override edilemez demektir yani; child class'lar kullanamaz demektir. Bu celiskiden dolayi
	    Java abstract methodlarin "final" olmasina musaade etmez. 
	
	 12)Abstract method'lar "private" olamazlar cunku abstract method'lar baska class'lar tarafindan 
	    kullanilmak icin uretilir. Halbuki "private" methodlar baska class'lar tarafindan kullanilamazlar. 
	 
	 13)Abstract method'lar static olamazlar. Cunku static methodlar override edilemezler halbuki biz 
	   abstract methodlari override etmek icin uretiriz.
	   
	      !!! ABSTRACT CLASSLARDAN OBJECT URETILEMEZ...
	           
	 */
	
	public abstract void motor();
	
	public void deri() {
		System.out.println("Koltuklar deri olsun");
	}

}
