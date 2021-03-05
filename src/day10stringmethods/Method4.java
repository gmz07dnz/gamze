package day10stringmethods;

public class Method4 {

	public static void main(String[] args) {

		/*
		 * endsWith(suffix) ==> String ... ile biter . Boolean return eder. tek ya da
		 * coklu karakter yaz�labilir parantez i�ine �ift t�rnak i�inde . ��nk� sadece
		 * String ile cal���r. char gibi ' ' aras�na koyarsak tek karakteri hata verir.
		 */

		String s1 = "Testi al kendini gor";

		// s1.endsWith(suffix)

		System.out.println(s1.endsWith("r")); // true

		System.out.println(s1.endsWith("gor")); // true ==> coklu karakter de olabilir

		System.out.println(s1.endsWith("")); // true ==> r ile �ift t�rnak aras�nda hi�birsey var

		System.out.println(s1.endsWith("kendini gor")); // true

		System.out.println(s1.endsWith("Testi al kendini gor")); // true

	}

}
