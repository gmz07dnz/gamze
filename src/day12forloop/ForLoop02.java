package day12forloop;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
        /*
         * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya
		 * sonras�ndan ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift
		 * tamsay�lar� ekrana yazd�r�n.
         */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("baslangic degerini giriniz");
	int bas = scan.nextInt();
	
	System.out.println("bitis degerini yaz�n�z");
	int bit = scan.nextInt();
	
	
	
	if(bas>bit) {
		System.out.println("Baslangic degeri bitis degerinden k���k olmal�d�r.");
	}else {
		for(int i = bas; i<= bit ; i++) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}
		}
	}
	
	scan.close();
	
	}

}
