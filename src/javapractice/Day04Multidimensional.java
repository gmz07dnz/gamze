package javapractice;

public class Day04Multidimensional {

	public static void main(String[] args) {
		
		/*
		 * SORU 5) Girilen Multidimensional arraydeki cift sayilari toplayan bir method yaziniz. 
		 
		 * INPUT : {{1,3,6},{2,8},{5,7,9,10}} 
		 * OUTPUT : Arraydeki cift sayilarin toplami : 26
		 */


	
		 int arr[][]= {{1,3,6},{2,8},{5,7,9,10}};
	
		 toplamCiftSayi(arr);
	
	}

	
	public static void toplamCiftSayi(int array[][]) {
		int sum = 0;
		
		for (int[] w: array) {
			for (int k : w) {
				
			if(k%2 == 0) {
			 sum = sum+k;	
			}
				}
		}
		System.out.println("Arraydeki cift sayilarin toplami :"+ sum);
		
		
	}
	
	
	
	
	
	
	
	
}
