package javaofficehours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day09Array01 {

	public static void main(String[] args) {
		
		//String array icerisindeki 4 harfli kelimeleri return eden bir method yaziniz
        //["sali","carsamba","cuma","ctesi","pzar"]
		
		

		String arr[] = {"sali","carsamba","cuma","ctesi","pzar"};
		
		System.out.println(Arrays.toString(dortHarfli(arr)));
		
	}

	public static String[] dortHarfli(String arr[]) {
		
		List<String> list = new ArrayList<>();
		
		for (String w: arr) {
		if (w.length() == 4) {
			list.add(w);
		}
		
		}
		
		
		String arr1[] = new String[list.size()];
				list.toArray(arr1);
		return arr1;
		
		
	}
}
