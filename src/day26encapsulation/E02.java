package day26encapsulation;

public class E02 {

	public static void main(String[] args) {
		
		E01 obj1 = new E01();
		
		obj1.getAge(); // age görünmedi ama getAge listede cýkýyor
		System.out.println(obj1.getAge()); // 25  ==> age variable'ý private ulasýlamazdý. getter() methodu ile encapsulated 
		                                   // olan variable' okuyabildim

		
		obj1.getName();
		System.out.println(obj1.getName()); // Ali  == > nmae private ama giris yapabildik
		
		obj1.setAge(33); // set ile de degiþiklik yapabiliyorduk. Ama asýl olan bozulmuyor. Ýçine parametre koyarak deðiþiklik
		                 //yapabiliriz.setter() methodu yasý 33 yaptý . getter() methodu ile de okuyoruz. E01'daki ayný yine
		                //Sadece bu Class'da bu yasý 33 olarak kullanabiliyoruz.asýl olan degiþirse o zmn encapsulated olmamýstýr.
		
		System.out.println(obj1.getAge()); // 33
		
		obj1.setName("Ayse");
		System.out.println(obj1.getName()); // Ayse
		
		// Bu iki method olmazsa býz bu variable'lara private oldugu için ulaþamayýz.
		
		
		E03 obj3 = new E03();
		
		// num'ý 38 yap ve ekrana yazdýr.
		
		obj3.setNum(38);
		System.out.println(obj3.getNum()); // 38  ==>Normalde  E03 class'ýnda encapsulated sekilde 12 degerindeydi.
		                                   // Ordakinde bir degiþiklik olmuyor.
		
		// name'i ekrana yazdýrýn
		
		obj3.getName();
		System.out.println(obj3.getName()); // Emine
		
		
		// initial variable'ýný degiþtirilemez hale getirin.
		// ==> E03 class'ýna gidip setter() methodunu sileriz.
		
	   // initial methodunu okunamaz hale getirin
	   // ==> E03 class'ýna gideriz getter() methodunu sileriz.
      // Böylelikle initial variable kimsenin ulasamadýgý E03 class'ýnda gömülü bir variable oldu
		
	
		
		
		
	}

}
