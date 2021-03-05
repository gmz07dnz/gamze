package javaofficehours;

import java.util.Scanner;

public class Day10Plaka {

	public static void main(String[] args) {
		
		 //Klavyeden girilecek plaka numarasýndan ili gösteren uygulamayi yazalim.
		
	    /*  "Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara",
	        "Antalya", "Artvin", "Aydýn", "Balýkesir", "Bilecik", "Bingöl", "Bitlis",
	        "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum", "Denizli",
	        "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir",
	        "Gaziantep", "Giresun", "Gümüþhane", "Hakkari", "Hatay", "Isparta",
	        "Ýçel (Mersin)", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
	        "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
	        "K.maraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize",
	        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon",
	        "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
	        "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan",
	        "Iðdýr", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"
	        */

		
		
		
		String iller[] = {"Adana", "Adýyaman", "Afyon", "Aðrý", "Amasya", "Ankara",
		        "Antalya", "Artvin", "Aydýn", "Balýkesir", "Bilecik", "Bingöl", "Bitlis",
		        "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankýrý", "Çorum", "Denizli",
		        "Diyarbakýr", "Edirne", "Elazýð", "Erzincan", "Erzurum", "Eskiþehir",
		        "Gaziantep", "Giresun", "Gümüþhane", "Hakkari", "Hatay", "Isparta",
		        "Ýçel (Mersin)", "Ýstanbul", "Ýzmir", "Kars", "Kastamonu", "Kayseri",
		        "Kýrklareli", "Kýrþehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa",
		        "K.maraþ", "Mardin", "Muðla", "Muþ", "Nevþehir", "Niðde", "Ordu", "Rize",
		        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdað", "Tokat", "Trabzon",
		        "Tunceli", "Þanlýurfa", "Uþak", "Van", "Yozgat", "Zonguldak", "Aksaray",
		        "Bayburt", "Karaman", "Kýrýkkale", "Batman", "Þýrnak", "Bartýn", "Ardahan",
		        "Iðdýr", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Hangi ile ait oldugunu ögrenmek için bir plaka kodu giriniz. Kod 1 - 81 arasýnda olmalý");
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
