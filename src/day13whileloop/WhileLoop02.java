package day13whileloop;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {

		/*
		 Kullanicidan bir sayi aliniz bu sayi icin carpim tablosunu olusturunuz
		 Kullanici 13 versin
		 13x1=13   13x2=26   13x3=39  ...   13x10=130
		*/
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("bir tam say� giriniz");
		
	int s = scan.nextInt();
	
	int i = 1;
    while (i<11) {
    	System.out.println(s+ "x" +i+ "= " + (s*i));
    	i++;
    }
		
		
	scan.close();	
		
			}

}
