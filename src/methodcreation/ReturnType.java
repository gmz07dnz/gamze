package methodcreation;

public class ReturnType {

	public static void main(String[] args) {
	
		System.out.println(add(2,3));
		
		int a = add(2,3) + 5;
		System.out.println(a);
	
	
	}

	public static int add(int a,int b ) {
		int sum = a+b;
	
	return sum;  // sum uretir .yazdýrma iþlemini yapmayýz burda cunku konuabilir ama koymayýz iþi birsey uretmek
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
