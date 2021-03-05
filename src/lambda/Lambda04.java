package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");

        buyukHarfSiraliTekrarsiz1(list);
        System.out.println("========");
        buyukHarfSiraliTekrarsiz2(list);
        System.out.println("========");
        charSayiTerSiraliTekrarsiz(list);
        System.out.println("========");
        charSayisinaGoreSirala(list);
        System.out.println("========");
        sonHarfReverse(list);
	}

	// list elemanlar�n tamam�n� buyuk harfli olarak alfabetik s�rada ve tekrarl� elemanlar� sadece bir kere console'a yaz�n�z.
	
	public static void buyukHarfSiraliTekrarsiz1(List<String> list) {  
		
		list.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(System.out::println); // distinct=> sadece tekrarl�y� bir kere al�r
		
		
	}
	
    public static void buyukHarfSiraliTekrarsiz2(List<String> list) {  
		
		list.stream().map(String::toUpperCase).sorted().distinct().forEach(System.out::println);
		
		
	}
    
    //list elemanlar�n tamam�n�n karakter say�s�n�, ters s�ral� olarak tekrarl� elemanlar� sadece bir kere olacak sekilde console'a yaz�n�z.
	
    
    public static void charSayiTerSiraliTekrarsiz(List<String> list) {
    	
    	list.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda01::printEl);
    }
    
    
    //list elemanlar�n tamam�n� karakter say�s�na g�re k���kten b�y��e console'a yazd�r�n�z.
    
    public static void charSayisinaGoreSirala(List<String> list) {
    	
    	list.stream().sorted(Comparator.comparing(t->t.toString().length())).forEach(System.out::println);
    }
    
    
    
  //list elemanlar�n tamam�n� son harflerine g�re reverse order olarak console'a yazd�r�n�z.
    
    
    public static void sonHarfReverse(List<String> list) {
    	
    	list.
		   stream().
		   sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).
		   forEach(System.out::println);
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
