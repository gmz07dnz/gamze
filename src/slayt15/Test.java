package slayt15;

public class Test {

	public static void main(String[] args) {
		int arr[] = new int[2];  // [ 0, 0]
   
		System.out.println(arr[0]); // 0
		System.out.println(arr[1]); // 0
	
		int arr1[] = {1, 2, 3};
		int arr2[] = {1, 2, 3};
	
	   if (arr1 == arr2) {
		   System.out.println("same");
	   }else {
		   System.out.println("not same");
	   }  
	// not same adres depolar deger degil oyuzden not same
	
	
	   String[] cities = { "london", "paris", "rome", "New york"};
	   System.out.println(cities[cities.length-2]); // rome
	   
	}

}
