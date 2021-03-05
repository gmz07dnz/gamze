package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Lambda05 {

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
        
        ciftLengthSqrTekrarsizReverse(list);
        System.out.println();
        harfSayisi7denFazla(list);
        System.out.println();
        ilkHarfX(list);
        System.out.println();
        enAZ1r(list);
        System.out.println();
        harfSayisinaGoreReverseIlk(list);
        System.out.println();
        harfSayisinaGoreReverseIlk2(list);
        System.out.println();
        sonHarfSiralaSonEleman(list);
        System.out.println();
        sonHarfSiralaIlkHaric(list);

	}

	    //Character sayilari cift sayili olan elemanlarin character sayilarinin karelerini hesaplayan, 
		//tekrarli olanlari sadece bir kere buyukten kucuge dogru yazdiran bir program yaziniz.
	
	
	public static void ciftLengthSqrTekrarsizReverse(List<String> list) {
		
		list.stream().
		filter(t->t.length()%2==0).
		map(t->t.length()*t.length()).
		distinct().
		sorted(Comparator.reverseOrder()).
		forEach(Lambda01::printEl);
	}
	
	//Tum isimlerin 7 veya 7'den az harf icerdigini gosteren programi yaziniz
	
	public static void harfSayisi7denFazla(List<String> list) {      // allMatch() ==> hepsi uyar biraz sonra yazacagým kurala
		                                                             // hepsi uyuyorsa true, en az bir tane uymayan varsa false döner
		boolean result = list.stream().allMatch(t->t.length()>=7); 
		
		if (result) {
			System.out.println("Tüm elemanlar 7 veya 7 den az harf içerir");
			
		}else {
			System.out.println("En az bir eleman 7 veya 7den az harf içermiyor");
		}
	}
	
	//Hicbir elemanin "X" ile baslamadigini gosteren programi yaziniz.
	
	public static void ilkHarfX(List<String> list) {
		boolean result = list.stream().noneMatch(t->t.startsWith("X"));
		if(result) {
			System.out.println("Hiçbir eleman 'X' ile baslamýyor");
		}else {
		System.out.println("En az bir eleman 'X' ile baslýyor.");	
		}
	}
	
	
	//En az 1 elemanin "r" ile bittigini gosteren programi yaziniz.
	
	public static void enAZ1r(List<String> list) {
		
	boolean result =list.stream().anyMatch(t->t.endsWith("r"));
		if(result) {
			System.out.println("En az bir eleman 'r' ile biter.");
		}else {
			System.out.println("Hiçbir eleman 'r' ile bitmez.");
		}
		
	}
	
	//Isimleri character sayilarina gore buyukten kucuge dizdikten sonra ilk ismi ekrana yazdiriniz
	
	
	public static void harfSayisinaGoreReverseIlk(List<String> list) {
		
	Optional<String> ilkIsim=	list.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).findFirst();
	System.out.println(ilkIsim);
	}
	
	
	public static void harfSayisinaGoreReverseIlk2(List<String> list) {
		
	Stream<String> ilkIsim=	list.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1);
		System.out.println(Arrays.toString(ilkIsim.toArray())); // Stream yazdýrabilmek için array'e cevirmek gerekiyor
		}
	
	
	//Isimleri son harflerine gore siraladiktan sonra son ismi ekrana yazdiriniz
	
	public static void sonHarfSiralaSonEleman(List<String> list) {
		
		Optional<String> sonIsim = list.
			    stream().
			    sorted(Comparator.
			                   comparing(t->t.toString().charAt(t.toString().length()-1)).
			                   reversed()).
			    findFirst();
                System.out.println(sonIsim);
	}
	
	//Isimleri son harflerine gore siraladiktan sonra ilk isim haric digerlerini ekrana yazdiriniz
	
	public static void sonHarfSiralaIlkHaric(List<String> list) {
		list.
		stream().
		sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1))).skip(1).forEach(System.out::println);
	}
	
	
	
	
}
