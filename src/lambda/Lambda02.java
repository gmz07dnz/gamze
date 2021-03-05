package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lambda02 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(13);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(4);
		list.add(12);
		list.add(15);
		
		kareCiftFunctional(list);
	
		System.out.println();
		KüpBirFazlaTekFunctional(list);
		System.out.println();
		kareKokCiftFunctional(list);
		System.out.println();
		maxElFunctional(list);

	}

	
	// Çift sayý olan elemanlarýn karesini ayný satýrda aralarýna bosluk býrakarak yazýnýz
	
	public static void kareCiftFunctional(List<Integer> list) {
		
		list.stream().filter(Lambda01 :: isCift ).map(t-> t*t).forEach(Lambda01 :: printEl); // map degeri update edince kullanýlýr
	}
	
	
	// Tek sayý olan elemanlarýn küpünün 1 fazlasý ayný satýrda aralarýna bosluk býrakarak yazýnýz
	
	public static void KüpBirFazlaTekFunctional(List<Integer> list) {
		
		list.stream().filter(t-> t%2!=0).map(t-> (t*t*t+1)).forEach(Lambda01 :: printEl);
	}
	
	
	// çift sayý olan elemanlarýn kare kökünü  console'a yazdýrýnýz.
	
	public static void kareKokCiftFunctional(List<Integer> list) {
		
		list.stream().filter(Lambda01 :: isCift).map(Math :: sqrt).forEach(System.out::println);
	}
	
	// en büyük elemaný console'a yazdýrýn
	
	public static void maxElFunctional(List<Integer> list) {
		
		Optional<Integer> max =list.stream().reduce(Math :: max);
		System.out.println(max);
	}
	
	
	
	
	
}
