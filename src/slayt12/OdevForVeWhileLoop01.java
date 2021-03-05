package slayt12;

public class OdevForVeWhileLoop01 {

	public static void main(String[] args) {
		/*
		 * 8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz.
		 */
	
	// for loop ile
		
		for (int i = 8; i<=180; i++) {
			if(i%5 == 0) {
				System.out.println(i);
			}
		}
	
	
	// while loop ile
		
		
	int i = 8;
	
	while (i<=180) {
		if (i % 5 == 0) {
			System.out.println(i);
		}
		i++;
	}
		
	
	
	}

}
