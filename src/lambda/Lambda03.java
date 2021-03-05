package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Lambda03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(-13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(-12);
		list.add(15);
		
		ciftKareMax(list);
		toplamEl(list);
		ciftElCarpim(list);
		toplamEl2(list);
		ciftElCarpim2(list);
		min1(list);
		min2(list);
		min3(list);
		min4(list);
		max1(list);
		max2(list);
		max3(list);
		max4(list);
		enBuyuk10danKucuk(list);
		tekKupSirala(list);
		System.out.println();
		ciftKareTersSira(list);
	}
	
	// List'deki çift sayý olan  elemanlarýn karelerini alýnýz en büyük olaný console'a yazdýrýnýz
	
	public static void ciftKareMax(List<Integer> list) {
		Optional<Integer> max = list.stream().filter(Lambda01::isCift).map(t-> t*t).reduce(Math::max); // math yerine Integer konulabilir ama 
		                                                                  //listeden emin olmak gerekir.specific olan daha hýzlý caliþir.
		                        
		System.out.println(max);
	}
	
	
	// List'deki tüm elemanlarýn toplamýný console'a yazýnýz.
	// Lambda Expression
	
	
	public static void toplamEl(List<Integer> list) {
		
	int toplam=	list.stream().reduce(0,(x,y)->x+y);
		System.out.println(toplam);
	}
	
	// Method Reference
	
	public static void toplamEl2(List<Integer> list) {
		
		Optional<Integer> toplam=	list.stream().reduce(Integer::sum);
			System.out.println(toplam);
		}
	
	// List'deki çift sayý olan  elemanlarýn carpýmýný console'a yazdýrýnýz.
	
	// Lambda Expression
	public static void ciftElCarpim(List<Integer> list) {
		
	int carpim =list.stream().filter(Lambda01::isCift).reduce(1,(x,y)->x*y);
		System.out.println(carpim);
	}
	
	// Method Reference
	
	public static void ciftElCarpim2(List<Integer> list) {
		
		Optional<Integer> carpim =list.stream().filter(Lambda01::isCift).reduce(Math::multiplyExact);
			System.out.println(carpim);
		}
		
	
	// List'deki elemanlardan en küçügünü 4 farklý yol kullanarak bulalým.
	// Method Reference => methodlarý javadan al
	
	public static void min1(List<Integer> list) {
		
   Optional<Integer> min =list.stream().reduce(Integer::min);		
		System.out.println(min);
		
	}
	
	public static void min2(List<Integer> list) {
		
		   Optional<Integer> min =list.stream().reduce(Math::min);		
				System.out.println(min);
				
			}
	
	// Method Reference => methodlarý kendimiz oluþturalým
	
	public static int minBul(int x,int y) {
		
	return x<y?x:y;

	}
	
	
	public static void min3(List<Integer> list) {
		
		   Optional<Integer> min =list.stream().reduce(Lambda03::minBul);		
				System.out.println(min);
				
			}
	
	
	// Lambda expression
	

	public static void min4(List<Integer> list) {
		
		   int min =list.stream().reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y );		
				System.out.println(min);
				
			}
	
	
	 //ODEV
	// List'deki elemanlardan en büyüðünü 4 farklý yol kullanarak bulalým.
	
	//Method Reference -> java 
	
	public static void max1(List<Integer> list) {
	Optional<Integer> max= list.stream().reduce(Integer::max);
	System.out.println(max);
	}
	
	public static void max2(List<Integer> list) {
		Optional<Integer> max= list.stream().reduce(Math::max);
		System.out.println(max);
		}
	

	// Method Reference -> kendi olusturdugum

	public static int maxBul(int x,int y) {
		return x<y ? y:x;
	}

	public static void max3(List<Integer> list) {
		Optional<Integer> max= list.stream().reduce(Lambda03::maxBul);
		System.out.println(max);
		}


	// Lambda Expression
	
	public static void max4(List<Integer> list) {
		
	int max = list.stream().reduce(Integer.MIN_VALUE, (x,y)-> x<y ? y:x);	
		System.out.println(max);
		
	}
	
	//List'deki elemanlardan 10dan küçük en büyük sayýyý bulunuz.
	
	public static void enBuyuk10danKucuk(List<Integer> list) {
		
		Optional<Integer> max = list.stream().filter(t->t<10).reduce(Integer::max);
		System.out.println(max);
	
	}

	// List'deki elemanlardan tek sayý olanlarýn küplerini küçükten büyüge yazdýrýn
	
	public static void tekKupSirala(List<Integer> list) {
		
		list.stream().filter(t->t%2!=0).map(t-> t*t*t).sorted().forEach(Lambda01::printEl);
	}
	
	// List'deki elemanlardan cift sayý olanlarýn karelerini büyükten küçüge yazdýrýn
	
	public static void ciftKareTersSira(List<Integer> list) {
	list.stream().filter(Lambda01::isCift).map(t->t*t).sorted(Comparator.reverseOrder()).forEach(Lambda01::printEl);
	
	}
	

}
