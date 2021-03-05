package day39collectionsmaps;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapProje {

	public static void main(String[] args) {
		
		/*saveInfo() method olusturun:
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
	HashMap<String,String> hm = new HashMap<>();
	selectOption(hm);
	
	
	}

     public static void saveInfo(HashMap<String,String> hm) {
    	
    	 Scanner scan = new Scanner(System.in);
    	 String id= "";
    	 do {
    		 System.out.println("Kimlik numaran�z� giriniz.\nGiri�i durdurmak i�in 'Q' tusuna bas�n�z.");
    		 id= scan.next();
    		 
    		 // kullan�c�dan isim al, tekrarl�ya izin verme
    		 if(id.equalsIgnoreCase("Q")) {
    			 break;
    		 }else {
    			 while(hm.containsKey(id)) {
    				 System.out.println(id +" kay�tlarda var, lutfen gecerli bir id giriniz");
    				 id = scan.next();
    			 }
    		 }
    		 
    		 scan.nextLine();// next()'den sonra nextLine() kullan�rsan�z bu kodu kullan�n�z 
    		 
    		 //Kullan�c�dan isim al
    		 System.out.println("Tam isminizi giriniz");
    		 String isim = scan.nextLine();
    		 
    		 // Kullan�c�dan adres al�n�z
    		 System.out.println("Adresinizi giriniz");
    		 String adres = scan.nextLine();
    		 
    		 // Kullan�c�dan tel no al�n�z.
    		 System.out.println("Telefon no giriniz");
    		 String tel = scan.nextLine();
    		 
    		 // isim,adres ve tel bilgileri birle�tirildi.
    		 String ogrenci = "\nisim: "+isim+"\nadres: "+adres+"\ntel: "+tel;
    		 
    		 hm.put(id, ogrenci);
    		 
     }while(true);

      System.out.println(hm);
}
     
     public static void getInfo(HashMap<String,String> hm) {
    	 
    	 Scanner scan = new Scanner(System.in);
    	 String id = "";
    	 do {
    		 System.out.println("��renci bilgisini almak i�in id giriniz.\nBilgi almay� durdurmak i�in 'Q' tusuna bas�n�z.");
    		 id = scan.next();
    		 if(id.equalsIgnoreCase("Q")) {
    			 break;
    		 }else if (hm.isEmpty()) {
    			 System.out.println("herhangi bir data yok");
    			 break;
    		 }
    		 else if(!hm.containsKey(id)){
    			 System.out.println(id +" gecerli bir id degil. Lutfen gecerli bir id giriniz.");
    		 }else {
    		 
    			 String ogrenciInfo = hm.get(id);
    			 System.out.println(id+ " asag�daki bilgileri icerir: \n"+ogrenciInfo);
    		 }
    		 
    	 }while(true);
    	 
     }
     
     public static void removeInfo(HashMap<String,String> hm) {
    	 
    	 Scanner scan = new Scanner(System.in);
    	 String id = "";
    	 
    	 do {
    		 System.out.println("Kay�t silmek i�in kimlik numaras� giriniz.");
    		 System.out.println("Silme i�lemini durdurmak i�in 'Q' tusuna bas�n�z");
             id = scan.next();
             if(id.equalsIgnoreCase("Q")) {
    			 break;
    		 }else if (hm.isEmpty()) {
    			 System.out.println("herhangi bir data yok");
    			 break;
    		 } else if (!hm.containsKey(id)) {
    			 System.out.println(id +" gecerli bir id degil. Lutfen gecerli bir id giriniz.");
    			 
    		 }else {
    			String silinenData = hm.remove(id);
    			System.out.println("Silinen ogrenci: \n"+silinenData);
    			 
    		 }
    	  }while(true);
    	 
    	 System.out.println(hm);
    	 
    	 
    	 
     }
     
    public static void selectOption(HashMap<String, String> hm) {
    	Scanner scan = new Scanner(System.in);
		String option = "";
		
		do {
			System.out.println("Kullanmak istediginiz methodu seciniz(1-2-3)");
			System.out.println("1: Ogrenci Ekle\n2: Ogrenci Bilgisi Alma\n3: Ogrenci Kaydi Silme");
			System.out.println("Secim yapmayi sonlandirmak icin 'Q' tusuna basiniz");
			option = scan.next();
			if(option.equalsIgnoreCase("Q")) {
				break;
			}
			switch(option) {
				case "1":
					saveInfo(hm);
					break;
				case "2":
					getInfo(hm);
					break;
				case "3":
					removeInfo(hm);
					break;
				default:
					System.out.println("Yanlis method sectiniz tekrar deneyiniz");	
			}
			
		}while(true);
    	
    	
    }
    
     
     
     
}
