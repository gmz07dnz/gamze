package day14whiledowhileloop;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		  
				/*
				 * 3 basamaklı 4 ve 6 ya tam bölünebilen tamsayıları büyükten küçüge ekrana yazınız
				 * kac tane sayı oldugunu ekrana yazdırın.
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
		System.out.println("4 ve 6'ya bolunen 3 basamaklı "+ counter + " tane sayi vardir");
		
		
		
		
		
		
	}

}
