package javaofficehours;

import java.util.Scanner;

public class Day07AtmProje {

	public static void main(String[] args) {
		
		
		/*
		 Bir Atm projesi yazalým.Hesabýmýzda bir miktar para olsun.
		 Yapýlacak iþlemler;
		 1-Hesabý görüntüle
		 2-Para cekme
		 3-Para yatýrma
		 4-cýkýþ
		 */

		double para = 3700;
		
		while(true) {
		Scanner scan = new Scanner(System.in);
System.out.println("Hesabýnýzla ilgili iþlem yapmak için lütfen bir numara seçiniz \n 1-Hesabý görüntüle \n 2-Para cekme \n 3-Para yatýrma\n 4-cýkýþ ");
		
         int islemNo= scan.nextInt();	
         

 		switch (islemNo) {
 		case 1: 
 			System.out.println("Hesabýnýzda "+para +" lira bulunmaktadýr.");
 			System.out.println();
 		break;
 		case 2:
 			System.out.println("Çekmek istediðiniz miktarý giriniz.");
 			double paraCekmekIstenen= scan.nextDouble();
 			if(para>=paraCekmekIstenen){
 				System.out.println("Bu miktarý çekebilirsiniz");
 				para= para-paraCekmekIstenen;
 				System.out.println("Hesabýnýzda "+para +" lira bulunmaktadýr.");
 			}else {
 				System.out.println("Hesabýnýzda yeterli bakiye bulunmamaktadýr.");
 			}
 			
 			System.out.println("");
 		break;
 		case 3: 
 			System.out.println("Yatýrmak istediðiniz miktari giriniz ");
 			double paraYatirilmakIstenen= scan.nextDouble();
 			para = para+paraYatirilmakIstenen;
 			System.out.println("Iþlem baþarýyla gerçekleþtirilmiþtir."+"\n"+" Hesabýnýzda " + para +" lira bulunmaktadýr.");
 		break;
 		case 4:
			System.out.println("isleminiz sonlandirilmistir");
			break;
			default:
				System.out.println("lütfen doðru bir seçim yapýnýz");
			
		
		}if(islemNo ==4) {
			break;
		}
		
		scan.close();

        }

	
	
	}
	
	
}
