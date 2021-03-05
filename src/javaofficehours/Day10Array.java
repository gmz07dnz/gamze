package javaofficehours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day10Array {

	public static void main(String[] args) {

		//ArrayList i Array e ceviren java kodu yaziniz.
        //"Python", "JAVA", "PHP",  "Perl", "C#", "C++"

		List<String> list = new ArrayList<>();
		list.add("Python");
		list.add("JAVA");
		list.add("PHP");
		list.add("Perl");
		list.add("C#");
		list.add("C++");
	//	System.out.println(list);
		
		String arr[] = new String[list.size()];
		
	
		for (int i =0; i<list.size();i++ ) {
			arr[i]= list.get(i);
		}
		
		System.out.println(Arrays.toString(arr));
	
	
		Object[] arr1 = list.toArray();
		System.out.println(Arrays.toString(arr1));
		
		list.toArray(arr);
		System.out.println(Arrays.toString(arr));
		
		
	
	
	}

}
