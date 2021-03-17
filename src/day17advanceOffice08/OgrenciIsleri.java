package day17advanceOffice08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OgrenciIsleri {
	 
	

	public static void main(String[] args) {
		
		List<Ogrenci> ogrenciler = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("****** OKULUMUZA HOSGELDÝNÝZ *****");
			System.out.println("1- Ogrenci Kaydet\n2- Ogrencileri Goruntule \n3- Ogrenci Sil \n4- Cikis\nislemlerinden birini seciniz ");
			int secim = scan.nextInt();
			
			switch (secim) {
			case 1:
				System.out.println("Ogrencinin ismini giriniz.");
				scan.nextLine();
				String isim = scan.nextLine();
				System.out.println("Ogrencinin soyismini giriniz");
				String soyIsim = scan.nextLine();
				System.out.println("Ogrencinin numarasýný giriniz.");
				int numara = scan.nextInt();
				System.out.println("Ogrencinin ortalamasýný giriniz.");
				double ort = scan.nextDouble();
				
				Ogrenci ogrenci = new Ogrenci(numara, isim, soyIsim, ort);
				ogrenciler.add(ogrenci);
				System.out.println("----------------------------");
				break;
			case 2:
				if (ogrenciler.isEmpty()) {
					System.out.println("Suan listede kayýtlý ogrenci bulunmamaktadýr.\n");
				}
				
				for(Ogrenci ogrenci1 : ogrenciler ) {
					System.out.println("Ogrenci Adý: "+ogrenci1.getAdi()+"\nOgrenci Soyadý: "+ogrenci1.getSoyadi()+"\nOgrenci numarasý: "+ogrenci1.getNumarasi()+
							"\nOgrenci ortalamasý: "+ogrenci1.getOrtalama());
					
				}
				System.out.println("--------------------------");
				break;
			case 3:
				System.out.println("Silmek istediðiniz ogrencinin numarasýný giriniz");
				int numara1 = scan.nextInt();
				Ogrenci ogrenciSil =null;
				for(Ogrenci ogrenci1 : ogrenciler) {
					if(ogrenci1.getNumarasi()==numara1) {
						ogrenciSil =ogrenci1;
					}
					
				}
				ogrenciler.remove(ogrenciSil);
				System.out.println(numara1 +" numaralý ogrenci silinmistir.");
				System.out.println("---------------------------");
				
				break;
			case 4:
				System.out.println("Program sonlandýrýlmýþtýr");
				System.out.println("---------------------------");
				break;
			default:
				System.out.println("Lütfen dogru bir secim yapiniz");
				System.out.println("---------------------------");
				break;
			}
			}
		
		
		

	}
	
	
	
	
	
}
