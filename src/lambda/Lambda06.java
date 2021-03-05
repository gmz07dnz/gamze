package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda06 {

	public static void main(String[] args) {

		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
		Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
		Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
		Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
		
		List<Course> courseList = new ArrayList<>();
		
		courseList.add(courseTurkishDay);
		courseList.add(courseTurkishNight);
		courseList.add(courseEnglishDay);
		courseList.add(courseEnglishNight);

       System.out.println(avgScoreByk92(courseList));
		System.out.println(ogrenciSayi120DAz(courseList));
		System.out.println(sezonSpring(courseList));
		System.out.println(ogrKursRev(courseList));
		System.out.println(avgScoreIlkUc(courseList));
		System.out.println(ogrSayisiIkinciAz(courseList));
	
	}

	// Average score'larin tamaminin 92 den buyuk olup olmadigini kontrol eden bir program yaziniz

	public static boolean avgScoreByk92(List<Course> courseList) {
		
	return	courseList.stream().allMatch(t->t.getAverageScore()>92); // t => obje 
	}
	
	
	// Ogrenci sayilarinin hicbirinin 120'den az olmadigini kontrol eden bir program yaziniz.
	
	public static boolean ogrenciSayi120DAz(List<Course> courseList) {
		
		return courseList.stream().noneMatch(t->t.getNumberOfStudents()<120);
	}
	
	//Kurs sezonlarinin herhangi birinin "Spring" olup olmadigin kontrol eden program yaziniz
	
	public static boolean sezonSpring(List<Course> courseList) {
		return courseList.stream().anyMatch(t->t.getSeason().equalsIgnoreCase("Spring"));
	}
	
	
	// Kurslari ogrenci sayilarina gore buyukten kucuge siralayiniz.
	
	public static List<Course> ogrKursRev(List<Course> courseList) { // collect()=> methodu ile elemanlarý collection içine koyabiliriz
		
		return courseList.
				stream().
				sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).
				collect(Collectors.toList());
	}
	
	
	//Kurslari average score'larina gore buyukten kucuge siralayiniz ve ilk 3'unu gosteriniz
	
	public static List<Course> avgScoreIlkUc(List<Course> courseList) {
		
	return	courseList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).limit(3).collect(Collectors.toList());
	}
	
	
	//Kurslardan ogrenci sayisi en az olan ikinci kursu ekrana yazdiriniz
	
	public static List<Course> ogrSayisiIkinciAz(List<Course> courseList) {
		
	return	courseList.stream().sorted(Comparator.comparing(Course::getNumberOfStudents)).limit(2).skip(1).collect(Collectors.toList());
	}
	
}
