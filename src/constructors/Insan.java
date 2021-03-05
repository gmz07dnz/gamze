package constructors;

public class Insan {
	int age;
    String name;
    int height;
    boolean isHonest;
    String job;
    String gender;
    
      public Insan() {
	  System.out.println("parametresiz"); 
   }
	
	public Insan(String name) {
		this();        
		System.out.println("name parametreli");
	}
	
	public Insan(String job, String gender) {
		this("Veli");
		System.out.println("job ve gender parametreli");
	}
	
	public static void main(String[] args) {
		
	//Insan i1 = new Insan("Ali");	
Insan i2 = new Insan("doktor", "bayan");
	
	
	
	
	
	}

}
