package day03ifstatement;

public class IncrementDecrement {

	public static void main(String[] args) {
		
	//	INCREMENT
  // B�R VAR�ABLE 'IN DEGER�N� TOPLAMA VEYA CARPMA YAPARAK ARTTIRMAKTIR.
		int i1 = 12;
	System.out.println(i1); //12
	
	//1.yol
	i1 = i1 + 5;
	System.out.println(i1); // 12 + 5 =17 
	
	// 2.yol
	i1 += 8;
	System.out.println(i1); // 17 +8 = 25
	
	// 3.yol 
	// sadece 1 att�rmak i�in kullan�labilir. 
		
	i1 ++;
	System.out.println(i1); // 26
	
	
	int i2 = 3;
	System.out.println(i2); // 3
	
	i2 = i2*4;
	System.out.println(i2);// 12
		
	i2 *=4;
	System.out.println(i2); // 48
	
	//DECREMENT
	//bir variable'�n degerini ��karma veya b�lme yaparak azaltmakt�r. 
		
	int k = 12;
	System.out.println(k);//12
	
	k= k -3 ;
	System.out.println(k); // 9
	
	k -= 3;
	System.out.println(k); // 6
	
	k--;
	System.out.println(k);// 5
	
	int m = 12;
	System.out.println(m); // 12
	
	// b�lme i�lemi 1.yol ile yar�ya indirin.
	
	m = m / 2;
	System.out.println(m); // 6
	
	// 2.yol ile tekrar yar�ya indir.
	
	m /= 2;
System.out.println(m); // 3
	
	
		
		
		
		
		
		
	}

}
