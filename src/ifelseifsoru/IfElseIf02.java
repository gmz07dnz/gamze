package ifelseifsoru;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		
	/*
    Kullan�c�dan bir harf girmesini isteyin.
    Girdi�i k���k harf ise harfin �a� olup olmad���n� kontrol edin. 
    Harf �a� ise ekrana �Ilk k���k harf� yazd�r�n.
    �a� de�il ise ekrana �Ilk k���k harf de�il� yazd�r�n.
    Girdi�i b�y�k harf ise harfin �Z� olup olmad���n� kontrol edin. Harf �Z� ise ekrana �Son b�y�k harf� yazd�r�n.
   �Z� de�il ise ekrana �Son b�y�k harf de�il� yazd�r�n.	
	 */
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("L�tfen bir harf giriniz");
	char ch = scan.next().charAt(0);
	

	
if((ch<='z') && (ch>='a')){
  if (ch=='a') {
	  System.out.println("Ilk k���k harf");
  }else
	  System.out.println("Ilk k���k harf de�il");
} if (ch<='Z' && ch>='A' ) {
	if (ch == 'Z') {
		System.out.println("Son b�y�k harf");
	}else 
		System.out.println("Son b�y�k harf de�il");
}
		
	scan.close();	

	}

}
