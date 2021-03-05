package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Lambda07 {

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
		
		System.out.println(avg93FazlaOgrSayiTop1(courseList));
		System.out.println(avg93FazlaOgrSayiTop2(courseList));
        System.out.println(ogr140FazlaAvgScore(courseList));
		System.out.println(dayKursSayi(courseList));
		System.out.println(maxAvgOgrSayi130Fazla(courseList));
		System.out.println(minAvgOgrSayi150Az(courseList));
	}
	
	
	
	//Average Score'lari 93 den fazla olan kurslarin ogrenci sayilari toplamini bulunuz.
	
	public static int avg93FazlaOgrSayiTop1(List<Course> courseList) {
		
	return courseList.stream().filter(t-> t.getAverageScore()>93).map(t->t.getNumberOfStudents()).reduce(0,Integer::sum);
	
	}

	public static int avg93FazlaOgrSayiTop2(List<Course> courseList) {
		
	return courseList.stream().filter(t-> t.getAverageScore()>93).mapToInt(t->t.getNumberOfStudents()).sum();
	}
	
	//Ogrenci sayi'lari 140 dan fazla olan kurslarin average score'unu bulunuz.
	
	public static OptionalDouble ogr140FazlaAvgScore(List<Course> courseList) {
		
	return	courseList.stream().filter(t->t.getNumberOfStudents()>140).mapToDouble(t->t.getAverageScore()).average();
	}
	
	
	//Day time kurslarinin sayisini bulan bir program yaziniz.
	
	
	public static long dayKursSayi(List<Course> courseList) {
		
		return courseList.stream().filter(t-> t.getCourseName().contains("Day")).count();
	}
	
	
	//Ogrenci sayi'lari 130 dan fazla olan kurslarin maximum average score'unu bulunuz.

	
	public static OptionalDouble maxAvgOgrSayi130Fazla(List<Course> courseList) {
		
		return courseList.stream().filter(t->t.getNumberOfStudents()>130).mapToDouble(Course:: getAverageScore).max();
	}
	
	
	//Ogrenci sayi'lari 150 den az olan kurslarin minimum average score'unu bulunuz.
	
	public static OptionalDouble minAvgOgrSayi150Az(List<Course> courseList) {
		
		return courseList.stream().filter(t->t.getNumberOfStudents()<150).mapToDouble(Course::getAverageScore ).min();
	}
	
	
	
	
	
	
	
	
	
	
	
}
