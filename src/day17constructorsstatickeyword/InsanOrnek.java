package day17constructorsstatickeyword;

public class InsanOrnek {

	int age;
	String name;
	int height;
	boolean isHonest;
	String job;
	String gender;
	
	public InsanOrnek() {	
	
    System.out.println("parametresiz");
	}
	
	public InsanOrnek(String name) {	
	   this();
		System.out.println("name parametreli");
	}
	
	public InsanOrnek(String job, String gender) {	
		this("veli");
		System.out.println("job ve gender parametreli");
	}
	
	
	
	
	public static void main(String[] args) {
	
		
 //  InsanOrnek i1 = new InsanOrnek("Doktor", "Bayan"); // parametresiz , name parametreli , job ve gender parametreli
		
		
		
		
		

	}

}
