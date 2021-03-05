package Slayt18;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		
	
 LocalTime time = LocalTime.now();
 
 System.out.println(time ); // 10:54:32.475
 
 LocalDate date = LocalDate.now();
 System.out.println(date);	// 13-10-2020
	
	
	
 // formatting
 
 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
 
System.out.println( date.format(dtf)); // 13/Eki/2020


 
 DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH.mm");
 
 System.out.println(time.format(dtf1)); // 11.01
 
 
 LocalTime time1 = LocalTime.now(ZoneId.of("Japan"));
 
 System.out.println(time1); // 17:05:15.761
	

	}

}
