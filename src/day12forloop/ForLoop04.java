package day12forloop;

public class ForLoop04 {

	public static void main(String[] args) {
		
		
		/*
		 * 5den 12'ye kadar t�m tamsayilarin toplam�n� hesaplay�p ekrana yazd�ran program� yaz�n�z
		 */
		
		
		int toplam = 0;
		
		for( int i =5 ;i<=12; i++) {
			toplam = toplam + i;
		}System.out.println("Toplam: " + toplam);
		
	}

}
