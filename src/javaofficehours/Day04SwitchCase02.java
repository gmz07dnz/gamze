package javaofficehours;

import java.util.Scanner;

public class Day04SwitchCase02 {

	public static void main(String[] args) {


		/*
		 * kullanýcýnýn girmiþ oldugu 1 ile 5 arasýndaki not karsýlýgýný yazalým
		 * 5 .. pekiyi
		 * 4 .. iyi
		 * 3.. orta
		 * 2 .. gecer
		 * 1 .. kaldý
		 */

	
	Scanner scan = new Scanner(System.in);
	System.out.println("Not karsýlýgýný ögrenmek için 1 ile 5 arsýnda bir sayi giriniz");
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
		System.out.println("Lütfen gecerli bir not giriniz");
		
	}
	
	
	scan.close();
	
	

	
	}

}
