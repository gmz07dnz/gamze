package day30exceptions;

public class E01 {
	/*
	 1) FileNotFoundException,ustunde cal�s�lacak bir dosyaya ulasma ile alakal� problemlerde kullan�l�r.
	    Bir dosyaya ulasmada iki temel prob olabilir.
	    a- Path yanl�st�r.
	    b- Dosya silinmi�tir.
	    
	 2) IOException, input ve output ile alakal� tum problemlerde kullan�l�r.
	    IOException, FileNoFoundException'�n yapt�g� t�m i�leri yapabilir. Bu y�zden IOException kullan�ld�g�nda
	    FileNoFoundException'�n kullan�lmas�na gerek yoktur.
	    IOException FileNoFoundException Class'�n�n parent class'�d�r.
	    
	 3) Kod yazarken Exception kullanmak zorunda kal�rsak iki yol var :
	    a- Add throws declaration ==> prob olustugunda consol'a teknik mesajlar i�eren hata mesaj� basar.
	    b- Try-catch block ==> prob olustugunda ekrana ne yaz�lacag�na veya problemle alakal� ne yap�lacag�na bizim 
	       karar vermemize olanak sunar.
	       
	 4) Try-catch kulland�g�n�zda try bolumundeki kod hatas�z cal�s�rsa catch bolumu cal�smaz.
	    Catch bolumu try bolumundek� kod hataliyken cal�s�r.
	    
	 5))�try� block�dan sonra 1 veya daha fazla �catch� kullanilabilir. Olusan problem hangi catch ile
	  alakali ise o catch block calisir. Ayni anda sadece 1 catch block calisabilir
	  
	  6)Aralarinda parent-child iliskisi olan birden fazla catch block kullanirsaniz child olan uste
	  yazilmalidir aksi takdirde CTE alirsiniz.
	  
	 */

}
