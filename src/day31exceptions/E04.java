package day31exceptions;

public class E04 {

	//ArrayIndexOutOfBoundsException
	
	public static void main(String[] args) {
		
	 int arr[] = {11, 12, 13};
	 
		System.out.println(arr[0]); // 11
		System.out.println(arr[1]); // 12
		
		try {
		System.out.println(arr[3]); // exception
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'de olmayan bir index'i kullanýyorsunuz");
		}
		
	}

}
