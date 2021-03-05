package javapractice;

import java.util.Scanner;

public class Day07KelimeOyunu {

	static String kelime = "";
	static int oyuncu = 1;
	static int puan1 = 0;
	static int puan2 = 0;

	public static void main(String[] args) {

		/*
		 * Iki kisinin oynayacagi bir kelime oyunu uretelim Kurallar 1- Baslangicta
		 * 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
		 * 
		 * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
		 * * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar
		 * puan ekleyin ve 3.adima gecin * girilen kelimeyi kabul etmezse
		 * "gecersiz kelime" yazdirin ve onceki oyuncunun kazandigini yazip oyunu
		 * bitirin
		 * 
		 * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun * devam etmek
		 * isterse kelimeye eklemek istedigi string'i ve basa mi sona mi ekleyecegini
		 * sorun aldiginiz string'i kelimeye ekleyip 2.adima gidin
		 * 
		 * * Devam etmek istemezse "Oyun bitti" yazin kullanicilarin puanlarini ve
		 * kazanan oyuncuyu yazdirin
		 */

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(oyuncu + ".oyuncu bir kelime giriniz");
		kelime = scan.next().toLowerCase();
		System.out.println("Girilen kelime: " + kelime);

		// oyuncuyu degistirmek için bir method yazalým
		oyuncuDegistir();
		onaySor();

	}

	private static void onaySor() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println(oyuncu + ".oyuncu kelimeyi kabul ediyor musunuz?\n 1: Evet\n 2: Hayýr");
		int secim = scan.nextInt();
		if(secim == 1) {
			if(oyuncu ==1) {
			puan2= puan2+kelime.length();
			}else {
				puan1= puan1+kelime.length();
			}
			devamIstiyorMu();
			
		}else {
			oyunuBitir();
		}

	}

	private static void devamIstiyorMu() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Devam etmek istiyor musunuz?\n 6: Devam\n 7: Bitir");
		int tercih =scan.nextInt();
		if (tercih == 6) {
			stringEkle();
		}else {
			System.out.println("Oyun Bitti");
			System.out.println("1. oyuncu puan: "+ puan1);
			System.out.println("2. oyuncu puan: "+ puan2);
			if (puan1>puan2) {
				System.out.println("1. oyuncu kazandý");
			}else if(puan1<puan2) {
				System.out.println("2.oyuncu kazandý");
			}else {
				System.out.println("Berabere");
			}
		}
		
	}

	private static void stringEkle() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Eski kelimeye eklemek için bir string giriniz");
		String kelimeEklenen =scan.next();
		System.out.println("basa mi sona mi eklemek istersiniz?\n 4: Basa\n 5: Sona");
		int tercih = scan.nextInt();
		if(tercih==4) {
			kelime=kelimeEklenen+kelime;
			System.out.println("Girilen kelime: " + kelime);
		}else {
			kelime= kelime+kelimeEklenen;
			System.out.println("Girilen kelime: " + kelime);
		}
		oyuncuDegistir();
		onaySor();
		
	}

	private static void oyunuBitir() {
		System.out.println("Gecersiz kelime");
		System.out.println(oyuncu + ".oyuncu oyunu kazandýnýz");
		
	}

	private static void oyuncuDegistir() {
		if (oyuncu == 1) {
			oyuncu = 2;
		} else {
			oyuncu = 1;
		}

	}

}
