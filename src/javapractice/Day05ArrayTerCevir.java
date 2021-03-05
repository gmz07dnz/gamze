package javapractice;

import java.util.Scanner;

public class Day05ArrayTerCevir {

	public static void main(String[] args) {
		
		
		/*
		 * SORU 3) Kullanicidan bir cumle alin. Kullanicidan alinan cumleyi Parametre
		 * olarak kabul edip, Array kullanarak cumlenin tersini ceviren ve sonucu bir
		 * String olarak main method’a donduren bir Method yazin. 
		 * Not : Buyuk,kucuk harf,bosluklar ve ozel karakterler degistirilmeyecek 
		 * Input : Kod yazmak cok guzel. 
		 * Output : .lezug koc kamzay doK
		 */

	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("Tersini cevirmek için bir cümle giriniz");
    String cumle = scan.nextLine();
    
    tersCevir(cumle);
    System.out.println(tersCevir(cumle));
    
	}

	public static String tersCevir(String str) {
		
		String tersCumle = "";	
		String cumlearray[] =str.split("");
		
		for(int i = cumlearray.length-1; i>=0 ; i--) {
			tersCumle +=cumlearray[i];
		}
		
		return tersCumle;
	}
    
   

}
