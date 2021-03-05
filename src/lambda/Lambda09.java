package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda09 {

	public static void main(String[] args) throws IOException {
		
		//FileForLambda dosyasini okuyunuz.(Console'a yazdiriniz)
		
		Files.lines(Paths.get("src/lambda/FileForLambda")).forEach(System.out::println);

		
		//FileForLambda dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle yazdiriniz)
		
		Files.lines(Paths.get("src/lambda/FileForLambda")).map(String::toUpperCase).forEach(System.out::println);
		
		
		
		//FileForLambda dosyasindaki ilk satiri kucuk harflerle okuyunuz.(Console'a kucuk harflerle yazdiriniz)
		//1.yol
		Files.lines(Paths.get("src/lambda/FileForLambda")).limit(1).map(String::toLowerCase).forEach(System.out::println);

		// 2.yol
		
		System.out.println(Files.lines(Paths.get("src/lambda/FileForLambda")).map(String::toLowerCase).findFirst());
		
		
		//FileForLambda dosyasinda "Lambda" kelimesinin kac satirda gectigini ekrana yazdiran programi yaziniz
		
		System.out.println(Files.lines(Paths.get("src/lambda/FileForLambda")).filter(t-> t.contains("Lambda")).count());
	
		
		
		//FileForLambda dosyasinda tum farkli kelimeleri bir listin icinde ekrana yazdiriniz.
		
		System.out.println(Files.
				lines(Paths.get("src/lambda/FileForLambda")).
				map(t-> t.split(" ")).
				flatMap(Arrays::stream).
				distinct().
				collect(Collectors.toList()));
		
		
		//FileForLambda dosyasindaki tum kelimeleri natural order olarak ekrana yazdiriniz
		
		Files.
		    lines(Paths.get("src/lambda/FileForLambda")).
		    map(t-> t.split(" ")).
		    flatMap(Arrays::stream).
		    sorted().
		    forEach(System.out::println);
		
		// FileForLambda dosyasinda "Lambda" kelimesinin kac kere gecti�ini b�y�k harf k���k harf �nemsemeden ekrana yazd�ran program� yaz�n
		
		
		System.out.println(Files.
                lines(Paths.get("src/lambda/FileForLambda")).
                map(t->t.toLowerCase().split(" ")). 
                flatMap(Arrays::stream).
                filter(t->t.equals("lambda")).
                count());
	
	
		//FileForLambda dosyasinda icinde "m" harfi gecen kelimelerin sayisini ekrana yazdiran programi yaziniz
		
		
		System.out.println(
				Files.
                     lines(Paths.get("src/lambda/FileForLambda")).
                      map(t->t.split(" ")).
                     flatMap(Arrays::stream).
                     filter(t->t.contains("m")).
                     count());
		
		
		//FileForLambda dosyasinda icinde "m" harfi gecen kelimeleri ekrana yazdiran programi yaziniz  
	
				Files.
                     lines(Paths.get("src/lambda/FileForLambda")).
                      map(t->t.split(" ")).
                     flatMap(Arrays::stream).
                     filter(t->t.contains("m")).
                     forEach(System.out::println);
	
	  //FileForLambda dosyasinda kac harf kullanildigini gosteren programi yaziniz
			System.out.println(Files.
					              lines(Paths.get("src/lambda/FileForLambda")).
					              map(t->t.replaceAll("\\W", "").
					              split("")).
					              flatMap(Arrays::stream).
					              count());	
	
			
	
			//FileForLambda dosyasinda kac farkli kelime kullanildigini gosteren programi yaziniz 
			
			System.out.println(Files.
					
					               lines(Paths.get("src/lambda/FileForLambda")).
					               map(t->t.replaceAll("[.!?,\\-]", "").
					               split(" ")).
					               flatMap(Arrays::stream).
					               distinct().
					               count());
			
			//FileForLambda dosyasindaki farkli kelimeleri ekrana yazdiran programi yaziniz
			
			Files.
            lines(Paths.get("src/lambda/FileForLambda")).
            map(t->t.replaceAll("[.!?,\\-]", "").
            split(" ")).
            flatMap(Arrays::stream).
            distinct().
            forEach(System.out::println);
			
	
			
			
			
	}

}
