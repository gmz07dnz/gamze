package day13whileloop;

public class WhileLoop01 {

	public static void main(String[] args) {

		// for loop kullanarak 1den 5'e kadar tamsay�lar� yazd�r

        for( int i=1 ; i<=6; i++) {
			
			System.out.print(i);
		}
		
		
		//while loop kullanarak 1den 5'e kadar tamsay�lar� yazd�r
		
		int j = 1;
		
		while (j<=5) {
			System.out.print(j);
			j++;
		}
		
		
	// while loop kullanarak 10 dan k���k sayma say�lar�n� ayn� sat�rda aralar�na bo�luk koyarak yaz�n�z.
		
		int k =1;
		
		while (k<10) {
			System.out.print(k+" ");
			k++;
		}
		
		
//	 	while loop kullanarak 50 den k���k �ift say�lar� yazd�r�n.
		
		
		
				int c = 1;
			while (c<50) {
				if (c %2 == 0) {
				System.out.print(c + " ");
				}
				c++;
				}

			
//		while loop kullanarak "Java Kolayd�r "	stringini tersten yazd�r�n
		
			String s = "Java Kolayd�r";
		
		int r = s.length()-1;
		while (r>=0) {
			System.out.print
			(s.charAt(r));
	     r--;
		}
	
			
			
			
			
			
		
	
	}
}
