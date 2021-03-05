package javapractice;

import java.util.Scanner;

public class Day01Soru06 {

	public static void main(String[] args) {

		/*
		 * Kullaniciya gunde kac cay ictigini ve kac seker kullandigini sorun. Bir yilda
		 * kac kg seker kullandigini hesaplayip yazdirin 
		 * 1 seker = 1.7 gr 
		 * Eger kullanici seker kullanmiyorsa (seker sayisi=0) “Cok guzel sifir seker saglikli yasam ”
		 * yazdirin
		 * 
		 * 
		 * Ornek : Input : cay sayisi : 10 seker sayisi :2 Output : Yilda 12.41 kg seker
		 * kullaniyorsunuz
		 */

		
	Scanner scan = new Scanner(System.in);
	System.out.println("Günde kac bardak cay içiyorsunuz");
	int bardak = scan.nextInt();
	System.out.println("Bir bardak çay için kac seker kullanýyorsunuz");
	int seker = scan.nextInt();
	double sekerGrYýl = bardak*seker*1.7*365;
	// sekeri kg bulalým
	sekerGrYýl/=1000;
	
	if (seker == 0 ) {
		System.out.println("Cok guzel sifir seker saglikli yasam ");
		}else if (seker>0) {
			System.out.println("Yilda " +sekerGrYýl+ " kg seker kullaniyorsunuz");
		}else {
			System.out.println("Lütfen verileri dogru giriniz");
		}
	
	scan.close();
	
	
	
	}

}
