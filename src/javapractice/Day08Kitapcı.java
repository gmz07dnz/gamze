package javapractice;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Day08Kitapcý {
	
	static int kitapNo= 1000;
	static String kitapAdi;
	static String yazarAdi;
	static String yayinYili;
	static String fiyat;
	static HashMap<Integer,String> kitapListe = new HashMap<>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*
		 * Bir kitapci icin program yapalim
		 * 
		 * Kitap no 1000'den baslayarak sirali no olsun 
		 * Her kitap icin 
		 * kitapAdi,
		 * yazarAdi,
		 * yayinYili,
		 * fiyati bilgilerini girelim
		 * 
		 * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini sorsun 
		 * 1- kitap ekle 
		 * 2- numara ile kitap goruntule 
		 * 3- bilgi ile kitap goruntule 
		 * 4- numara ile kitap sil 
		 * 5- Tum kitaplari listele 
		 * 6- Bitir
		 */
		
		topluKitapEkle();

		menu();

	}

	public static void topluKitapEkle() {
		kitapListe.put(9999, "ali can evde, ali han, 2001, 11");
		kitapListe.put(9998, "ali can yolda, ali han, 2005, 10");
		kitapListe.put(9997, "yanlizlik, Veli Kul, 2005, 21");
		kitapListe.put(9996, "Sen, Ayse Unal, 2005, 30");	
		
	}

	public static void menu() {
		
		System.out.println("kitap eklemek için: 1\nNumara ile kitap goruntulemek için: 2\nBilgi ile kitap goruntulemek için: 3"
				+ "\nNumara ile kitap silmek için: 4\nTum kitaplari listelemek için: 5\nBitirmek için: 6 tusuna basýnýz");
		int secim = scan.nextInt();
		
		switch (secim) {
		case 1:
		kitapEkle();
			break;
		case 2:
			numaraIleKitaGoruntule();
				break;
		case 3:
			BilgiIleKitapGoruntule();
				break;
		case 4:
			numaraIleKitaGoruntule();
				break;
		case 5:
			tumKitaplariListele();
				break;
		case 6:
			Bitir();
				break;
		default:
			System.out.println("Lütfen dogru bir seçim yapýnýz");
			Bitir();
		}
		
	}

	private static void tumKitaplariListele() {
		for (Entry<Integer, String> entry : kitapListe.entrySet()) 
		{    System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue()); }

		
	}

	private static void BilgiIleKitapGoruntule() {
		
		
	}

	private static void numaraIleKitaGoruntule() {
		
		System.out.println("Görüntülemek istediðiniz kitabýn numarasýný giriniz.");
		int no = scan.nextInt();		
		if(kitapListe.containsKey(no)) {
		System.out.println(kitapListe.get(no));
		System.out.println("iþlemi sonlandýrmak için 'Q' tusuna basýnýz.Devam etmek için herhangi bir sayý giriniz");
		char son = scan.next().toLowerCase().charAt(0);
		if(son == 'q') {
			menu();
		}else{
			numaraIleKitaGoruntule();
		}
		}else {
			System.out.println("bu numara ile kayýtlý kitap bulunmamaktadýr. Tekrar deneyiniz ");
			System.out.println("iþlemi sonlandýrmak için 'Q' tusuna basýnýz.Devam etmek için herhangi bir sayý giriniz");
			char son = scan.next().toLowerCase().charAt(0);
			if(son == 'q') {
				menu();
			}else{
				numaraIleKitaGoruntule();
			}
		}
		
	}

	public static void Bitir() {
		System.out.println("Programý kullandýgýnýz için tesekkurler");
		
	}

	public static void kitapEkle() {
		
	    System.out.println("Kitabýn adýný giriniz");
	    scan.nextLine();
		kitapAdi = scan.nextLine();
	
		System.out.println("Yazarýn adýný giriniz");
		yazarAdi = scan.nextLine();
		
		System.out.println("Yayýn Yýlýný giriniz");
		yayinYili = scan.next();
		
		System.out.println("Fiyatýný giriniz");
		fiyat = scan.next();
		kitapNo++;
		String kitapBilgi = kitapAdi+","+yazarAdi+","+yayinYili+","+fiyat;
		kitapListe.put(kitapNo, kitapBilgi);
	    System.out.println(kitapNo++ +" no ile "+kitapAdi+" kitabýnýz eklenmiþtir");
		System.out.println("Kitap ekleme iþlemini sonlandýrmak için 'Q' tusuna basýnýz.Devam etmek için herhangi bir tusa basýnýz");
		char son = scan.next().toLowerCase().charAt(0);
		if(son == 'q') {
			menu();
		}else{
		kitapEkle();
		}
		
	}

}
