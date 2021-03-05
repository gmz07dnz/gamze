package javaofficehours;

import java.util.Scanner;

public class Day10Plaka {

	public static void main(String[] args) {
		
		 //Klavyeden girilecek plaka numaras�ndan ili g�steren uygulamayi yazalim.
		
	    /*  "Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara",
	        "Antalya", "Artvin", "Ayd�n", "Bal�kesir", "Bilecik", "Bing�l", "Bitlis",
	        "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum", "Denizli",
	        "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir",
	        "Gaziantep", "Giresun", "G�m��hane", "Hakkari", "Hatay", "Isparta",
	        "��el (Mersin)", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
	        "K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa",
	        "K.mara�", "Mardin", "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize",
	        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda�", "Tokat", "Trabzon",
	        "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
	        "Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan",
	        "I�d�r", "Yalova", "Karab�k", "Kilis", "Osmaniye", "D�zce"
	        */

		
		
		
		String iller[] = {"Adana", "Ad�yaman", "Afyon", "A�r�", "Amasya", "Ankara",
		        "Antalya", "Artvin", "Ayd�n", "Bal�kesir", "Bilecik", "Bing�l", "Bitlis",
		        "Bolu", "Burdur", "Bursa", "�anakkale", "�ank�r�", "�orum", "Denizli",
		        "Diyarbak�r", "Edirne", "Elaz��", "Erzincan", "Erzurum", "Eski�ehir",
		        "Gaziantep", "Giresun", "G�m��hane", "Hakkari", "Hatay", "Isparta",
		        "��el (Mersin)", "�stanbul", "�zmir", "Kars", "Kastamonu", "Kayseri",
		        "K�rklareli", "K�r�ehir", "Kocaeli", "Konya", "K�tahya", "Malatya", "Manisa",
		        "K.mara�", "Mardin", "Mu�la", "Mu�", "Nev�ehir", "Ni�de", "Ordu", "Rize",
		        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirda�", "Tokat", "Trabzon",
		        "Tunceli", "�anl�urfa", "U�ak", "Van", "Yozgat", "Zonguldak", "Aksaray",
		        "Bayburt", "Karaman", "K�r�kkale", "Batman", "��rnak", "Bart�n", "Ardahan",
		        "I�d�r", "Yalova", "Karab�k", "Kilis", "Osmaniye", "D�zce"};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Hangi ile ait oldugunu �grenmek i�in bir plaka kodu giriniz. Kod 1 - 81 aras�nda olmal�");
		int plakaNo = scan.nextInt();
		
		// 1.yol
		
		for (int i = 0; i<iller.length; i++) {
			if (plakaNo-1 == i) {
				System.out.println("Girilen Plaka No : "+ iller[i] + " iline aittir");
			}
		}
		
		
		// 2.yol
		
		System.out.println("Girilen Plaka No : "+ iller[plakaNo-1] + " iline aittir");
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
