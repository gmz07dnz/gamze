package slayt16;

public class MultiDimensionalArray01 {

	public static void main(String[] args) {
		
		/*
		 * Aþaðýdaki multi dimensional array’in iç array’lerindeki son elemanlarýn çarpýmýný ekrana yazdýr bir program yazýnýz
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
