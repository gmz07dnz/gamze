package day32exception;

public class E01 {
	
	/*
	 
	 1) Garbage collector sürekli memory'i kontrol eder. silinmesi gereken herhangi bir data varsa 
	 memory'i temiz tutmak için o datayý siler.Ama data'yo silmeden önce "finalize" eder.
	 finalize etmek için finalize() methodunu kullanýr. bu methodun ne zaman calýsacagýna java karar verir.
	 Siz kod yazarken isterseniz finalize() methodunu cagýrabilirsiniz ama siz cagýrsanýz da ne zaman calýsacagýna
	 Java karar verir.
	 
	 2) "final", "finally" ve "finalize" acýklarmýsýnýz?
	 
	    final(keyword): ==> final method override edilemez
	                    ==> final variable degeri degistirilemez
	                   ==> final class child class sahibi olamaz.
	  finally(code block): ==> try-catch block’dan sonra kullanilir ve Exception atilsa da atilmasa da calisir.
	  finalize(method):  ==> Garbage Collector bir data’yi imha etmeden once calistirir.
	 
	 */

}
