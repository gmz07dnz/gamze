package day26encapsulation;

public class E01 {
	
	
	/*
	  1) Encapsulation k�saca "Data Hiding(saklamak)" demektir.
	  
	  2) Basar�l� bir encapsulation asag�daki �zelliklere sahip olmal�:
	  a- Nas�l kullan�lacag� belli olmal�. (Direksiyon gibi)
	  b- Kodun karmas�kl�g� kullan�m�n karmas�kl�g�na sebep olmamal�. Yani �ok karmas�k kodlardan olu�an bir yap� basit bir 
	  �ekilde kullan�labilmeli.
	  c- Bir b�l�m�n bozulmas� baska b�l�mlerin bozulmas�na sebep olmamal�.
	  
	  3) Encapsulation nas�l yap�l�r?
	  a- Access Modifier'lar� "private" olarak kullan�n�z.
	  b- getter() ve setter() methodlar� ile "encapsulated" data'lara ulas�p unlar� okuyabilir(getter) ve 
	  degi�tirebiliriz(setter).
	  
	  4) Encapsulation'�n faydalar�
	  a- flexibility. Normalde asag�daki ornekte "age" variable'�n degeri 25't�r. Ama di�er class'larda setAge() methodunu kullanarak 
	  age variable'�n�n degerini istedi�imiz gibi degi�tirip kullanabiliriz.
	  b-reusability. getter() ve setter() methodlar�n� bir kere olustururuz sonra proje i�indeki t�m class'larda istedi�imiz 
	  kadar kullabiliriz.
	  c- �stedi�iniz data'y� okunabilir(getter() olustur) istedi�iniz data'y� okunamaz(getter() olusutrma) hale getiebilirsiniz.
	  d- �sted�iniz data'y� degi�tirilebilir (setter() olustur) istedi�iniz data'y� degi�tirilemez (setter() olusturma) yapabilirsiniz.
	  
	  NOTE: T�m variable'lar private ve sadece getter() methodlar� olusturdum.Bu tarz bir class'ta data'lar sadece okunabilir.
	  Bu class'lara "�mmutable Class" denir.
	  e- Kullan�c�n�n kulland�g� sistem arkas�ndaki karma��k yap�y� kullan�c�ya g�stermez.
	  B�ylelikle kullan�c� yapmak istedi�ini daha rahat yapar.
	  
	  5) Bir class'da 
	  a-t�m variable'lar private ise 
	  b-t�m getter() ve setter()'lar olusturulmu� ise bu class "Fully Encapsulated" olarak adland�r�l�r.
	  E01 class ==> fully capsulated
	  E03 class ==> fully encapsulated degildir.
	  
	  6) getter() ve setter() method'lar�na "java Beans" de denir.
	 */

	
	private int age = 25;  // private olunca encapsulated oluyor
	private String name = "Ali";
	
	// getter() methodunu olusturmak ==> return type variable'�n data type ile ayn� olmal�. 
	//                   method ismi ==> hep get olur sonra da variable ismi
	
	public int getAge() {
		
		return age;
	}
	
	
	public String getName () {
		
		return name;
		
	}
	
	
	
	// setter() method olu�turmak . Return type her zaman void olur
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		
		this.name= name;
	}
		

	
}
