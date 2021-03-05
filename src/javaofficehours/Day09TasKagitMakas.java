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
	   
	   System.out.println("1. Oyuncu Seçimi:  \n0.Tas\n1.Makas\n2.Kagýt ");
	   int secim = scan.nextInt();
	   int comSecim = new Random().nextInt(3);
	   
	   
	   if (secim == 0) {System.out.println("Sizin Seciminiz: Tas");}
	   if (secim == 1) {System.out.println("Sizin Seciminiz: Makas");}
	   if (secim == 2) {System.out.println("Sizin Seciminiz: Kagýt");}
	   
	   
	   if (comSecim == 0) {System.out.println("Bilgisayarýn Secimi: Tas");}
	   if (comSecim == 1) {System.out.println("Bilgisayarýn Secimi: Makas");}
	   if (comSecim == 2) {System.out.println("Bilgisayarýn Secimi: Kagýt");}
	   
	  
	//   System.out.println("1.oyuncu: "+secim+"\n"+ "Bilgisayar: "+comSecim);
	  if((secim ==0 && comSecim ==1) || (secim == 1 && comSecim == 2)||(secim ==2 && comSecim == 0) ) {
		  System.out.println("Siz kazandýnýz!!");
		  System.out.println("===============");
		  numberOfFirstWin++;
	  }else if((secim ==1 && comSecim ==0) || (secim == 2 && comSecim == 1)||(secim ==0 && comSecim == 2) ) {
		  System.out.println("Bilgisayar kazandý");
		  System.out.println("===============");
		  numberOfComWin++;
	  }else if (secim == comSecim) {
		  System.out.println("Berabere");
		  System.out.println("===============");
	  }
		  
   }
	
   if (numberOfFirstWin == gameOver) {
	   System.out.println("*******GAMEOVER********");
	   System.out.println("Siz Kazandýnýz ");
	   System.out.println("Sizin kazanma sayýnýz: "+numberOfFirstWin);
   }else  {
	   System.out.println("*******GAMEOVER********");
	   System.out.println("Bilgisayar Kazandýndý ");
	   System.out.println("Bilgisayarýn kazanma sayýsý: "+numberOfComWin );
   }
	
   
   scan.close();
	}
 
	
}
