package javaofficehours;

import java.util.Random;
import java.util.Scanner;

public class Day09TasKagitMakas {

	public static void main(String[] args) {
		
		
		/*
		 Tas Kagit Makas Oyunu
		 3 tane objemiz olacak bu objlerin birbirlerine karsi ustunlukleri var
		 tas>makas
		 makas>kagit
		 kagit>tas
		 oyun kazanan sayisi 3  olursa oyun bitsin. Skoru yazdiralim.
		 */

	int numberOfFirstWin =0;
	int numberOfComWin = 0;
	int gameOver = 3;
	
	Scanner scan = new Scanner(System.in);
	
   while (numberOfFirstWin<gameOver && numberOfComWin < gameOver ) {
	   
	   System.out.println("1. Oyuncu Se�imi:  \n0.Tas\n1.Makas\n2.Kag�t ");
	   int secim = scan.nextInt();
	   int comSecim = new Random().nextInt(3);
	   
	   
	   if (secim == 0) {System.out.println("Sizin Seciminiz: Tas");}
	   if (secim == 1) {System.out.println("Sizin Seciminiz: Makas");}
	   if (secim == 2) {System.out.println("Sizin Seciminiz: Kag�t");}
	   
	   
	   if (comSecim == 0) {System.out.println("Bilgisayar�n Secimi: Tas");}
	   if (comSecim == 1) {System.out.println("Bilgisayar�n Secimi: Makas");}
	   if (comSecim == 2) {System.out.println("Bilgisayar�n Secimi: Kag�t");}
	   
	  
	//   System.out.println("1.oyuncu: "+secim+"\n"+ "Bilgisayar: "+comSecim);
	  if((secim ==0 && comSecim ==1) || (secim == 1 && comSecim == 2)||(secim ==2 && comSecim == 0) ) {
		  System.out.println("Siz kazand�n�z!!");
		  System.out.println("===============");
		  numberOfFirstWin++;
	  }else if((secim ==1 && comSecim ==0) || (secim == 2 && comSecim == 1)||(secim ==0 && comSecim == 2) ) {
		  System.out.println("Bilgisayar kazand�");
		  System.out.println("===============");
		  numberOfComWin++;
	  }else if (secim == comSecim) {
		  System.out.println("Berabere");
		  System.out.println("===============");
	  }
		  
   }
	
   if (numberOfFirstWin == gameOver) {
	   System.out.println("*******GAMEOVER********");
	   System.out.println("Siz Kazand�n�z ");
	   System.out.println("Sizin kazanma say�n�z: "+numberOfFirstWin);
   }else  {
	   System.out.println("*******GAMEOVER********");
	   System.out.println("Bilgisayar Kazand�nd� ");
	   System.out.println("Bilgisayar�n kazanma say�s�: "+numberOfComWin );
   }
	
   
   scan.close();
	}
 
	
}
