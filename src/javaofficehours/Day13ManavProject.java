package javaofficehours;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day13ManavProject {
	
	static List<String> urunListesi = new ArrayList<>();
	static List<Float> urunFiyatlari = new ArrayList<>();
	static float toplamOdenecekfiyat =0;
	

	public static void main(String[] args) {
		
		 /*
	     * Basit bir manav alisveris programi yaziniz.
	     * 
	     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
	     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
	     *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
	     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
	     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
	     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster. 
	     *
	     * */
		
		    urunListesi.add("Domates -UrunKodu: 0\n");
	        urunListesi.add("Biber - UrunKodu: 1\n");
	        urunListesi.add("Erik - UrunKodu: 2\n");
	        urunListesi.add("Karpuz - UrunKodu: 3\n");
	        urunListesi.add("Havuc - UrunKodu: 4\n");
	        
	       
	        
	        urunFiyatlari.add(2.0f);
	        urunFiyatlari.add(4.0f);
	        urunFiyatlari.add(12.0f);
	        urunFiyatlari.add(3.0f);
	        urunFiyatlari.add(1.0f);
	        
	        System.out.println(urunListesi+"\n");
			System.out.println(urunFiyatlari);
	        
	        musteriSecim();   
  

	}
	
	public static void musteriSecim() {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Secmek isteginiz urunun kodunu giriniz.");
		
		int  urunKodu = scan.nextInt();
		
		String urun =urunListesi.get(urunKodu);
	    System.out.println("Sectiðiniz ürün: "+ urun +" fiyati"+ urunFiyatlari.get(urunKodu) +"\n");
			
	    System.out.println("Kac kilo almak istersiniz");
		float kilo = scan.nextFloat();
		float urunToplamTutar = kilo*(urunFiyatlari.get(urunKodu));
		toplamOdenecekfiyat =toplamOdenecekfiyat + urunToplamTutar;
		System.out.println("Sectiðiniz ürünün toplam tutarý: "+ urunToplamTutar );
	    System.out.println("Toplam alýþveris tutarý: "+ toplamOdenecekfiyat);
	    devamMi();
		
		}
		
	

	public static void devamMi() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Alýþveriþe devam etmek icin: 1\nKasaya gitmek için:2 tuþuna basýnýz");
		int karar = scan.nextInt();
		switch (karar) {
		case 1:
			musteriSecim();
			break;
		case 2:
			System.out.println("Alýþveriþiniz sona ermiþtir.\nToplam Ödenecek Miktar: "+toplamOdenecekfiyat);
			System.out.println("Tesekkür ederiz.Tekrar bekleriz.");
			break;
		default:
			System.out.println("Lütfen gecerli bir seçim yapýnýz");
			break;
		
		}
		
		
	}
}
