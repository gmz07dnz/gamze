package day32exception;

public class E03 {

	
	/*
	 1) e.printStackTrace(); methodu olusan exception'ýn tüm detaylarýný verir. 
	 Console'da detaylý bir hata mesajý görmek isterseniz e.printStackTrace(); methodunu kullanýnýz.
	 */
	public static void main(String[] args) {
		
		int arr[] = {11,12,13,14};
		
		try {
		System.out.println(arr[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
