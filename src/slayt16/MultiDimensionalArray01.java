package slayt16;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		
		/*
		 * A�a��daki multi dimensional array�in i� array�lerindeki son elemanlar�n �arp�m�n� ekrana yazd�r bir program yaz�n�z
          { {1,2,3}, {4,5}, {6} }
		 */

		int arr[][] =  { {1,2,3}, {4,5 }, {6} } ;
	
		int product = 1;
		
	
		
		for (int i = 0 ; i<arr.length; i++  ) {
			for(int j= arr[i].length-1; j>arr[i].length-2; j--) {
				
			product = product*arr[i][j];
					}
					} System.out.println(product);
		
		
		
		
		
		
		
		
		
		
	}

}
