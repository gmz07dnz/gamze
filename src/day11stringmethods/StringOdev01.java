package day11stringmethods;

public class StringOdev01 {

	public static void main(String[] args) {
		
		
//     		String str1 = "Cat, caterpillar";
//			System.out.println(str1.toUpperCase()); // CAT, CATERPILLAR
//			System.out.println(str1.toLowerCase()); // cat, caterpillar
//		    System.out.println(str1.toUpperCase().toLowerCase()); // cat, caterpillar
//			
//		
//		       String strA = "Cat ";
//		       System.out.println(strA.trim()); // Cat				
//		       
//		       
//		      String strB = " Cat";
//			  System.out.println(strB.trim()); //Cat
//  		      String strC = " Cat ";
//  		      System.out.println(strC.trim()); //Cat
				
  		     // A�a��daki kodlar�n ekran ��kt�s� al�n�rsa ne olur diye once dusunun sonra kodlar� yazarak
			 // ekran ��kt�lar�na bak�n.

 //   			String strD = "Cat";
//				System.out.println(strD.contains("a"));// true
			    String strE = " Cat";
				System.out.println(strE.contains(" ")); // true
				String strF = "Cat";
				System.out.println(strF.contains("")); // true
//				
//				
     			String str = "Cat, caterpillar";
				System.out.println(str.substring(0)); // Cat, caterpillar
				System.out.println(str.substring(3)); // , caterpillar
     			System.out.println(str.substring(4)); // caterpillar
     			System.out.println(str.substring(15)); // r
				System.out.println(str.substring(16)); // hi�birsey
				System.out.println(str.substring(5,8)); //cat
				System.out.println(str.substring(3,4)); // ,
                System.out.println(str.substring(5,5)); // hi�birsey
//				System.out.println(str.substring(8,5)); // run time error
				System.out.println(str.startsWith("C")); // true
				System.out.println(str.startsWith("c")); // false
				System.out.println(str.startsWith("B")); // false
				System.out.println(str.startsWith("Cat")); // true
				System.out.println(str.startsWith("c",5)); // false
				System.out.println(str.startsWith("ter",7)); // true
				System.out.println(str.startsWith("p", 11)); // false
				System.out.println(str.startsWith("")); // true
				System.out.println(str.endsWith("r")); // true
				System.out.println(str.endsWith("C")); // false
                System.out.println(str.endsWith("")); // true
				System.out.println(str.endsWith(" ")); // false
				System.out.println(str.endsWith("lar")); // true
				System.out.println(str.endsWith("caterpillar")); // true
		
		
		
		

	}

}
