package slayt13;

import java.util.Scanner;

public class OdevSoru04 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�ya paralelkenar, dikd�rtgen ve ��gen kelimelerinden birini ve iki say� se�mesini s�yleyin.
          Hangi �ekli se�erse, o �eklin alan�n� ve �evresini ekrana yazd�ran program� yaz�n�z.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("A�ag�dakilerden birini se�iniz" +"\n" + "paralelkenar"+"\n"+"dikd�rtgen"+"\n"+"��gen");
		String isim = scan.nextLine().toLowerCase();
		
		System.out.println("1.say�y� giriniz");
		int i1 = scan.nextInt();
		System.out.println("2.say�y� giriniz");
		int i2 = scan.nextInt();
		
		switch (isim) {
		case "��gen":
			System.out.println(i1*i2/2);
			break;
		case "dikd�rtgen":
			System.out.println(i1*i2);
			break;
		case "paralelkenar":
			System.out.println(i1*i2);
			break;
		default:
			System.out.println("l�tfen dogru bir se�im yap�n�z");
			break;
		}
		
		scan.close();
		
	}

}
