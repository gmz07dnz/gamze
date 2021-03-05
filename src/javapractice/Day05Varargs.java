package javapractice;

public class Day05Varargs {

	public static void main(String[] args) {
		
		
		/*
		 * Parametre olarak kac integer girilirse girilsin, toplamlarýný veren bir method yazýnýz
		 * 
		 * Method ismi toplama(?)
		 * 
		 * INPUT : toplama(2,3) OUTPUT: 5
		 * INPUT : toplama(2,3,4) OUTPUT: 9
		 * INPUT : toplama(2,3,4,5) OUTPUT: 14
		 */

		toplama(2,3);
		toplama(2,3,4);
	    toplama(2,3,4,5);
		
		
	}

	
	
	public static void toplama(int ... a) {
  
		int sum =0;
		
       for (int w: a) {
    	   sum = sum+w;
       }System.out.println("Girilen parametrelerin toplamý :" +sum);
	}
	
	
}
