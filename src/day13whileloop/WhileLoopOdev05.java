package day13whileloop;

import java.util.Scanner;

public class WhileLoopOdev05 {

	public static void main(String[] args) {
		
		
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		//biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.


		Scanner scan = new Scanner(System.in);
		System.out.println("baslang�c degeri i�in tamsay� giriniz");
		int bas = scan.nextInt();
		System.out.println("bitis degeri icin tamsay� giriniz");
		int bit = scan.nextInt();
		
		int carpim = 1;
		int i = bas;
		if(bas<=bit) {
			while (i<=bit) {
				carpim*=i;
				i++;
			}System.out.println("Girilen degerler aras�ndaki tamsay�lar�n carpimi: "+ carpim);
		}else {
			while(i>=bit) {
				carpim*=i;
				i--;
			}System.out.println("Girilen degerler aras�ndaki tamsay�lar�n carpimi: "+ carpim);
		}
	
		scan.close();
	
	
	}

}
