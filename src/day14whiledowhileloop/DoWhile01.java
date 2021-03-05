package day14whiledowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*
		 * While loop ile do-While Loop farký
		 * 1) while loop kullanýrsanýz java once sartý kabul eder sonra loop body'si içindeki kodu calýstýrýr.
		  do-while loop kullanýrsanýz java once loop body içindeki kodu calýþtýrýr sonra sartý kontrol eder.
		  2) while loop kullanýrsanýz body içindekikod hiç çalýsmayabilir.
		  Fakat do-while loop içindeki kod en az bir kere calýþýr.
		  
		  Note: do-while loop oyun programý yazmak için iyidir
		 */
		
		int i = 1;
		while(i<1) {
			System.out.println("While Loop");
			i++;
		}
		
	// condition kýrýldý ekrana birsey yazmadý
		
	    int k =1;
		do {
		System.out.println("Do-While Loop");	
		k++;
		}while(k<1);
		
	// yazýlan kodun en az bir kere calýþsýn istiyorsak do-while loop kullanýyoruz
		
		
		
		
		
		
		
		
		
		
		

	}

}
