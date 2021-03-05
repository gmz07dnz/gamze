package javaofficehours;

import java.util.Scanner;

public class Day07AtmProje {

	public static void main(String[] args) {
		
		
		/*
		 Bir Atm projesi yazal�m.Hesab�m�zda bir miktar para olsun.
		 Yap�lacak i�lemler;
		 1-Hesab� g�r�nt�le
		 2-Para cekme
		 3-Para yat�rma
		 4-c�k��
		 */

		double para = 3700;
		
		while(true) {
		Scanner scan = new Scanner(System.in);
System.out.println("Hesab�n�zla ilgili i�lem yapmak i�in l�tfen bir numara se�iniz \n 1-Hesab� g�r�nt�le \n 2-Para cekme \n 3-Para yat�rma\n 4-c�k�� ");
		
         int islemNo= scan.nextInt();	
         

 		switch (islemNo) {
 		case 1: 
 			System.out.println("Hesab�n�zda "+para +" lira bulunmaktad�r.");
 			System.out.println();
 		break;
 		case 2:
 			System.out.println("�ekmek istedi�iniz miktar� giriniz.");
 			double paraCekmekIstenen= scan.nextDouble();
 			if(para>=paraCekmekIstenen){
 				System.out.println("Bu miktar� �ekebilirsiniz");
 				para= para-paraCekmekIstenen;
 				System.out.println("Hesab�n�zda "+para +" lira bulunmaktad�r.");
 			}else {
 				System.out.println("Hesab�n�zda yeterli bakiye bulunmamaktad�r.");
 			}
 			
 			System.out.println("");
 		break;
 		case 3: 
 			System.out.println("Yat�rmak istedi�iniz miktari giriniz ");
 			double paraYatirilmakIstenen= scan.nextDouble();
 			para = para+paraYatirilmakIstenen;
 			System.out.println("I�lem ba�ar�yla ger�ekle�tirilmi�tir."+"\n"+" Hesab�n�zda " + para +" lira bulunmaktad�r.");
 		break;
 		case 4:
			System.out.println("isleminiz sonlandirilmistir");
			break;
			default:
				System.out.println("l�tfen do�ru bir se�im yap�n�z");
			
		
		}if(islemNo ==4) {
			break;
		}
		
		scan.close();

        }

	
	
	}
	
	
}
