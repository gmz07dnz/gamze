package day14whiledowhileloop;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		  
				/*
				 * 3 basamakl� 4 ve 6 ya tam b�l�nebilen tamsay�lar� b�y�kten k���ge ekrana yaz�n�z
				 * kac tane say� oldugunu ekrana yazd�r�n.
				 */

		
		
	int i = 999;
	int counter = 0;     // flag
	
	while (i>99) {
		if (i%4 == 0 && i%6== 0) {
		System.out.print(i+ " ");
		counter++;
		} 
		i--;
		}
	System.out.println();
		System.out.println("4 ve 6'ya bolunen 3 basamakl� "+ counter + " tane sayi vardir");
		
		
		
		
		
		
	}

}
