package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev03 {

	public static void main(String[] args) {

		/*
		 * Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya
		 * sonras�ndan ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift
		 * tamsay�lar� while loop kullanarak ekrana yazd�r�n�z.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("baslang�c degeri i�in tamsay� giriniz");
		int bas = scan.nextInt();
		System.out.println("bitis degeri icin tamsay� giriniz");
		int bit = scan.nextInt();
	
	
	int i = bas;
	if (bas<=bit) {
		while(i<=bit) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		}else {
			while(i>=bit) {
				if(i%2==0) {
					System.out.println(i);
				}
				i--;
			}
		}
	
	scan.close();
	
	
	
	}

}
