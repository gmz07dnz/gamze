package slayt16;

public class MultiDimensionalCarpým {

	public static void main(String[] args) {
		
		/*
		 *  Aþaðýdaki multi dimensional array’in tum elemanlarýnýn çarpýmýný ekrana yazdýran bir program yazýnýz.
               { {1,2,3}, {4,5,6} } 
		 */

	
	
	
	int arr[][] =  { {1,2,3}, {4,5,6} } ;
	
	int product = 1;
	
	// for-Each 
	
	for (int[] w: arr) {
		for ( int i: w) {
			
			product = product*i;
		}
	}
	System.out.println(product);
	product = 1;
	
	
	// for Loop
	
	for ( int i = 0; i<arr.length; i++) {
		for ( int j= 0; j<arr[i].length; j++) {
			product = product*arr[i][j];
			
		}
	}
	
	System.out.println(product);
	
	
	}

}
