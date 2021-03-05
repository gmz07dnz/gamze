package day37collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	
	/*
	 * 1) Elemanlar en sona eklenir ve en bastan silinir.
	 * Bu sisteme FIFO (First In First Out) denir.
	 * Eczaneler, yemekhaneler bu sistemi kullanýr.
	 */

	public static void main(String[] args) {
		
		/*
		 * PriorityQueue kullanarak Queue uretirseniz , Java kendisi bir "Priority"(oncelik)
		 * kuralý uretilir ve urettigi bu kurala göre elemanlarý dizer.Istersek biz kendi 
		 * "priority"(öncelik) kuralimizi uretip elemanlarý bu kurala göre dizebiliriz.
		 */
		
		Queue<String> q1 = new PriorityQueue<>();
		q1.add("Milk");
		q1.add("Cheese");
		q1.add("Water");
		q1.add("Oil");
		q1.add("Meat");
		System.out.println(q1);  // [Cheese, Meat, Water, Oil, Milk]
		
		
		// en bastan siliyorsa demekki bununla alakalý bircok method var
		
		
		
		// peek() methodu ilk elemaný silmeden bize o elemaný return eder. copy -paste gibi
		System.out.println(q1.peek());// cheese 
        System.out.println(q1); // [Cheese, Meat, Water, Oil, Milk]
        
        
        // poll() methodu ilk elemaný siler , sildigini return eder
        System.out.println(q1.poll()); // cheese
        System.out.println(q1);// [ Meat, Water, Oil, Milk]
        
        
     // bazen queue 'ya sýnýr konabilir add() methodu bu durumda kullanýlamayabilir.Bu iþi offer() methoduyla yapabiliriz
        q1.offer("coke");  
        System.out.println(q1); // [Meat, Milk, Water, Oil, coke]
        
        
        
        Queue<String> q2 = new LinkedList<>(); // eleman eklemede LinkedList gibi davranýr.Sýnra da queue'nin özelliklerini kullanýr
        q2.add("Bread");
		q2.add("Sugar");
		q2.add("Rice");
		q2.add("Bean");
		q2.add("Salt");
		System.out.println(q2); // [Bread, Sugar, Rice, Bean, Salt]
		

		/*
		 * remove() methodu ve poll() methodlarýnýn ikisi de ilk elemaný siler ve return eder.
		 */
		//	q2.remove();
		q2.poll();    
		System.out.println(q2); // [Sugar, Rice, Bean, Salt]
		
		q2.clear();
		System.out.println(q2.poll()); // null
	//	System.out.println(q2.remove()); // exception verir.
		
	}

}
