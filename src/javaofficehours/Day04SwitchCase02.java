package javaofficehours;

import java.util.Scanner;

public class Day04SwitchCase02 {

	public static void main(String[] args) {


		/*
		 * kullan�c�n�n girmi� oldugu 1 ile 5 aras�ndaki not kars�l�g�n� yazal�m
		 * 5 .. pekiyi
		 * 4 .. iyi
		 * 3.. orta
		 * 2 .. gecer
		 * 1 .. kald�
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("Not kars�l�g�n� �grenmek i�in 1 ile 5 ars�nda bir sayi giriniz");
	int not = scan.nextInt();
	
	switch (not) {
	case 1:
		System.out.println("kaldi");
		break;
	case 2:
		System.out.println("gecer");
		break;
	case 3:
		System.out.println("orta");
		break;
	case 4:
		System.out.println("iyi");
		break;
	case 5:
		System.out.println("pekiyi");
		break;
	default:
		System.out.println("L�tfen gecerli bir not giriniz");
		
	}
	
	
	scan.close();
	
	

	
	}

}
