package slayt14;

public class Student1 {

	 int age;
	 String name;

	 Student1(String name, int age){
		 
			this.name = name;
			 this.age = 21;
	 }
	 
	 
 public static void main(String[] args) {
		
	 Student1 st = new Student1("Oliver", 21);

	 System.out.print(st.name);
	 System.out.print(", "+st.age);
	}

}
