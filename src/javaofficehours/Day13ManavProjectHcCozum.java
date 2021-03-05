package javaofficehours;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day13ManavProjectHcCozum {
	
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
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Hangi ürünü secmek istersiniz");
		int secim = scan.nextInt();
		
		System.out.println("Kaç kilo almak istersiniz");
		float kilo = scan.nextFloat();
		
		float toplamUrunFiyat = urunFiyatlari.get(secim)*kilo;
		
		toplamOdenecekfiyat=toplamOdenecekfiyat+toplamUrunFiyat;
		System.out.println("Ürün fiyatý: "+ urunFiyatlari.get(secim) );
		System.out.println("Almýþ oldugunuz ürünün fiyatý: "+ toplamUrunFiyat);
		
		System.out.println("Alýþverise devam etmek isterseniz 1,Kasaya gitmek isterseniz 2 ye basýnýz.");
		int karar = scan.nextInt();
		
		if(karar == 1) {
			musteriSecim();
		}else {
			kasa();
		}
		scan.close();
	}

	public static void kasa() {
		System.out.println("Toplam odenecek tutar "+ toplamOdenecekfiyat);
	}
}
