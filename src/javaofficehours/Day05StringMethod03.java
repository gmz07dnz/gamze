package javaofficehours;

import java.util.Scanner;

public class Day05StringMethod03 {

	public static void main(String[] args) {
		
		/*
		 * Kullanýcýdan alýnacak cümle içerisinde sececegimiz bir harfin kac kere gectiðini bulalým
		 * 
		 * örnek:
		 * bugün hava cok sýcak == a   return -> 3
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bir cümle giriniz");
		String cümle = scan.nextLine().toLowerCase();
		System.out.println("Tekrarý bulunacak harfi giriniz");
	//	char harf = scan.nextLine().toLowerCase().charAt(0);
		String harf = scan.nextLine().toLowerCase().substring(0, 1);
		
		int count = 0;
//		
//		for(int i = 0 ; i<cümle.length(); i++) {
//			if(cümle.charAt(i)==harf) {
//				count++;
//			}
//		}
//		System.out.println("Girdiðiniz cümlede "+ harf +" harfi "+ count + " kere geciyor.");
		
		for(int i = 0 ; i<cümle.length(); i++) {
			if(cümle.substring(i, i+1).equals(harf)) {
				count++;
			}
			
		}
		System.out.println("Girdiðiniz cümlede "+ harf +" harfi "+ count + " kere geciyor.");
	
		scan.close();
	
	}

}
