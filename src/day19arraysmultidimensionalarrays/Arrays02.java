package day19arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		// split() methodu ==> parcalanmak demek,string parcalamak da kullan�l�r. (ac�klama defterde)
		
		String s = "Cal�s bakal�m zor mu";

	String words1[] = s.split(" "); // space'den parcala diyoruz. datalar birden fazla oldugu i�in array'e koyuyoruz.
	
	System.out.println(Arrays.toString(words1)); // [Cal�s, bakal�m, zor, mu]
	
	System.out.println("Kelime say�s�: "+ words1.length); // 4  ==> bir kitab�n kelime say�s�n� bulabiliriz .
	
	
	
	String s2 = "Cal�s  bakal�m zor mu";  //(iki space olursa )
	
    String words2[] = s2.split(" "); // space'den parcala diyoruz. datalar birden fazla oldugu i�in array'e koyuyoruz.
	
	System.out.println(Arrays.toString(words2)); // [Cal�s, , bakal�m, zor, mu] 
	
	
	
	// s stringinin kac karakterden olustugunu bulunuz
	
    String arr[] = s.split("");
    Arrays.toString(arr);
    System.out.println(Arrays.toString(arr));
	System.out.println(arr.length);
	
	System.out.println(s.length()); // direk string'in methoduyla da bulabiliriz
	
	

	// s stringinin bosluk haric kac karakterden olustugunu bulunuz
	
	String words[] = s.replace(" " ,"").split("");
	
	System.out.println(words.length);
	
	
	// s stringinde kac tane a karakteri var
	String words4[] = s.split("");
	System.out.println(Arrays.toString(words4));
	
	int count = 0;
	
	for (int i = 0 ; i<words4.length; i++) {
		if (words4[i].equals("a")) {
			count++;
		      i++;}
		
	}
	System.out.println("Sorulan karakterin say�s�: "+ count);
	
	
	
	}

}
