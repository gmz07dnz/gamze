package javapractice;

import java.util.Scanner;

public class Day01Soru03 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin ve vucut kutle
		 * endeksini bulun. VKE�ni ondalikli sayi olarak yazdirin ve kullanicinin
		 * durumunu belirleyin.
		 * 
		 * VKE= kilo/(boy*boy) ��.. Kilo : kilogram , Boy : metre olmalidir VKE<20 ise
		 * kullanici zayif 20<VKE<25 ise kullanici saglikli 25<VKE<30 ise kullanici
		 * sisman 30<VKE ise kullanici obez
		 * 
		 * Ornek : Input : boy :180 kilo : 80 Output : 
		 * Vucut kutle endeksiniz : 24.691�
		 * sagliklisiniz
		 */

		// 1-  Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Boyunuzu cm cinsinden yaz�n�z");
		double boy = scan.nextInt();
		
		System.out.println("Kilonuzu kg cinsinden yaz�n�z");
		
		double kilo = scan.nextDouble();
		
		
		// 2- vucut kutle endeksini bulun
		 
		// boyu metreye cevirelim
		 
		boy/=100;
		
		double vke = kilo / (boy*boy);
		
		// 3- VKE�ni ondalikli sayi olarak yazdirin 
		
		System.out.print("V�cut k�tle endeksiniz: "+ vke+ "...");
		
		// 4- Kullanicinin durumunu belirleyin.
		
		if (vke<20) {
			System.out.println("zay�fs�n�z");
		}else if (vke>20 && vke<25) {
			System.out.println("sagl�kl�s�n�z");
		}else if (vke>25 && vke<30) {
			System.out.println("�i�mans�n�z");
		}else if(vke>30) {
			System.out.println("obezsiniz");
		}
		
		
	scan.close();	
		
	}

}
