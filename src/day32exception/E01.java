package day32exception;

public class E01 {
	
	/*
	 
	 1) Garbage collector s�rekli memory'i kontrol eder. silinmesi gereken herhangi bir data varsa 
	 memory'i temiz tutmak i�in o datay� siler.Ama data'yo silmeden �nce "finalize" eder.
	 finalize etmek i�in finalize() methodunu kullan�r. bu methodun ne zaman cal�sacag�na java karar verir.
	 Siz kod yazarken isterseniz finalize() methodunu cag�rabilirsiniz ama siz cag�rsan�z da ne zaman cal�sacag�na
	 Java karar verir.
	 
	 2) "final", "finally" ve "finalize" ac�klarm�s�n�z?
	 
	    final(keyword): ==> final method override edilemez
	                    ==> final variable degeri degistirilemez
	                   ==> final class child class sahibi olamaz.
	  finally(code block): ==> try-catch block�dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.
	  finalize(method):  ==> Garbage Collector bir data�yi imha etmeden once calistirir.
	 
	 */

}
