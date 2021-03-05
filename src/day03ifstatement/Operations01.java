package day03ifstatement;

public class Operations01 {
public static void main(String[] args) {
	
	// bir char'�n say� de�erini asc�� tablosu olmadan nas�l bulabiliriz
	
	// 1.yol
	int aDeger = 'a';
	System.out.println(aDeger); // 97
	
	// 2.yol
	
	char ch = 'a';
	System.out.println(ch); // 'a'
	
    System.out.println(ch + 0); // 97 ==> java toplama i�aretini g�r�nce karakter ile toplama olmaz ki deyip i�lem yapar.

    int unlem = '!';
    System.out.println(unlem); // 33 
	
	// java mat i�lemlerini do�ru olarak yapar.
    
    int a = 10;
    int b = 11;
    int c = 47;
    
    System.out.println(a + b ); // 10 + 11 = 21
    System.out.println(c / a); // 47 /10 = 4,7 ama ekrana 4 yazd�r�r. ��nk� Java int/ int = int verir. 
                               // Virg�lden sonras�n� almaz.
    
    // farkl� data type'lar� ile i�lem yaparsak sonucu b�y�k data type'a g�re verir.
    
    int d = 12;
    double e = 4;
    float f = 4f;
   System.out.println(d / e); // 3.0   sonucu double b�y�k oldu�u i�in ona g�re verir. 
   System.out.println(d + e); // 16.0
   
   // eger sonucun k�suratl� rakam seklinde olmas�n� istyiyorsak o zmn data type'�n birini double secmeliyiz.
   
   System.out.println(e / d); // 0.3333333333333333 ==> double 'da virg�lden sonra 16 rakam olur en fazla
   
   System.out.println(f / d); // 0.33333334 ==> float'da virg�lden sonra 8 rakam olur en fazla
   
   // MODULUS ( % )
  // iki tam say�n�n b�l�m�n�n kalan�d�r.
   
   System.out.println(13 % 5); // 3

   System.out.println(245 % 3); // 2
   
   System.out.println(7 % 2); // 1 ==> teksay�d�r kalan 1 oldugu i�in
    
   System.out.println(1234567 % 2); // 1 ==> odd number 
   
   // CONCATENATION
   // stringleri birbirine yap��t�rmak i�in kullan�l�r.
   
   String s1 = "Java";
   String s2 = "kolaydir";
   
   System.out.println(s1 + s2); // Javakolaydir
   System.out.println(s1 + " " + s2); // Java kolaydir
   
   String s3 = "Java ";
   String s4 = "kolaydir";
   System.out.println(s3 + s4); // Java kolaydir
   
   
   
   
    
    
}
	
	
	
	
	
	
}
