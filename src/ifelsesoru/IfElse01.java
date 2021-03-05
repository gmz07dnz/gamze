package ifelsesoru;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		
	/*	Kullanýcýdan bir tamsayý alýn 
	 eðer tamsayý 3 ile bölünebiliyorsa ekrana “3’ün katý” yazdýrýn.
	 3 ile bölünemiyorsa ekrana “3’ün katý deðildir” yazdýrýn.	
	 */
		
		
	Scanner scan = new Scanner(System.in);
		
	System.out.println("Lütfen bir integer giriniz");	
	int num = scan.nextInt();
	System.out.println(num);
		
	int birler = num%10;
	int onlar = num/10;
	onlar = onlar%10;
	int yüzler = num/100;
		
	/*System.out.println(birler);	
	System.out.println(onlar);
	System.out.println(yüzler);*/
	
	
	if((birler+onlar+yüzler)%3 == 0 ) {
		System.out.println("3'ün katý");
	}
	else {
		System.out.println("3'ün katý deðildir");
	}
	
	
	scan.close();
	
	}

}
