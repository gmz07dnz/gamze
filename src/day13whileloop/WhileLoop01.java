package day13whileloop;

public class WhileLoop01 {

	public static void main(String[] args) {

		// for loop kullanarak 1den 5'e kadar tamsayýlarý yazdýr

        for( int i=1 ; i<=6; i++) {
			
			System.out.print(i);
		}
		
		
		//while loop kullanarak 1den 5'e kadar tamsayýlarý yazdýr
		
		int j = 1;
		
		while (j<=5) {
			System.out.print(j);
			j++;
		}
		
		
	// while loop kullanarak 10 dan küçük sayma sayýlarýný ayný satýrda aralarýna boþluk koyarak yazýnýz.
		
		int k =1;
		
		while (k<10) {
			System.out.print(k+" ");
			k++;
		}
		
		
//	 	while loop kullanarak 50 den küçük çift sayýlarý yazdýrýn.
		
		
		
				int c = 1;
			while (c<50) {
				if (c %2 == 0) {
				System.out.print(c + " ");
				}
				c++;
				}

			
//		while loop kullanarak "Java Kolaydýr "	stringini tersten yazdýrýn
		
			String s = "Java Kolaydýr";
		
		int r = s.length()-1;
		while (r>=0) {
			System.out.print
			(s.charAt(r));
	     r--;
		}
	
			
			
			
			
			
		
	
	}
}
