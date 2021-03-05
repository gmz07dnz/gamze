package day03ifstatement;

public class Operations01 {
public static void main(String[] args) {
	
	// bir char'ýn sayý deðerini ascýý tablosu olmadan nasýl bulabiliriz
	
	// 1.yol
	int aDeger = 'a';
	System.out.println(aDeger); // 97
	
	// 2.yol
	
	char ch = 'a';
	System.out.println(ch); // 'a'
	
    System.out.println(ch + 0); // 97 ==> java toplama iþaretini görünce karakter ile toplama olmaz ki deyip iþlem yapar.

    int unlem = '!';
    System.out.println(unlem); // 33 
	
	// java mat iþlemlerini doðru olarak yapar.
    
    int a = 10;
    int b = 11;
    int c = 47;
    
    System.out.println(a + b ); // 10 + 11 = 21
    System.out.println(c / a); // 47 /10 = 4,7 ama ekrana 4 yazdýrýr. Çünkü Java int/ int = int verir. 
                               // Virgülden sonrasýný almaz.
    
    // farklý data type'larý ile iþlem yaparsak sonucu büyük data type'a göre verir.
    
    int d = 12;
    double e = 4;
    float f = 4f;
   System.out.println(d / e); // 3.0   sonucu double büyük olduðu için ona göre verir. 
   System.out.println(d + e); // 16.0
   
   // eger sonucun küsuratlý rakam seklinde olmasýný istyiyorsak o zmn data type'ýn birini double secmeliyiz.
   
   System.out.println(e / d); // 0.3333333333333333 ==> double 'da virgülden sonra 16 rakam olur en fazla
   
   System.out.println(f / d); // 0.33333334 ==> float'da virgülden sonra 8 rakam olur en fazla
   
   // MODULUS ( % )
  // iki tam sayýnýn bölümünün kalanýdýr.
   
   System.out.println(13 % 5); // 3

   System.out.println(245 % 3); // 2
   
   System.out.println(7 % 2); // 1 ==> teksayýdýr kalan 1 oldugu için
    
   System.out.println(1234567 % 2); // 1 ==> odd number 
   
   // CONCATENATION
   // stringleri birbirine yapýþtýrmak için kullanýlýr.
   
   String s1 = "Java";
   String s2 = "kolaydir";
   
   System.out.println(s1 + s2); // Javakolaydir
   System.out.println(s1 + " " + s2); // Java kolaydir
   
   String s3 = "Java ";
   String s4 = "kolaydir";
   System.out.println(s3 + s4); // Java kolaydir
   
   
   
   
    
    
}
	
	
	
	
	
	
}
