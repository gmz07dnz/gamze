package ifelsesoru;

import java.util.Scanner;

public class IfElse06 {

 public static void main(String[] args) {

/*
Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n 
e�er �� kenar uzunlu�u birbirine e�it ise ekrana
�E�kenar ��gen� yazd�r�n. 
Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n.	
 */
	
	
Scanner scan = new Scanner(System.in);

System.out.println("��genin �� kenar uzunlu�unu giriniz");
int kenar1 = scan.nextInt();
int kenar2= scan.nextInt();
int kenar3= scan.nextInt();

if ((kenar1 == kenar2) && (kenar2 == kenar3) && (kenar1 == kenar3)) {
	
	System.out.println("E�kenar ��gen");
}
else {
	System.out.println("E�kenar Degil");
}
	scan.close();
 }	
	
}
