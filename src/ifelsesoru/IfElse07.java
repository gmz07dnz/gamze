package ifelsesoru;

import java.util.Scanner;

public class IfElse07 {

	public static void main(String[] args) {

/*		
 Kullanýcýdan alacaðý ürün miktarýný ve ürünün birim fiyatýný alýn. Eðer urun miktarý 1000 den fazla ise
 Kullanýcýya %10 indirim yapýn ve ödemesi gereken toplam parayý ekrana yazdýrýn. Diðer durumlarda
 ödemesi gereken toplam parayý herhangi bir indirim yapmadan ekrana yazdýrýn.
*/

		
		Scanner scan = new Scanner(System.in);
		
		  System.out.println("ürün miktarini giriniz");
				
		   int qty = scan.nextInt();
		   
		   System.out.println("ürünün birim fiyatini giriniz ");

		   double price = scan.nextDouble();
		   
		   double sonuc = qty * price;
		   double indirimliSonuc = qty* price*90/100;
		   
		   if (qty >1000) {
			   System.out.println("Indirimli fiyat : "+ indirimliSonuc);
		   }
				
			if (qty <1000) {
				System.out.println("Toplam fiyat : "+ sonuc);
			}
			
			scan.close();
			}
		
		
	}


