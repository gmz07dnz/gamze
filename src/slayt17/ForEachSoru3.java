package slayt17;

public class ForEachSoru3 {

	public static void main(String[] args) {

		/*
		 * Ýki String array oluþturunuz ve bu array’lerdeki ortak elemanlarý For-each
		 * loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz. Ortak eleman yoksa ekrana
		 * “Ortak eleman yok” yazdýrýnýz
		 */

		String arr1[] = { "ayse","ahmet"};
		
		String arr2[] = {"ali", "kemal","gamze", "deniz"};
		
		int count = 0;
		
		for (String w: arr1) {
			for(String k:arr2) {
			if (w.equalsIgnoreCase(k)) {
				System.out.println("ortak eleman var");
				count++;
				}		
		}
			}if (count==0) {
					System.out.println("ortak eleman yok");
			}
		
		
		
	}

}
