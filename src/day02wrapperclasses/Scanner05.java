package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		
 // dairenin alanýný ve çevresini hesaplayan bir prog yapýnýz.float kullanýnýz.
 // not:1 pi sayýsý: 3.14159 , alan = 3.14159*yarýçap*yarýçap , cevre = 2*3.14159*yarýçap
		
  Scanner scan = new Scanner(System.in);
  System.out.println("lütfen dairenin yarýçapýný giriniz"); //5.2
  double yariçap = scan.nextDouble();//floatda yazabilirim sonuna f koymakla ugrasmamak için double yaptým
		                             // data type int ise nextInt()
                                     //data type double ise nextDouble() kullanýlýr
 
  System.out.println(3.14159*yariçap*yariçap); // 3.14159*5.2*5.2
 
  System.out.println(2 * 3.14159 * yariçap ); // 2*3.14159 *5.2
		
	// virgüllü sayýlar tam sayýlarý kapsar. double yazýnca int girdiðimizde doðru 
  //hesaplar ama tersini yaparsak sonuc yanlýþ olur ama kod calýsýr.	
		
		
	scan.close();	
		
		
		
		
		
	}

}
