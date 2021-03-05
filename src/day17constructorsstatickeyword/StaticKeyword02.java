package day17constructorsstatickeyword;

public class StaticKeyword02 {

	public static void main(String[] args) {
	
		// Class ismini yazýp "." koyunca static variable'lar gözukuyor. Instance olanlar gözükmez . Çunku static olanlar class'a asýlýdýr.
        //Instance olanlar gozukmez.Cunku onlar objeye aittir obje olmayýnca onlar da var olmaz.
		
		
		System.out.println(StaticKeyWord01.gender);  // erkek
		System.out.println(StaticKeyWord01.k); // 0
		
		StaticKeyWord01 obj1 = new StaticKeyWord01();   // obje olusturunca artýk instance olanlar da varolurlar. Obje ismini yazýp 
		                                                 // "." koyunca görülürler.
		
	//	obj1.name;
	//	obj1.i;        ikisi de listede gorunduler
		
		System.out.println(obj1.i); //0
		System.out.println(obj1.name); // Ali
		
 //    System.out.println(obj1.gender); // obje ile static olana ulasabilirim ama uzun ve gereksiz bir yoldu.Tavsiye edilmez o yuzden sarý 
                                     //çiziyor altýný. Sen napýyrsun diyor. Hatta listede bile obje ile cagýrýnca en alta koyuyor eclipse . 
                                     // Yine de  ulasýlabilir
		
		
		
	}

}
