package javaofficehours;

import java.util.Scanner;

public class Day14TarihYaziyaCevirme {

	public static void main(String[] args) {
	
		 //Kullanicadan 25.10.2020 farmatinda tarih alalim eve bu tarihi yaziya cevirelim
	    //yirmi bes ekim iki bin yirmi
	    //"ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos","eylul", "ekim", "kasim", "aralik"
	    //"bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"
	    //"on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"
	    //"yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"
	    //"bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"

		Scanner scan = new Scanner(System.in);
		System.out.println("dd.mm.yyyy(01.01.2020) formatýnda tarihi giriniz");
		String tarih = scan.nextLine().replace(" ", ""); // 04.10.2020
		
		int gunOn= new Integer(tarih.substring(0, 1)); //0
		int gunBir = new Integer(tarih.substring(1,2)); //4
		int ay = new Integer(tarih.substring(3,5)); //10
		int yilBin = new Integer(tarih.substring(6,7)); //2
		int yilYuz = new Integer(tarih.substring(7,8)); //0
		int yilOn = new Integer(tarih.substring(8,9)); //2
		int yilBir = new Integer(tarih.substring(9,10)); //0
		
		String aylar[]= {"","ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos","eylul", "ekim", "kasim", "aralik"};
		
		String [] birler = {"","bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"};
        String [] onlar = {"","on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis","seksen", "doksan"};
        String [] yuzler = {"","yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"};
        String [] binler = {"","bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"};
		
		System.out.println(onlar[gunOn]+" "+ birler[gunBir]+" "+ aylar[ay]+" "+ binler[yilBin]+" "+yuzler[yilYuz]+" "+onlar[yilOn]
				+" "+ birler[yilBir]);
		scan.close();
		
	}

}
