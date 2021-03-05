package javaofficehours;

import java.util.Arrays;
import java.util.Scanner;

public class Day08Array04 {

	public static void main(String[] args) {
		
		//Kullanicadan 5 tane sayi alalim bu sayilari bir array icerisine atalim.
				// içlerindeki cift sayilarin sayisini bulacagiz.


		Scanner scan= new Scanner(System.in);
		System.out.println("Array olusturmak için 5 tane sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		
		int arr[] = {num1,num2,num3,num4,num5};
		System.out.println(Arrays.toString(arr));
		
		int count = 0;
		
		for (int w: arr) {
			if(w%2 == 0) {
				count++;
			}
		}
		System.out.println("Array'de "+ count+ " adet çift sayi vardýr");
		
		scan.close();
	}

}
