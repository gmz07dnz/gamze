package day10stringmethods;

public class Method16 {

	public static void main(String[] args) {
		
	/*
	 * 	s1.trim(); ==> kýrpmak .girilen string'in baþ ve sonundaki space'leri siler. String'in içindeki space'leri silmez
	 */
		
		
		
	String s1= "   Java ogrenen diger dilleri cabucak ogrenir   ";
	
	s1.trim();
	 
	System.out.println("Trim kullanmadan önce :"+s1); //   Java ogrenen diger dilleri cabucak ogrenir   
		
		
	System.out.println("Trim kullandýktan sonra :"+s1.trim()); //Java ogrenen diger dilleri cabucak ogrenir
		
		
		
		
		

	}

}
