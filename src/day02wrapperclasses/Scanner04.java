package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {
	public static void main(String[] args) {
		
		// kullanýcýdandikdörtgenin boyutlarýný alan ve sonra 
		//dikdörtgenin alan ve çevresini hesaplayýp ekrana yazdýralým.
		// not: alan en*boy
		// cevre : 2*(en +boy)
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lütfen dildörtgenin en ve boyunu giriniz.");
		int en = scan.nextInt(); // 3
		int boy = scan.nextInt(); // 5
		
		System.out.println(en*boy);// 3*5 =15
		System.out.println(2*(en + boy));// 2*(3+5)=16
		
		
		scan.close();
		
		
	}

}
