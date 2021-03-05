package day17constructorsstatickeyword;

public class Insan {
     
	int age;
	String name;
	int height;
	boolean isHonest;
	String job;
	String gender;
	
	
	 /*
    1) Costructor içinden baska constructor cagýrmak için "this()"kullanýrsanýz mutlaka ilk satýra yazmalýsýnýz.Aksi takdirde CTE alýrsýnýz.
    2) Bir constructor içinden sadece bir tane constructor cagrýsý yapabilirsiniz.Çünkü 2 tane cagrý yaparsanýz birisi ilk satýrda 
    olamayacaktýr. Bu da ilk kuralla celiþir. ";" den sonra satýr bitmiþ demektir.
    3) this.age olaný yazabiliriz 2. satýra . Cunku bu constructor cagrýsý degildir.
    */
	

	
	public Insan() {	
	
    System.out.println("parametresiz");
	}
	
	public Insan(String name) {	
	    this();    // ali yazýnca asagýda buraya gelir this(); oldugu için parametresiz constructor'a gider önce onu okutur.Sonra buraya döner tekrar
		System.out.println("name parametreli");
	}
	
	public Insan(String job, String gender) {	
		System.out.println("job ve gender parametreli");
	}
	
	
	
	public static void main(String[] args) {
	
//      Insan i1 = new Insan("Ali");  // parametresiz
                                    // name parametreli
		
		
		
		
		
		
		
	}

}
