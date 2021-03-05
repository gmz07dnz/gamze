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
		K�pBirFazlaTekFunctional(list);
		System.out.println();
		kareKokCiftFunctional(list);
		System.out.println();
		maxElFunctional(list);

	}

	
	// �ift say� olan elemanlar�n karesini ayn� sat�rda aralar�na bosluk b�rakarak yaz�n�z
	
	public static void kareCiftFunctional(List<Integer> list) {
		
		list.stream().filter(Lambda01 :: isCift ).map(t-> t*t).forEach(Lambda01 :: printEl); // map degeri update edince kullan�l�r
	}
	
	
	// Tek say� olan elemanlar�n k�p�n�n 1 fazlas� ayn� sat�rda aralar�na bosluk b�rakarak yaz�n�z
	
	public static void K�pBirFazlaTekFunctional(List<Integer> list) {
		
		list.stream().filter(t-> t%2!=0).map(t-> (t*t*t+1)).forEach(Lambda01 :: printEl);
	}
	
	
	// �ift say� olan elemanlar�n kare k�k�n�  console'a yazd�r�n�z.
	
	public static void kareKokCiftFunctional(List<Integer> list) {
		
		list.stream().filter(Lambda01 :: isCift).map(Math :: sqrt).forEach(System.out::println);
	}
	
	// en b�y�k eleman� console'a yazd�r�n
	
	public static void maxElFunctional(List<Integer> list) {
		
		Optional<Integer> max =list.stream().reduce(Math :: max);
		System.out.println(max);
	}
	
	
	
	
	
}
