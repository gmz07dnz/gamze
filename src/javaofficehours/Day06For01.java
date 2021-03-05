package javaofficehours;

public class Day06For01 {

	public static void main(String[] args) {
		
		/*
		 * 1den 100e kadar olan sayýlarýn 3'e , 5'e ve 15'e bölünen sayýlarý yazdýralým
		 * 3e bölünen sayýlar : 3 6 9 ...
		 * 5e bölünen sayýlar : 5 10 15 ...
		 * 15e bölünen sayýlar :15 30 45
		 * 
		 */

		
		
		System.out.println("3'e bölünen sayýlar :");
		for (int i = 1; i<=100; i++) {
			if (i%3 ==0) {
				System.out.print(i+ " ");
			}
		}
		
		System.out.println();
		
		System.out.println("5'e bölünen sayýlar :");
		for (int i = 1; i<=100; i++) {
			if (i%5 ==0) {
				System.out.print(i+ " ");
			}
		}
		
		System.out.println();
		
		System.out.println("15'e bölünen sayýlar :");
		for (int i = 1; i<=100; i++) {
			if (i%15 ==0) {
				System.out.print(i+ " ");
			}
		}
		
		
		
		
		
	}

}
