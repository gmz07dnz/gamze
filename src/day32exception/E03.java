package day32exception;

public class E03 {

	
	/*
	 1) e.printStackTrace(); methodu olusan exception'�n t�m detaylar�n� verir. 
	 Console'da detayl� bir hata mesaj� g�rmek isterseniz e.printStackTrace(); methodunu kullan�n�z.
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
