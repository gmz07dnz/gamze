package day17constructorsstatickeyword;

public class Insan {
     
	int age;
	String name;
	int height;
	boolean isHonest;
	String job;
	String gender;
	
	
	 /*
    1) Costructor i�inden baska constructor cag�rmak i�in "this()"kullan�rsan�z mutlaka ilk sat�ra yazmal�s�n�z.Aksi takdirde CTE al�rs�n�z.
    2) Bir constructor i�inden sadece bir tane constructor cagr�s� yapabilirsiniz.��nk� 2 tane cagr� yaparsan�z birisi ilk sat�rda 
    olamayacakt�r. Bu da ilk kuralla celi�ir. ";" den sonra sat�r bitmi� demektir.
    3) this.age olan� yazabiliriz 2. sat�ra . Cunku bu constructor cagr�s� degildir.
    */
	

	
	public Insan() {	
	
    System.out.println("parametresiz");
	}
	
	public Insan(String name) {	
	    this();    // ali yaz�nca asag�da buraya gelir this(); oldugu i�in parametresiz constructor'a gider �nce onu okutur.Sonra buraya d�ner tekrar
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
