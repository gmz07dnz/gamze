package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LambdaReview2 {

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
        
        //Listteki isimlerden "a" ve "n" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz
        
        
      int harfSayisi= list.stream().filter(t->t.contains("a") &&t.contains("n")).mapToInt(t->t.length()).sum();
        System.out.println(harfSayisi);
        
      //Listteki isimlerden ilk harfi son harfinden alfabetik olarak onde olan isimleri ekrana yazdiriniz.
      //Tum harfleri kucuk harf olarak dusununuz 
        
        list.stream().filter(t->t.toLowerCase().charAt(0)<t.toLowerCase().charAt(t.length()-1)).forEach(System.out::println);
        
       
        
        
	}

}
