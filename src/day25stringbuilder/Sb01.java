package day25stringbuilder;

public class Sb01 {

	public static void main(String[] args) {
		
		/*
		 1) String Class'ý immutable (Degiþtirilemez)'dýr. Java "mutable" (Degiþtirilebilir) Stringler uretebilmemiz için 
		 "StringBuilder" isimli bir class üretti.
		 
		 2) Java'da StringBuilder ile hemen hemen ayný iþi yapan StringBuffer Class'ý var.StringBuffer class'ý StringBuilder class'ýndan önce
		 üretilmiþti. StringBuffer yavas , StringBuilder hýzlý calýþýr. StringBuffer "syncronize" iþlemlerini yapabilir ama StringBuilder
		 yapamaz.
		 
		 3) ayný anda bir cok iþin yapýlmasýna "multý threading " denir. multi ==> cok , thread ==> yapýlan iþlerin herbiri 
		 Multi threading varsa, bu iþlerýn sýraya konmasýný lazým . Buna "synchorization " denir.
		 */
		
		String str = "Learn";
		
		concat(str);   // bu method içine learn alacak X ekleyecek ==> LearnX yazdý. bu degiþen str'nin kopyasý
		               //str = concat(str); yapsak str degiþirdi.

		System.out.println(str); // Learn ==> sonun X eklemiþtik oysa ki ust kýsýmda ama str'yi yani orjýnal hali yazdýrýnca yýne eski haline dönuyr
		
	/*
	Stringler'de atama yapmadan degeri degiþtirmek mümkün degildir .Bunun 2 sebebi var.
    1) Java pass by value kullanýr.
    2) String class'ý immutable(Degiþtirilemez) Class'týr.
	*/
		
	}

	private static void concat(String str) {// metodu getirirken içine bir string atacak ve ona "X" ekleyecek 
		System.out.println(str+"X");
		
	}

	
	
	
	
	
	
}
