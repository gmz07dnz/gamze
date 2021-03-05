package day10stringmethods;

public class StringOdev01 {

	public static void main(String[] args) {
		
		
	String str = "Cat, caterpillar";
		
	System.out.println(str.lastIndexOf("a")); // 14
		
	System.out.println(str.lastIndexOf("at")); // 6	
		
	System.out.println(str.lastIndexOf("s")); // -1
		
	System.out.println(str.lastIndexOf("Cat")); // 0
		
	System.out.println(str.lastIndexOf("pars")); // -1	
		
	System.out.println(str.lastIndexOf("a" , 3 )); // 1

	System.out.println(str.lastIndexOf("a" , 5 )); // 1
	
	System.out.println(str.lastIndexOf("at", 2)); // 1
	
	System.out.println(str.lastIndexOf("at", 7)); // 6
	
	String str1 = "";
	System.out.println(str1.isEmpty()); // true
	
	String str2 = " ";
	System.out.println(str2.isEmpty()); // false
	
	String str3 = "Almanya";
	System.out.println(str3.isEmpty()); // false
	
	
	}

}
