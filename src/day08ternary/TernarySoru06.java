package day08ternary;

import java.util.Scanner;

public class TernarySoru06 {

	public static void main(String[] args) {
		
		
  /*
  Kullan�c�dan bir tamsay� girmesini isteyin, tamsay� �ift ise ekrana ��ift� tek ise ekrana �Tek�
  yazd�r�n	
 */
		
	Scanner scan = new Scanner(System.in);
	System.out.println("L�tfen bir tam say� giriniz.");
	int s = scan.nextInt();
	
	// if ile ��zelim

	
	if(s%2==0) {
		System.out.println("�ift");
	}else {
		System.out.println("tek");
	}
		
	// ternary ile c�zelim
	
String result = s%2==0 ? "�ift" : "Tek";
System.out.println(result);
	
scan.close();

	
	
	}

}
