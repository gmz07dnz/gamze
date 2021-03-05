package day18staticblockarrays;

public class Test1 {

	int x = 10;
	
	public static void main(String[] args) {
		// class ismiyle static variable 'a ulasýlabilir. bu yüzden CTE verir
//	 System.out.println(Test1.x);	 
	}

	static {
		int x = 20;  // local sadce burda gecerli
		System.out.println(x+ " "); // 20
	}
	
	
	
	
	
}
