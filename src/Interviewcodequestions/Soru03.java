package Interviewcodequestions;

public class Soru03 {

	public static void main(String[] args) {

		/*
         * 10 Minutes 
         * Toplamlari verilen bir sayiya esit olan tum ikilileri bulunuz.
		 * Ornegin, {4, 5, 7, 11, 9, 13, 8, 12} array'inde toplamlari 20 olan ikililer
		 * (9, 11), (7, 13) ve (8, 12) dir.
		 */

		
		// 1.yol
		
		int arr[] = {4, 5, 7, 11, 9, 13, 8, 12};
		
		
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1 ; j<arr.length;j++) {
				if(arr[i]+arr[j]==20) {
					System.out.println(arr[i] +"+"+ arr[j]+ "="+ (arr[i]+arr[j]) );
				}
			}
		}
		
	
		System.out.println("=========");
		
		
		
		// 2.yol method oluþturarak	
		
	
	int x = 20;	
	
	bulIkilileri(arr,x);
	
	}

	public static void bulIkilileri(int arr[], int x) {
		for(int i = 0; i<arr.length;i++) {
			for(int j = i+1 ; j<arr.length;j++) {
				if(arr[i]+arr[j]==20) {
					System.out.println(arr[i] +"+"+ arr[j]+ "="+ (arr[i]+arr[j]) );
				}
			}
		}
		
	}
}
