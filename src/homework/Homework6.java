package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		
		
// Saati saniyeye �eviren bir program yaz�n�z. (long kullan�n�z) Not 1: Saniye = Saat x 60 x 60		
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("�evirmek istedi�iniz saati yaz�n�z"); // 3
	
	long sa = scan.nextLong();
	
	long sn = sa * 60 *60;
		
	System.out.println(sn);	// 10800
		
	scan.close();
	
	
	}

}
