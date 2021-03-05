package lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
	
	/*
	 1) Lambda "Functional Programming"dir. Method kullanma programlama dili demek.Method bulup kullanmaktýr.
	   "Functional Programming" de "nasýl yaparým?" degil "ne yaparým?" dusunulur.
	
	 2) "Structured Programming"de "ne yaparým?" dan cok "nasýl yaparým?" dusunulur.
	 
	 3)  "Functional Programming" hýz olarak,kod kýsalýgý,kod okunabilirliði ve hatasýz kod yazma açýlarýndan cok faydalýdýr.
	 
	 4) Lambda sadece Collections'larda(List,Queue ve Set)  ve array'lerde kullanýlabilir.
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

	// "Structured Programming" ile List elemanlarýnýn tamamýný ayný satýrda ,aralarýna boþluk býrakarak yazdýrýnýz.
	public static void printElStructured(List<Integer> list) {
		for (Integer w : list) {
			System.out.print(w + " ");
		}

       }
	
	
	// "Functional Programming" ile List elemanlarýnýn tamamýný ayný satýrda ,aralarýna boþluk býrakarak yazdýrýnýz.
	
	// Lambda expression 
	
	public static void printElFunctional1(List<Integer> list) {
		
		list.stream().forEach(t-> System.out.print(t+ " ")); 
		
	}
	
	/*
	 * Stream selale demektir. Elemanlarý selale gibi yukardan asagi dogru dizer. Java yatay datalarda kullanmak için daha az method veriyor.
	 * Dikey datalarda daha cok method verir.Bazi methodlar sadece yataylar için kullanýlýr.O zmn stream kullanmayýz.
	 */
	

    // Method reference -> methoda yönlendiririz ==> kendi olusturdugum method ile ==> Class ismi :: Method ismi
	
	public static void printEl(int t) {
		System.out.print(t + " ");
	}
	
	public static void printElFunctional2(List<Integer> list) {
		
		list.stream().forEach((Lambda01 :: printEl));
		
	}
	

	// Method reference -> java'nýn olusturdugu methodlar ile
	


	public static void printElFunctional3(List<Integer> list) {
		
		list.stream().forEach(System.out::print);
		
	}

	// "Structured Programming" ile cift sayý olan List elemanlarýnýn tamamýný ayný satýrda ,aralarýna boþluk býrakarak yazdýrýnýz.

	public static void printCiftElStructured(List<Integer> list) {
	for (Integer w: list) {
		if(w%2==0) {
			System.out.print(w + " ");
		}
	}

	}


	// Lambda expression 
	
	public static void printCiftElFunctional1(List<Integer> list) {
		
	list.stream().filter(t -> t%2 ==0).forEach(t -> System.out.print(t + " "));// herbir elemaný al ciftleri filtrele ve herbirini yazdýr 
	}
	


	// Method reference -> kendi olusturdugum
	
	public static boolean isCift(int t) {
		return t%2==0;
		}

	public static void printCiftElFunctional2(List<Integer> list) {
		list.stream().filter(Lambda01 :: isCift).forEach(Lambda01 :: printEl);
	}
		

	 // "Functional Programming" ile 10'dan küçük ve tek sayý olan list elemanlarýnýn tamamýný 
	// ayný satýrda aralarýna boþluk býrakarak yazýnýz
	
	public static void PrintKucukOnTekFunctional(List<Integer> list) {
		
		list.stream().filter(t -> t%2!=0 && t<10).forEach(t -> System.out.print(t +" "));
		}
	
	 // "Functional Programming" ile 10'dan küçük veya cift sayý olan list elemanlarýnýn tamamýný 
		// ayný satýrda aralarýna boþluk býrakarak yazýnýz
	
	
	public static void kucukOnVeyaCiftFunctional(List<Integer> list) {
		list.stream().filter(t-> t%2==0 || t<10).forEach(Lambda01 :: printEl);
		
	}
	
	
	
	
	

}
