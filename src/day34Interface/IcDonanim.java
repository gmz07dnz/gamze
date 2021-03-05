package day34Interface;

public interface IcDonanim {

	/*
	 1)Java "interface"ler icindeki tum methodlarin
	   abstract method olmasi gerektigini bilir. 
	   Bu yuzden siz method uretirken abstract yazsaniz da olur 
	   yazmasaniz da olur.
	   "public abstract void koltuk();" ile "public void koltuk();"
	   tamamaiyla aynidir.
	 2)Interface'lerdeki hersey otomatik olarak "public" dir. Bu yuzden access
	   modifier'i public olarak yazsaniz da olur yazmasaniz da olur.  
	   "public abstract void koltuk();" ve "public void koltuk();" ve "void koltuk();"
	   tamamiyla aynidir.
	 3)Normalde access modifier yazmayinca access modifier "default" olur ama
	   interface'lerde access modifier her zaman "public" oldugundan access modifier'i
	   yazmasaniz da o public'dir. 
	 4)Interface class degildir, interface interface'dir.    
	 */
	
	/*
	 1) interface'deki tum variable'lar "final"dir.
	    "final" variable olusturdugunuzda isimleri "bold" olarak yazilir.
	 2) "public static final String marka = "Honda";" ile "String marka = "Honda";" tamamiyla aynidir.
	 3) Genel kullanim olarak "final variable" larin isimleri buyuk harflerle yazilir. 
	 */
	
	
	//public abstract void koltuk();
	
	//public  void koltuk();
	
	
	int FIYAT = 30000; // asl�nda bas�nda public static final vard�r
	
	public static final String MARKA = "Honda"; // public static final hepsi i�in gecerli 
	
	
	 void koltuk();
	
	 void direksiyon();
	 void ayna();
	 
	 
	 
	 
	 
	 
}
