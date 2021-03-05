package javapractice;

import java.util.Scanner;

public class Day02Soru01 {

	public static void main(String[] args) {

		/*Kullanicidan iki tamsayi sayi ve islem cinsini alin ve sayilari kullanicinin belirledigi isleme tabii 
		 * tutup sonucu yazdirin. Ornek : Inputs :
		 * sayilar : 18 , 10 
		 * islem : carpma 1:toplama 2: cýkarma 3: carpma 4:bölme
		 * Output : 18 X 10 = 180
		 *
		 */
    Scanner scan = new Scanner(System.in); 
	System.out.println("iþlem yapmak için 2 tamsayýdan 1. sini giriniz");
	int num1 = scan.nextInt();
	System.out.println("iþlem yapmak için 2 tamsayýdan 2. sini giriniz");
	int num2 = scan.nextInt();
	System.out.println("Yapmak istediðiniz iþlemin kodunu giriniz\n 1: toplama\n 2:cýkarma\n 3:carpma\n 4:bölme");
	int iþlemKodu = scan.nextInt();
	
	switch(iþlemKodu) {
	
	case(1):
		System.out.println(num1+" + "+ num2 +" = "+ (num1+num2));
	break;
	case(2):
		System.out.println(num1+" - "+ num2 +" = "+ (num1-num2));
	break;
	case(3):
		System.out.println(num1+" * "+ num2 +" = "+ (num1*num2));
	break;
	case(4):
		System.out.println(num1+" / "+ num2 +" = "+ (num1/num2));
	break;
	default:
		System.out.println("Lütfen gecerli bir iþlem seciniz");
	
	}
	
	
	scan.close();
	
	}

}
