package day08ternary;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz");
		int s = scan.nextInt();
		
		if (s>9) {System.out.println("Rakam de�il");} else {System.out.println("Rakam");}
		
		String result = s >9 ? "Rakam degil" : "Rakam" ;

		/* bu kod if else 'in yapt���n�n ayn�s�n� yapar.
		  condition true ise ilk k�sm� , false ise ikinci k�sm� yazar.
		  Bu method bir�ey �retiyor.her seferinde bir�ey return eder. 
		  Geleni memory'e koymak lz�m yoksa havada kal�r.Variable atamak gerek
        */
		
		scan.close();
		
		
		System.out.println(result);


	      //   s>99 && s<1000 ? "3 basamakli" : s;

		      
		 // condition true ise String return ediyor. False ise int �retiyor .Memory'e koymam laz�m.Ama variable 
		 // ne olacak??? dolay�s�yla farkl� data type'larda direk System.out.println(); i�ine yazar�z

		      
		   System.out.println(s>99 && s<1000 ? "3 basamakli" : s);	
		
		
		
	}

}
