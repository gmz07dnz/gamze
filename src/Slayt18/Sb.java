package Slayt18;

public class Sb {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("animal");
		
		String sub1 = sb.substring(3);
		 
		System.out.println(sub1); // mal
		
		String sub2 = sb.substring(2, 5);
		
		System.out.println(sub2); // ima
		
		sb.indexOf("n");
		System.out.println(sb.indexOf("n")); // 1
		
		int lng = sb.length();
		System.out.println(lng); //6
		
//		char ch = sb.charAt(6);
//		System.out.println(ch );// run TE
		

		StringBuilder sb1 = new StringBuilder();

		sb1.append("A").append("B");
		
		System.out.println(sb1);// AB
		
		StringBuilder sb2 = new StringBuilder().append("A");
		
		System.out.println(sb2); // A
		
		sb2.append("b").append("c");
		System.out.println(sb2);// Abc
		
		StringBuilder sb3 = new StringBuilder("animal");
		sb3.insert(0,"X");
		 System.out.println(sb3); //Xanimal

	    sb3.insert(7, "X");
	    System.out.println(sb3); // XanimalX
	    
	    sb3.insert(4, "X");
	    System.out.println(sb3);// XaniXmalX
	    
	    
	    StringBuilder sb4 = new StringBuilder("abcdef");
	    sb4.delete(1, 3); 
        System.out.println(sb4); // adef
        
        StringBuilder sb5 = new StringBuilder("abcef");
        sb5.deleteCharAt(2); 
        System.out.println(sb5); // abef
        
//        sb5.deleteCharAt(4);
//        System.out.println(sb5); // throws an exception
        
        
	    sb5.reverse();
	    System.out.println(sb5);// feba
	    
	    sb5.toString();
	    System.out.println(sb5); // feba
	    
	    
	   
	}
}
