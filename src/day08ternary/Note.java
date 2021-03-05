package day08ternary;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz");
		int s = scan.nextInt();
		
		if (s>9) {System.out.println("Rakam deðil");} else {System.out.println("Rakam");}
		
		String result = s >9 ? "Rakam degil" : "Rakam" ;

		/* bu kod if else 'in yaptýðýnýn aynýsýný yapar.
		  condition true ise ilk kýsmý , false ise ikinci kýsmý yazar.
		  Bu method birþey üretiyor.her seferinde birþey return eder. 
		  Geleni memory'e koymak lzým yoksa havada kalýr.Variable atamak gerek
        */
		
		scan.close();
		
		
		System.out.println(result);


	      //   s>99 && s<1000 ? "3 basamakli" : s;

		      
		 // condition true ise String return ediyor. False ise int üretiyor .Memory'e koymam lazým.Ama variable 
		 // ne olacak??? dolayýsýyla farklý data type'larda direk System.out.println(); içine yazarýz

		      
		   System.out.println(s>99 && s<1000 ? "3 basamakli" : s);	
		
		
		
	}

}
