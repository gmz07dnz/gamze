package ifelsesoru;

import java.util.Scanner;

public class IfElse07 {

	public static void main(String[] args) {

/*		
 Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. E�er urun miktar� 1000 den fazla ise
 Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. Di�er durumlarda
 �demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n.
*/

		
		Scanner scan = new Scanner(System.in);
		
		  System.out.println("�r�n miktarini giriniz");
				
		   int qty = scan.nextInt();
		   
		   System.out.println("�r�n�n birim fiyatini giriniz ");

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


