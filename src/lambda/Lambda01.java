package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
	
	/*
	 1) Lambda "Functional Programming"dir. Method kullanma programlama dili demek.Method bulup kullanmakt�r.
	   "Functional Programming" de "nas�l yapar�m?" degil "ne yapar�m?" dusunulur.
	
	 2) "Structured Programming"de "ne yapar�m?" dan cok "nas�l yapar�m?" dusunulur.
	 
	 3)  "Functional Programming" h�z olarak,kod k�sal�g�,kod okunabilirli�i ve hatas�z kod yazma a��lar�ndan cok faydal�d�r.
	 
	 4) Lambda sadece Collections'larda(List,Queue ve Set)  ve array'lerde kullan�labilir.
	 */

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
		
			printElStructured(list);
			System.out.println();
			printElFunctional1(list);
			System.out.println();
			printElFunctional2(list);
			System.out.println();
			printElFunctional3(list);

			System.out.println();
			printCiftElStructured(list);
			System.out.println();
			printCiftElFunctional1(list);
			System.out.println();
			printCiftElFunctional2(list);
			System.out.println();
			PrintKucukOnTekFunctional(list);
			System.out.println();
		    kucukOnVeyaCiftFunctional(list);
	}

	// "Structured Programming" ile List elemanlar�n�n tamam�n� ayn� sat�rda ,aralar�na bo�luk b�rakarak yazd�r�n�z.
	public static void printElStructured(List<Integer> list) {
		for (Integer w : list) {
			System.out.print(w + " ");
		}

       }
	
	
	// "Functional Programming" ile List elemanlar�n�n tamam�n� ayn� sat�rda ,aralar�na bo�luk b�rakarak yazd�r�n�z.
	
	// Lambda expression 
	
	public static void printElFunctional1(List<Integer> list) {
		
		list.stream().forEach(t-> System.out.print(t+ " ")); 
		
	}
	
	/*
	 * Stream selale demektir. Elemanlar� selale gibi yukardan asagi dogru dizer. Java yatay datalarda kullanmak i�in daha az method veriyor.
	 * Dikey datalarda daha cok method verir.Bazi methodlar sadece yataylar i�in kullan�l�r.O zmn stream kullanmay�z.
	 */
	

    // Method reference -> methoda y�nlendiririz ==> kendi olusturdugum method ile ==> Class ismi :: Method ismi
	
	public static void printEl(int t) {
		System.out.print(t + " ");
	}
	
	public static void printElFunctional2(List<Integer> list) {
		
		list.stream().forEach((Lambda01 :: printEl));
		
	}
	

	// Method reference -> java'n�n olusturdugu methodlar ile
	


	public static void printElFunctional3(List<Integer> list) {
		
		list.stream().forEach(System.out::print);
		
	}

	// "Structured Programming" ile cift say� olan List elemanlar�n�n tamam�n� ayn� sat�rda ,aralar�na bo�luk b�rakarak yazd�r�n�z.

	public static void printCiftElStructured(List<Integer> list) {
	for (Integer w: list) {
		if(w%2==0) {
			System.out.print(w + " ");
		}
	}

	}


	// Lambda expression 
	
	public static void printCiftElFunctional1(List<Integer> list) {
		
	list.stream().filter(t -> t%2 ==0).forEach(t -> System.out.print(t + " "));// herbir eleman� al ciftleri filtrele ve herbirini yazd�r 
	}
	


	// Method reference -> kendi olusturdugum
	
	public static boolean isCift(int t) {
		return t%2==0;
		}

	public static void printCiftElFunctional2(List<Integer> list) {
		list.stream().filter(Lambda01 :: isCift).forEach(Lambda01 :: printEl);
	}
		

	 // "Functional Programming" ile 10'dan k���k ve tek say� olan list elemanlar�n�n tamam�n� 
	// ayn� sat�rda aralar�na bo�luk b�rakarak yaz�n�z
	
	public static void PrintKucukOnTekFunctional(List<Integer> list) {
		
		list.stream().filter(t -> t%2!=0 && t<10).forEach(t -> System.out.print(t +" "));
		}
	
	 // "Functional Programming" ile 10'dan k���k veya cift say� olan list elemanlar�n�n tamam�n� 
		// ayn� sat�rda aralar�na bo�luk b�rakarak yaz�n�z
	
	
	public static void kucukOnVeyaCiftFunctional(List<Integer> list) {
		list.stream().filter(t-> t%2==0 || t<10).forEach(Lambda01 :: printEl);
		
	}
	
	
	
	
	

}
