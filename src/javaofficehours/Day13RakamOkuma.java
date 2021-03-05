package javaofficehours;

import java.util.Scanner;

public class Day13RakamOkuma {

	public static void main(String[] args) {
		
		// 444 00 00 dort dort dort sifir sifir sifir sifir
	    // kullanicidan alinacak sayi yi rakam rakam  yazdiran java kodu yazalim    
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir numara giriniz");
		String number = scan.nextLine().replace(" ", "");
	
		
		for (int i = 0; i<number.length();i++) {
			
			if (number.charAt(i)=='0') {
				System.out.print("sifir"+ " ");
			}else if (number.charAt(i)=='1') {
				System.out.print("bir"+ " ");
			}else if(number.charAt(i)=='2') {
				System.out.print("iki"+ " ");
			}else if(number.charAt(i)=='3') {
				System.out.print("üç"+ " ");
			}else if(number.charAt(i)=='4') {
				System.out.print("dört"+ " ");
			}else if(number.charAt(i)=='5') {
				System.out.print("bes"+ " ");
			}else if(number.charAt(i)=='6') {
				System.out.print("altý"+ " ");
			}else if(number.charAt(i)=='7') {
				System.out.print("yedi"+ " ");
			}else if(number.charAt(i)=='8') {
				System.out.print("sekiz"+ " ");
			}else if(number.charAt(i)=='9') {
				System.out.print("dokuz"+ " ");
			}
		
		}
		
		System.out.println();
		
	// 2.yol
		
		for (int i = 0; i<number.length(); i++) {
			
			
			int rakam = new Integer(number.substring(i,i+1));
			
		switch (rakam) {
		case 0:
			System.out.print("sifir"+ " ");
			break;
		case 1:
			System.out.print("bir"+ " ");
			break;
		case 2:
			System.out.print("iki"+ " ");
			break;
		case 3:
			System.out.print("üç"+ " ");
			break;
		case 4:
			System.out.print("dört"+ " ");
			break;
		case 5:
			System.out.print("bes"+ " ");
			break;
		case 6:
			System.out.print("altý"+ " ");
			break;
		case 7:
			System.out.print("yedi"+ " ");
			break;
		case 8:
			System.out.print("sekiz"+ " ");
			break;
		case 9:
			System.out.print("dokuz"+ " ");
			break;
		default:
			System.out.println("dogru bir deger giriniz");
			break;
		}
			
			
		}
		
	scan.close();	
		
		
	}
}
