package day04operators;

import java.util.Scanner;

public class ÝnterviewSorusu01 {
	
	public static void main(String[] args){
		
		// iki tane variable'ýn degerlerini yer degistiriniz.
		// sayý : 12 , sayý2 :30  ==> bu iþleme swap denir
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yerlerini deðiþtirmek için lütfen iki sayý giriniz.");
		//ondalýk girme ihtimaline binaen geniþ düþünüyoruz.
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble(); // kulanýcyla irtibat içindeysek dinamik program oluyor.
		
		// 1.yol
		
	System.out.println("Yer deðiþtirmeden önce");
	System.out.println(num1); // 12.0
	System.out.println(num2); // 30.0
	double geçici = 0.0; // boþ bir variable oluþturunca bir deðer verelim. 
	                     //boþ býrakmayalým. java gibi yapýp "0" verelim.
		
    geçici = num1; // geçici = 12.0 ,ama num1 deki 12.0 hala orda duruyor.yani geçici=12 , num1 = 12.0
    num1 = num2; //  num2 num1 e atanýnca yeni gelen eskisini öldürüyor. 
                 // Yani num 1= 12.0 ölür artýk num1=30 olur. yeni gelince eski ölür.
    num2 = geçici; // num2 = 12.0 olur. Geçiciye birþey gelmediði için ondaki 12.0 de kalýr
    
    System.out.println("Yer degiþtirdikten sonra");
    System.out.println(num1); // 30.0
    System.out.println(num2); //12.0
    
   System.out.println(geçici);// 12.0
   
   // 2.yol
   // geçici variable oluþturmadan
   
   System.out.println("Yer degiþtirmek için iki sayý daha giriniz");
    
   double num3 = scan.nextDouble(); // 12.0
   double num4 = scan.nextDouble(); // 20.0
  
   System.out.println(num3);
   System.out.println(num4);
    
   num3 = num4+num3; // num 3 e num3 + num4 atadým. num3 eskisi (12.0) öldü. yeni num3 variable da 12.0 + 20.0 var.
                        
   num4 = num3 - num4;    /* num4 gitti ama kopyasý container'da duruyor.Yeni deger atayýnca kopya num4(20.0) 
                         ölür.num3 geçecek ama onda hem num3 hem de num4 var.Benim burdaki num4'den kurtulmam 
                         lazým. o yuzden çýkarýyorum.
		                 */
   num3 =num3- num4;	 /*num3 num4'e atadýk ama kopyasý (num3+num4) orda duruyor.num3 den kurtulmak için 
	                   cýkarýyorum.
	System.out.println("Yer degiþtirdikten sonra");                   */
	System.out.println(num3);
	System.out.println(num4);
	
	scan.close();
	
	}
	
	
	

}
