package day10stringmethods;

public class Method16 {

	public static void main(String[] args) {
		
	/*
	 * 	s1.trim(); ==> k�rpmak .girilen string'in ba� ve sonundaki space'leri siler. String'in i�indeki space'leri silmez
	 */
		
		
		
	String s1= "   Java ogrenen diger dilleri cabucak ogrenir   ";
	
	s1.trim();
	 
	System.out.println("Trim kullanmadan �nce :"+s1); //   Java ogrenen diger dilleri cabucak ogrenir   
		
		
	System.out.println("Trim kulland�ktan sonra :"+s1.trim()); //Java ogrenen diger dilleri cabucak ogrenir
		
		
		
		
		

	}

}
