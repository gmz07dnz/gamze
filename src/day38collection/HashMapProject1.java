package day38collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HashMapProject1 {

	
	static HashMap<String,String> person= new HashMap<>();
	
	
	public static void main(String[] args) {
		
		/*
		 * saveInfo() method olusturun:
         1)Kullanicidan bircok kimlik numarasi(4 haneli), isim, adres ve telefon alin.
         2)Kimlik numarasini key olarak, diger bilgileri value olarak bir map'e depolayin.
         3)Ayni kimlik numarasi ile bilgi girilmesine engel olun.
         
         getInfo() method olusturun:
         1)Kimlik numarasini girerek kullanicinin bilgilerine ulasin.
         2)Olmayan kimlik numarasi girilirse kullaniciya hata mesaji verin.
         
         removeInfo() method olusturun:
         1)Kimlik numarasini girerek data silin.
         2)Girilen kimlik numarasi yoksa kullaniciya hata mesaji verin.
         3)Collection bos ise kullaniciya hata mesaji verin.
         
         selectOption() method olusturun:
         1)Yukaridaki 3 methodu programi sonlandirana kadar secme hakki verin
		 */
		
		
		
		
		
		selectOption();
		
	}

	

	private static void selectOption() {
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("i�lem yapmak i�in l�tfen bir numara se�iniz \n 1-Kay�t i�lemleri \n 2-Kimlik no ile ki�i bilgilerine ula�ma "
				+ "\n 3-Kimlik no ile data silme\n 4-c�k�� ");
		
        int islemNo= scan.nextInt();
        switch (islemNo) {
		case 1:
			saveInfo();
			break;
		case 2:
			getInfo();
			break;
		case 3:
			removeInfo();
			break;
		case 4:
			System.out.println("��leminiz sona ermi�tir");
			break;
		default:
			System.out.println("L�tfen dogru bir se�im yap�n�z");
			break;
		}
        if (islemNo==4) {
        	break;
        }
        
		
	}

	}

	private static void removeInfo() {
		Scanner scan = new Scanner(System.in);
		String id ="";   
		
			
		   while(!id.equalsIgnoreCase("Q")) {
			   System.out.println("Silmek istedi�iniz data'n�n id numaras�n� giriniz.\n��lemi durdurmak i�in 'Q' tusuna bas�n�z.");
			    id = scan.next();

			    if(id.equalsIgnoreCase("Q")) {
					   break;
				   }
			   if(person.containsKey(id)) {
			   
			   String silinen= person.remove(id);
			    System.out.println("Silinen ogrenci: \n"+ silinen);
			   } else if(person.isEmpty()) {
				   
				   System.out.println("listede silinecek kimlik numaras� yoktur.");
				   break;
			   }else {
				   System.out.println("Girilen kimlik numaras� hatal� veya yoktur");
			   }
		   }
				
		}



	public static void saveInfo() {
		
		Scanner scan = new Scanner(System.in);
		
		
		String id ="";
		
		do {
			System.out.println("Kimlik bilginizi giriniz .��lemi durdurmak i�in 'Q' tusuna bas�n�z");
		    id = scan.next();
		    if(person.containsKey(id)) {
		    	
		    	 System.out.println(id +" kimlik numaras�n� daha �nce kullanm��t�n�z.L�tfen tekrar giriniz.");
		    continue;
		    }
		   
		    
		    if (id.equalsIgnoreCase("Q")) {
		    	break;
		    }
		    System.out.println("ilk isminizi giriniz.");
		    String ilkIsim = scan.next();
		    System.out.println("Soyisminizi giriniz");
		    String soyIsim = scan.next();
		    
		    System.out.println("Adresinizi giriniz");
		    String address = scan.next();
		    System.out.println("Telefon numaran�z� giriniz");
		    String telNo = scan.next();
		    
		    String ogrenci = "\nisim: "+ilkIsim+" "+soyIsim+"\nadres: "+address+"\ntel: "+telNo;
			
			person.put(id, ogrenci);
			
		}while (!id.equalsIgnoreCase("Q"));
		
		System.out.println(person);
		
		
	}

	
	
	

	private static void getInfo() {

		Scanner scan = new Scanner(System.in);
		
		String id="";
		while (!id.equalsIgnoreCase("Q")) {
		System.out.println("Bilgilerini �grenmek istedi�iniz kullan�c�n kimlik numaras�n� giriniz.\n��lemi durdurmak i�in 'Q' tusuna bas�n�z.");
		 id = scan.next();
		 if (id.equalsIgnoreCase("Q")) {
				break;
			}
		if(person.containsKey(id)) {
			System.out.println(id+ "Asag�daki bilgileri i�erir: \n"+ person.get(id));
		 
		}
		else {
			System.out.println(id+ " kimlik numaras� bulunmamaktad�r.Tekrar deneyiniz");
			id = scan.next();
			}
		}
	}
	
	
}
