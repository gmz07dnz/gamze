package day17constructorsstatickeyword;

public class InsanOrnek2 {

	int age;
	String name;
	int height;
	boolean isHonest;
	String job;
	String gender;
	
	public InsanOrnek2() {	 // parametresiz olan içine ne yazarsak onu yapar. Parametresinin olmamasýnýn önemi yok.
    this("nurse", "Erkek");
    System.out.println("parametresiz");
	}
	
	public InsanOrnek2(String name) {	
	   this();
		System.out.println("name parametreli");
	}
	
	public InsanOrnek2(String job, String gender) {	
		
		System.out.println("job ve gender parametreli");
	}
	
	
    public static void main(String[] args) {
	
//    	InsanOrnek2 i1 = new InsanOrnek2("Ahmet"); // job ve gender parametreli,parametresiz,name parametreli

		
		
		
	}

}
