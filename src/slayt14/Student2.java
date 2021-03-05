package slayt14;

public class Student2 {

	 int age;
	 String name;
	 String phone;

	 Student2(String name, int age,String phone ){
		 
			this.name = name;
			 this.phone = phone;
	 }
	 
	 
 public static void main(String[] args) {
		
	// Student2 s1 = new Student2(); // boyle bir constructo yok cte
 
	 Student2 s2 = new Student2("John",25,"123456");
	 System.out.print(s2.name +", "+s2.age+", "+s2.phone);
	 
	}

}
