package day15variabletypesandmethodcreations;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*
		 * Kullan�c�dan bir string al�n. Bu String'in i�inde kac tane harf, kac tane rakam ,
		 *  kac tane harf d�s� ve kac tane rakam d�s� karakter oldugunu g�steren prog yaz�n�z.
		 */
		
	Scanner scan = new Scanner (System.in);
	System.out.println("bir string giriniz");
		String s = scan.nextLine().toLowerCase();
		
	int	harfCounter = 0;
	int rakamCounter = 0;
	int digerCounter = 0;
	
	
	int i=0;
	do {
		if (s.charAt(i)>='a' && s.charAt(i)<='z') {
			harfCounter++;
		}else if (s.charAt(i)>='1' && s.charAt(i)<='9')	{
			rakamCounter++;
		}else {
			digerCounter++;
		}
		i++;
	}while(i <s.length());
	System.out.println("Harflerin say�s�: " +harfCounter);	
	System.out.println("Rakamlar�n say�s�: " +rakamCounter );
	System.out.println("Rakam ve harf d�s�ndak�lerin say�s�: " +digerCounter);
	
	scan.close();
		
		
		
		
		
	}

}
