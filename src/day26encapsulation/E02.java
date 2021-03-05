package day26encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj1 = new E01();
		
		obj1.getAge(); // age g�r�nmedi ama getAge listede c�k�yor
		System.out.println(obj1.getAge()); // 25  ==> age variable'� private ulas�lamazd�. getter() methodu ile encapsulated 
		                                   // olan variable' okuyabildim

		
		obj1.getName();
		System.out.println(obj1.getName()); // Ali  == > nmae private ama giris yapabildik
		
		obj1.setAge(33); // set ile de degi�iklik yapabiliyorduk. Ama as�l olan bozulmuyor. ��ine parametre koyarak de�i�iklik
		                 //yapabiliriz.setter() methodu yas� 33 yapt� . getter() methodu ile de okuyoruz. E01'daki ayn� yine
		                //Sadece bu Class'da bu yas� 33 olarak kullanabiliyoruz.as�l olan degi�irse o zmn encapsulated olmam�st�r.
		
		System.out.println(obj1.getAge()); // 33
		
		obj1.setName("Ayse");
		System.out.println(obj1.getName()); // Ayse
		
		// Bu iki method olmazsa b�z bu variable'lara private oldugu i�in ula�amay�z.
		
		
		E03 obj3 = new E03();
		
		// num'� 38 yap ve ekrana yazd�r.
		
		obj3.setNum(38);
		System.out.println(obj3.getNum()); // 38  ==>Normalde  E03 class'�nda encapsulated sekilde 12 degerindeydi.
		                                   // Ordakinde bir degi�iklik olmuyor.
		
		// name'i ekrana yazd�r�n
		
		obj3.getName();
		System.out.println(obj3.getName()); // Emine
		
		
		// initial variable'�n� degi�tirilemez hale getirin.
		// ==> E03 class'�na gidip setter() methodunu sileriz.
		
	   // initial methodunu okunamaz hale getirin
	   // ==> E03 class'�na gideriz getter() methodunu sileriz.
      // B�ylelikle initial variable kimsenin ulasamad�g� E03 class'�nda g�m�l� bir variable oldu
		
	
		
		
		
	}

}
