package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
 // dairenin alan�n� ve �evresini hesaplayan bir prog yap�n�z.float kullan�n�z.
 // not:1 pi say�s�: 3.14159 , alan = 3.14159*yar��ap*yar��ap , cevre = 2*3.14159*yar��ap
		
  Scanner scan = new Scanner(System.in);
  System.out.println("l�tfen dairenin yar��ap�n� giriniz"); //5.2
  double yari�ap = scan.nextDouble();//floatda yazabilirim sonuna f koymakla ugrasmamak i�in double yapt�m
		                             // data type int ise nextInt()
                                     //data type double ise nextDouble() kullan�l�r
 
  System.out.println(3.14159*yari�ap*yari�ap); // 3.14159*5.2*5.2
 
  System.out.println(2 * 3.14159 * yari�ap ); // 2*3.14159 *5.2
		
	// virg�ll� say�lar tam say�lar� kapsar. double yaz�nca int girdi�imizde do�ru 
  //hesaplar ama tersini yaparsak sonuc yanl�� olur ama kod cal�s�r.	
		
		
	scan.close();	
		
		
		
		
		
	}

}
