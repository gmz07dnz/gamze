package methodcreation;

public class ReturnType {

	public static void main(String[] args) {
	
		System.out.println(add(2,3));
		
		int a = add(2,3) + 5;
		System.out.println(a);
	
	
	}

	public static int add(int a,int b ) {
		int sum = a+b;
	
	return sum;  // sum uretir .yazd�rma i�lemini yapmay�z burda cunku konuabilir ama koymay�z i�i birsey uretmek
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
