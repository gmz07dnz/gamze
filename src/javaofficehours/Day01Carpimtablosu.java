package javaofficehours;

public class Day01Carpimtablosu {

	public static void main(String[] args) {
		
		
		/*2 tane variable tan�mlay�n�z : num1=1, num2=1
	     Ard�ndan "increment" � kullanarak �arp�m tablosunu yazd�r�n 
	      Note: ++ kulland���n�z zaman +1 olarak art�� yapar
	      A�a��daki �arp�m tablosunu yazd�r:
	      
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
		
		
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++)); // �nce i�lem yapt� sonra num2'yi bir artt�rd�
		                                                           // 1*1 = 1 num2= 2 oldu
		System.out.println(num1 +"X"+ num2+ "= " + (num1*num2++)); //num2 ustte 2 olmustu �nce i�lem yapacag� i�in 1*2 =2 sonra num2=3 oldu
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
