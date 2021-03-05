package day02wrapperclasses;

public class Wrapper01 {
	public static void main(String[] args) {
		
	// int data type'�n max ve min degerlerini bulup ekrana yazd�r�n�z
		
		//Integer.MAX_VALUE;  // Integer yazd�ktan sonra nokta koydu�umuzda methodlar ��k�yor. 
		                      //Ordan istedi�i�mizi se�iyoruz.
		System.out.println(Integer.MAX_VALUE);
		
		//Integer.MIN_VALUE;
		System.out.println(Integer.MIN_VALUE);
		
		
	//long data type'�n max ve min degerlerini bulup ekrana yazd�r�n�z
	//Wrapper cevreleyen demektir.Burdada Long primitive olan long'u cevreliyor yani t�m �zellikleri kapsar.
		
		
	System.out.println(Long.MAX_VALUE);	//9223372036854775807
	System.out.println(Long.MIN_VALUE); // -9223372036854775808
	
	//�DEV
		
	System.out.println(Short.MAX_VALUE	); //32767
	System.out.println(Short.MIN_VALUE); //-32768
	
	System.out.println(Float.MAX_VALUE); //3.4028235E38
	System.out.println(Float.MIN_VALUE); // 1.4E-45
	
	
	// 2.yol
	
	byte maxByte = Byte.MAX_VALUE;
	System.out.println(maxByte);
	
	byte minByte = Byte.MIN_VALUE;
	System.out.println(minByte);
	
	
	short minSh = Short.MAX_VALUE;
	System.out.println(minSh);
	
	short maxSh = Short.MIN_VALUE;
	System.out.println(maxSh);
	
	
	String name = "Ali Can"; // b�y�k harfe cevirmek istiyorum.
	name.toUpperCase();
	System.out.println(name.toUpperCase());
	
	
	String name1 = "Gamze Deniz";
	name1.toUpperCase();
	System.out.println(name1.toUpperCase());
	
	// 1. yol
	double maxDouble = Double.MAX_VALUE;
    System.out.println(maxDouble);
    
    double minDouble = Double.MIN_VALUE;
    System.out.println(minDouble);
	
    // 2.yol
    System.out.println(Double.MAX_VALUE);
    
    System.out.println(Double.MIN_VALUE);
    
    
    String name2 = "gamze g�ne�";
    name2.toUpperCase();
    System.out.println(name2.toUpperCase());
    
    String name3 = "She take after his father";
    name3.toUpperCase();
    System.out.println(name3.toUpperCase());
    
	
	}
	
	
	
	

}
