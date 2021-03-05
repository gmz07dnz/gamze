package day32exception;

public class E04 {

	public static void main(String[] args) {
		
		try {
			hata();
			} catch(IllegalArgumentException e) {
				
				System.out.println(e); // java.lang.IllegalArgumentException: gecerli data giriniz
				System.out.println(e.getMessage());// gecerli data giriniz
				e.printStackTrace();// java.lang.IllegalArgumentException: gecerli data giriniz 
			                        //	at day32exception.E04.hata(E04.java:20)
			                        //	at day32exception.E04.main(E04.java:8)
			}
		}

		
		
		public static void hata() {
			throw new IllegalArgumentException("gecerli data giriniz ");
		}
	}