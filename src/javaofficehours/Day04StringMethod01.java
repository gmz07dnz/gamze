package javaofficehours;

public class Day04StringMethod01 {

	public static void main(String[] args) {
		
		// indexOf() ==> karakterin ilk görümünün yerini belirler
	
	String str = "Istanbullu";
	
	System.out.println(str.indexOf('I')); // 0
	System.out.println(str.indexOf('u')); // 6
	
	
	   // lastIndexOf()  ==> karakterin son görünümünün yerini belirler.
	
	System.out.println(str.lastIndexOf('u')); // 9
 	
	
	 //Bir String kelimenin ve ilk harfi ile son harfinin yerini deðiþtirin

	// 1.yol
	
	String isim ="Mehmet";
	
	char isimIlkHarf = isim.charAt(0);
	char isimSonHarf = isim.charAt(isim.length()-1);
	
	String IsimYeni= isimSonHarf + isim.substring(1, isim.length()-1)+isimIlkHarf;
	
	System.out.println(IsimYeni); // tehmeM
	
	
	// substring() methodu String'in belli bir kýsmýný alýr
	
	System.out.println(str.substring(4));// 4 dahil devamýný alýr ==>   nbullu 
    System.out.println(str.substring(2, 8)); // 2. index ile 8. index arasýný yazdýrýr. 2 dahil , 8 hariç ==>  tanbul
    
    
    // contains () methodu ==> string icerisinde aranan karakterini kontrol eder .True ya da false döner. Tek karakter ya da birden
    // fazla karakter olabilir.
    
    System.out.println(str.contains("iz")); // false
    System.out.println(str.contains("bul")); // true
    System.out.println(str.contains("s")); // true
    
    // isempty() methodu ==> string içinde karakter olup olmadýgýný kontrol eder. True ya da false döner.
    String str1 = "";
    
    System.out.println(str1.isEmpty()); // true
    System.out.println(str.isEmpty()); // false
    
    // trim() methodu ==> bas ve sondaki boþluklarý siler.
    
    String str2 = "  ankara istanbul  ";
    System.out.println(str2.trim()); //ankara istanbul
    
    // startsWith() methodu ==> istenen harf ile baslayýp baslamadýgýný montrol eder.True ya da false döner.
    System.out.println(str2.startsWith("a")); // false
    System.out.println(str2.startsWith(" ")); // true
    
    // replace() ==> istenilen bir karakterin baska bir karakterle yer degiþtirmesini saglar.
    
    String str3 = "ankara";
    System.out.println(str3.replace('a', 'A')); // AnkArA
    
    // replaceFirst() ==> String'in ilk gördügünü degiþtirir.
    
    System.out.println(str3.replaceFirst("a", "A"));  // Ankara
    
    
    
    
    
    
    
    
  
	}

}
