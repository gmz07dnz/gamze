package slayt16;

public class Soru02 {

	public static void main(String[] args) {
		
		// prog calýstýktan sonra count'ýn degeri 
		
		

		int[] x1 = { 0, 1, 2, 3};

		int[] x2 = { 1, 2, 2, 3};

        int i1 = 0;
        int i2 = 0;
        int count = 0;
        
        while ((i1<x1.length) && (i2<x1.length ) ) {
        	if (x1[i1] == x2[i2]) {
        		count++;
        		i2++;
        		}else if (x1[i1] < x2[i2]) {
        			i1++;
        	}else {
        		//x1[i1] > x2[i2]
        	i2++;
        	}
        	System.out.println(count); //4
        }
        
        
        
        
	}

}
