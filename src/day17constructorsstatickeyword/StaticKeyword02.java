package day17constructorsstatickeyword;

public class StaticKeyword02 {

	public static void main(String[] args) {
	
		// Class ismini yaz�p "." koyunca static variable'lar g�zukuyor. Instance olanlar g�z�kmez . �unku static olanlar class'a as�l�d�r.
        //Instance olanlar gozukmez.Cunku onlar objeye aittir obje olmay�nca onlar da var olmaz.
		
		
		System.out.println(StaticKeyWord01.gender);  // erkek
		System.out.println(StaticKeyWord01.k); // 0
		
		StaticKeyWord01 obj1 = new StaticKeyWord01();   // obje olusturunca art�k instance olanlar da varolurlar. Obje ismini yaz�p 
		                                                 // "." koyunca g�r�l�rler.
		
	//	obj1.name;
	//	obj1.i;        ikisi de listede gorunduler
		
		System.out.println(obj1.i); //0
		System.out.println(obj1.name); // Ali
		
 //    System.out.println(obj1.gender); // obje ile static olana ulasabilirim ama uzun ve gereksiz bir yoldu.Tavsiye edilmez o yuzden sar� 
                                     //�iziyor alt�n�. Sen nap�yrsun diyor. Hatta listede bile obje ile cag�r�nca en alta koyuyor eclipse . 
                                     // Yine de  ulas�labilir
		
		
		
	}

}
