package day26encapsulation;

public class E01 {
	
	
	/*
	  1) Encapsulation kýsaca "Data Hiding(saklamak)" demektir.
	  
	  2) Basarýlý bir encapsulation asagýdaki özelliklere sahip olmalý:
	  a- Nasýl kullanýlacagý belli olmalý. (Direksiyon gibi)
	  b- Kodun karmasýklýgý kullanýmýn karmasýklýgýna sebep olmamalý. Yani çok karmasýk kodlardan oluþan bir yapý basit bir 
	  þekilde kullanýlabilmeli.
	  c- Bir bölümün bozulmasý baska bölümlerin bozulmasýna sebep olmamalý.
	  
	  3) Encapsulation nasýl yapýlýr?
	  a- Access Modifier'larý "private" olarak kullanýnýz.
	  b- getter() ve setter() methodlarý ile "encapsulated" data'lara ulasýp unlarý okuyabilir(getter) ve 
	  degiþtirebiliriz(setter).
	  
	  4) Encapsulation'ýn faydalarý
	  a- flexibility. Normalde asagýdaki ornekte "age" variable'ýn degeri 25'týr. Ama diðer class'larda setAge() methodunu kullanarak 
	  age variable'ýnýn degerini istediðimiz gibi degiþtirip kullanabiliriz.
	  b-reusability. getter() ve setter() methodlarýný bir kere olustururuz sonra proje içindeki tüm class'larda istediðimiz 
	  kadar kullabiliriz.
	  c- Ýstediðiniz data'yý okunabilir(getter() olustur) istediðiniz data'yý okunamaz(getter() olusutrma) hale getiebilirsiniz.
	  d- Ýstedðiniz data'yý degiþtirilebilir (setter() olustur) istediðiniz data'yý degiþtirilemez (setter() olusturma) yapabilirsiniz.
	  
	  NOTE: Tüm variable'lar private ve sadece getter() methodlarý olusturdum.Bu tarz bir class'ta data'lar sadece okunabilir.
	  Bu class'lara "Ýmmutable Class" denir.
	  e- Kullanýcýnýn kullandýgý sistem arkasýndaki karmaþýk yapýyý kullanýcýya göstermez.
	  Böylelikle kullanýcý yapmak istediðini daha rahat yapar.
	  
	  5) Bir class'da 
	  a-tüm variable'lar private ise 
	  b-tüm getter() ve setter()'lar olusturulmuþ ise bu class "Fully Encapsulated" olarak adlandýrýlýr.
	  E01 class ==> fully capsulated
	  E03 class ==> fully encapsulated degildir.
	  
	  6) getter() ve setter() method'larýna "java Beans" de denir.
	 */

	
	private int age = 25;  // private olunca encapsulated oluyor
	private String name = "Ali";
	
	// getter() methodunu olusturmak ==> return type variable'ýn data type ile ayný olmalý. 
	//                   method ismi ==> hep get olur sonra da variable ismi
	
	public int getAge() {
		
		return age;
	}
	
	
	public String getName () {
		
		return name;
		
	}
	
	
	
	// setter() method oluþturmak . Return type her zaman void olur
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		
		this.name= name;
	}
		

	
}
