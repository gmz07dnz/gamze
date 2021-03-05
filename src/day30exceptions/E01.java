package day30exceptions;

public class E01 {
	/*
	 1) FileNotFoundException,ustunde calýsýlacak bir dosyaya ulasma ile alakalý problemlerde kullanýlýr.
	    Bir dosyaya ulasmada iki temel prob olabilir.
	    a- Path yanlýstýr.
	    b- Dosya silinmiþtir.
	    
	 2) IOException, input ve output ile alakalý tum problemlerde kullanýlýr.
	    IOException, FileNoFoundException'ýn yaptýgý tüm iþleri yapabilir. Bu yüzden IOException kullanýldýgýnda
	    FileNoFoundException'ýn kullanýlmasýna gerek yoktur.
	    IOException FileNoFoundException Class'ýnýn parent class'ýdýr.
	    
	 3) Kod yazarken Exception kullanmak zorunda kalýrsak iki yol var :
	    a- Add throws declaration ==> prob olustugunda consol'a teknik mesajlar içeren hata mesajý basar.
	    b- Try-catch block ==> prob olustugunda ekrana ne yazýlacagýna veya problemle alakalý ne yapýlacagýna bizim 
	       karar vermemize olanak sunar.
	       
	 4) Try-catch kullandýgýnýzda try bolumundeki kod hatasýz calýsýrsa catch bolumu calýsmaz.
	    Catch bolumu try bolumundeký kod hataliyken calýsýr.
	    
	 5))“try” block’dan sonra 1 veya daha fazla “catch” kullanilabilir. Olusan problem hangi catch ile
	  alakali ise o catch block calisir. Ayni anda sadece 1 catch block calisabilir
	  
	  6)Aralarinda parent-child iliskisi olan birden fazla catch block kullanirsaniz child olan uste
	  yazilmalidir aksi takdirde CTE alirsiniz.
	  
	 */

}
