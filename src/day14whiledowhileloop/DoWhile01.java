package day14whiledowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*
		 * While loop ile do-While Loop fark�
		 * 1) while loop kullan�rsan�z java once sart� kabul eder sonra loop body'si i�indeki kodu cal�st�r�r.
		  do-while loop kullan�rsan�z java once loop body i�indeki kodu cal��t�r�r sonra sart� kontrol eder.
		  2) while loop kullan�rsan�z body i�indekikod hi� �al�smayabilir.
		  Fakat do-while loop i�indeki kod en az bir kere cal���r.
		  
		  Note: do-while loop oyun program� yazmak i�in iyidir
		 */
		
		int i = 1;
		while(i<1) {
			System.out.println("While Loop");
			i++;
		}
		
	// condition k�r�ld� ekrana birsey yazmad�
		
	    int k =1;
		do {
		System.out.println("Do-While Loop");	
		k++;
		}while(k<1);
		
	// yaz�lan kodun en az bir kere cal��s�n istiyorsak do-while loop kullan�yoruz
		
		
		
		
		
		
		
		
		
		
		

	}

}
