package javaofficehours;

public class Day08Arrays02 {

	public static void main(String[] args) {
		
		//Array elemanlarýnýn toplam degerini hesaplayan java kodu yazalim
		//	1,2,3,4,5,6,7,8,9,10
		
		
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		int sum = 0;
		
		for (int w: arr ) {
			sum+=w;
		}
		System.out.println("Toplam deger: "+ sum);

	}

}
