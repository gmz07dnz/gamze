package javaofficehours;

public class Day01Carpimtablosu {

	public static void main(String[] args) {
		
		
		/*2 tane variable tanýmlayýnýz : num1=1, num2=1
	     Ardýndan "increment" ý kullanarak çarpým tablosunu yazdýrýn 
	      Note: ++ kullandýðýnýz zaman +1 olarak artýþ yapar
	      Aþaðýdaki çarpým tablosunu yazdýr:
	      
	     num1 = 1;
	     num2 = 1;
	     ========= 
	     1 X 1 = 1  num1 X num2 = num1*num2
	     1 X 2 = 2 
	     1 X 3 = 3 
	     1 X 4 = 4 
	     1 X 5 = 5 
	     1 X 6 = 6 
	     1 X 7 = 7 
	     1 X 8 = 8 
	     1 X 9 = 9 
	     1 X 10 = 10
	     =========   */

		
		
		int num1 = 1;
		int num2 = 1;
		
		
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++)); // önce iþlem yaptý sonra num2'yi bir arttýrdý
		                                                           // 1*1 = 1 num2= 2 oldu
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++)); //num2 ustte 2 olmustu önce iþlem yapacagý için 1*2 =2 sonra num2=3 oldu
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++));
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++));
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++));
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++));
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++));
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++));
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++));
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++));
	
	}

}
