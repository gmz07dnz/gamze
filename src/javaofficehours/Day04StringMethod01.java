package javaofficehours;

public class Day04StringMethod01 {

	public static void main(String[] args) {
		
		// indexOf() ==> karakterin ilk g�r�m�n�n yerini belirler
	
	String str = "Istanbullu";
	
	System.out.println(str.indexOf('I')); // 0
	System.out.println(str.indexOf('u')); // 6
	
	
	   // lastIndexOf()  ==> karakterin son g�r�n�m�n�n yerini belirler.
	
	System.out.println(str.lastIndexOf('u')); // 9
 	
	
	 //Bir String kelimenin ve ilk harfi ile son harfinin yerini de�i�tirin

	// 1.yol
	
	String isim ="Mehmet";
	
	char isimIlkHarf = isim.charAt(0);
	char isimSonHarf = isim.charAt(isim.length()-1);
	
	String IsimYeni= isimSonHarf + isim.substring(1, isim.length()-1)+isimIlkHarf;
	
	System.out.println(IsimYeni); // tehmeM
	
	
	// substring() methodu String'in belli bir k�sm�n� al�r
	
	System.out.println(str.substring(4));// 4 dahil devam�n� al�r ==>   nbullu 
    System.out.println(str.substring(2, 8)); // 2. index ile 8. index aras�n� yazd�r�r. 2 dahil , 8 hari� ==>  tanbul
    
    
    // contains () methodu ==> string icerisinde aranan karakterini kontrol eder .True ya da false d�ner. Tek karakter ya da birden
    // fazla karakter olabilir.
    
    System.out.println(str.contains("iz")); // false
    System.out.println(str.contains("bul")); // true
    System.out.println(str.contains("s")); // true
    
    // isempty() methodu ==> string i�inde karakter olup olmad�g�n� kontrol eder. True ya da false d�ner.
    String str1 = "";
    
    System.out.println(str1.isEmpty()); // true
    System.out.println(str.isEmpty()); // false
    
    // trim() methodu ==> bas ve sondaki bo�luklar� siler.
    
    String str2 = "  ankara istanbul  ";
    System.out.println(str2.trim()); //ankara istanbul
    
    // startsWith() methodu ==> istenen harf ile baslay�p baslamad�g�n� montrol eder.True ya da false d�ner.
    System.out.println(str2.startsWith("a")); // false
    System.out.println(str2.startsWith(" ")); // true
    
    // replace() ==> istenilen bir karakterin baska bir karakterle yer degi�tirmesini saglar.
    
    String str3 = "ankara";
    System.out.println(str3.replace('a', 'A')); // AnkArA
    
    // replaceFirst() ==> String'in ilk g�rd�g�n� degi�tirir.
    
    System.out.println(str3.replaceFirst("a", "A"));  // Ankara
    
    
    
    
    
    
    
    
  
	}

}
