package day38collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProject {

	public static void main(String[] args) {
		
		/*
		 1)Kullanicidan bircok kimlik numarasini(4 haneli), tam ismini, adresini, telefonunu alin. "Bilgi girisini durdurmak icin 'Q' tusuna basiniz"
		 2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map�e depolayin. 
		 3)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		String kimlikNo = "";
		
		HashMap<String, String> person = new HashMap<>();
		
		do {
			System.out.println("Kimlik numaran�z� giriniz.Bilgi girisini durdurmak icin 'Q' tusuna basiniz");
			kimlikNo = scan.next();
			if(kimlikNo.equals("Q")) {
				break;
			}
			System.out.println("L�tfen ilk isminizi giriniz");
			String ilkIsim = scan.next();
			System.out.println("L�tfen soyIsminizi giriniz");
			String soyIsim = scan.next();
			System.out.println("adresinizi giriniz");
			String address = scan.next();
			System.out.println("L�tfen tel no giriniz");
			String telNo = scan.next();
		
			person.put(kimlikNo, ilkIsim + " " + soyIsim + "/ " + address + "/ " + telNo );
						
		}while(!kimlikNo.equals("Q"));
		    
		System.out.println(person);
		System.out.println();
		
		
		
		//Kullanicidan kimlik numarasini alin ve o kimlik numarasina sahip kisinin 
		//bilgilerini ekrana yazdirin. Tekrarli bilgi alma mumkun olsun...

		String key;
		do {
		System.out.println("Bigilerini �grenmek istedi�iniz kullan�c�n�n kimlik no giriniz.\n��lemi durdurmak i�in 'Q' tu�una bas�n�z");
		key = scan.next();
		if(key.equals("Q")) {
			break;
		}
		System.out.println(person.get(key));
		}while(!key.equals("Q"));
        
	}

}
