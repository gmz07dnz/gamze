package day37collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	
	/*
	 * 1) Elemanlar en sona eklenir ve en bastan silinir.
	 * Bu sisteme FIFO (First In First Out) denir.
	 * Eczaneler, yemekhaneler bu sistemi kullan�r.
	 */

	public static void main(String[] args) {
		
		/*
		 * PriorityQueue kullanarak Queue uretirseniz , Java kendisi bir "Priority"(oncelik)
		 * kural� uretilir ve urettigi bu kurala g�re elemanlar� dizer.Istersek biz kendi 
		 * "priority"(�ncelik) kuralimizi uretip elemanlar� bu kurala g�re dizebiliriz.
		 */
		
		Queue<String> q1 = new PriorityQueue<>();
		q1.add("Milk");
		q1.add("Cheese");
		q1.add("Water");
		q1.add("Oil");
		q1.add("Meat");
		System.out.println(q1);  // [Cheese, Meat, Water, Oil, Milk]
		
		
		// en bastan siliyorsa demekki bununla alakal� bircok method var
		
		
		
		// peek() methodu ilk eleman� silmeden bize o eleman� return eder. copy -paste gibi
		System.out.println(q1.peek());// cheese 
        System.out.println(q1); // [Cheese, Meat, Water, Oil, Milk]
        
        
        // poll() methodu ilk eleman� siler , sildigini return eder
        System.out.println(q1.poll()); // cheese
        System.out.println(q1);// [ Meat, Water, Oil, Milk]
        
        
     // bazen queue 'ya s�n�r konabilir add() methodu bu durumda kullan�lamayabilir.Bu i�i offer() methoduyla yapabiliriz
        q1.offer("coke");  
        System.out.println(q1); // [Meat, Milk, Water, Oil, coke]
        
        
        
        Queue<String> q2 = new LinkedList<>(); // eleman eklemede LinkedList gibi davran�r.S�nra da queue'nin �zelliklerini kullan�r
        q2.add("Bread");
		q2.add("Sugar");
		q2.add("Rice");
		q2.add("Bean");
		q2.add("Salt");
		System.out.println(q2); // [Bread, Sugar, Rice, Bean, Salt]
		

		/*
		 * remove() methodu ve poll() methodlar�n�n ikisi de ilk eleman� siler ve return eder.
		 */
		//	q2.remove();
		q2.poll();    
		System.out.println(q2); // [Sugar, Rice, Bean, Salt]
		
		q2.clear();
		System.out.println(q2.poll()); // null
	//	System.out.println(q2.remove()); // exception verir.
		
	}

}
