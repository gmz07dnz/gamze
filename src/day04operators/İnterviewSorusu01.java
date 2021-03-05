package day04operators;

import java.util.Scanner;

public class �nterviewSorusu01 {
	
	public static void main(String[] args){
		
		// iki tane variable'�n degerlerini yer degistiriniz.
		// say� : 12 , say�2 :30  ==> bu i�leme swap denir
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yerlerini de�i�tirmek i�in l�tfen iki say� giriniz.");
		//ondal�k girme ihtimaline binaen geni� d���n�yoruz.
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble(); // kulan�cyla irtibat i�indeysek dinamik program oluyor.
		
		// 1.yol
		
	System.out.println("Yer de�i�tirmeden �nce");
	System.out.println(num1); // 12.0
	System.out.println(num2); // 30.0
	double ge�ici = 0.0; // bo� bir variable olu�turunca bir de�er verelim. 
	                     //bo� b�rakmayal�m. java gibi yap�p "0" verelim.
		
    ge�ici = num1; // ge�ici = 12.0 ,ama num1 deki 12.0 hala orda duruyor.yani ge�ici=12 , num1 = 12.0
    num1 = num2; //  num2 num1 e atan�nca yeni gelen eskisini �ld�r�yor. 
                 // Yani num 1= 12.0 �l�r art�k num1=30 olur. yeni gelince eski �l�r.
    num2 = ge�ici; // num2 = 12.0 olur. Ge�iciye bir�ey gelmedi�i i�in ondaki 12.0 de kal�r
    
    System.out.println("Yer degi�tirdikten sonra");
    System.out.println(num1); // 30.0
    System.out.println(num2); //12.0
    
   System.out.println(ge�ici);// 12.0
   
   // 2.yol
   // ge�ici variable olu�turmadan
   
   System.out.println("Yer degi�tirmek i�in iki say� daha giriniz");
    
   double num3 = scan.nextDouble(); // 12.0
   double num4 = scan.nextDouble(); // 20.0
  
   System.out.println(num3);
   System.out.println(num4);
    
   num3 = num4+num3; // num 3 e num3 + num4 atad�m. num3 eskisi (12.0) �ld�. yeni num3 variable da 12.0 + 20.0 var.
                        
   num4 = num3 - num4;    /* num4 gitti ama kopyas� container'da duruyor.Yeni deger atay�nca kopya num4(20.0) 
                         �l�r.num3 ge�ecek ama onda hem num3 hem de num4 var.Benim burdaki num4'den kurtulmam 
                         laz�m. o yuzden ��kar�yorum.
		                 */
   num3 =num3- num4;	 /*num3 num4'e atad�k ama kopyas� (num3+num4) orda duruyor.num3 den kurtulmak i�in 
	                   c�kar�yorum.
	System.out.println("Yer degi�tirdikten sonra");                   */
	System.out.println(num3);
	System.out.println(num4);
	
	scan.close();
	
	}
	
	
	

}
