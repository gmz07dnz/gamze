package day29overriding;

public class overRiding {

	
	/*
	 1) Parent Class'taki bir methodu Child Class'a g�re �zelle�tirerek kullanmak isterseniz "Overriding" yapabilirsiniz.
	 
	 2) a- Overriding yaparken "method signature(name + parameter)" a dokunalmaz.
	    b- Overriding yaparken "access modifier"lar belli kurallara g�re degi�tirilebilir.
	    c- Overriding yaparken "return type"lar belli kurallara g�re degi�tirilebilir.
	    d- Overriding yaparken "method body de�i�tirilir zaten "Overriding" in amac� budur. Ama method body'i
	       de�i�tirmeden kullan�rsan�z java CTE vermez. Ama Overriding'de method body'i de�i�tirmemek mant�ks�zd�r.
	    e- Overriding yapabilmek i�in parent - child relationship �artt�r. Yani inheritance olmadan Overriding olmaz.
	    f- Override edilen method parent'daki methoddur ve java o methoda "Overridden Method" denir. Child class'taki
	    method ise Overriding method olarak adland�r�l�r.
	    
	  3) Overriding methodun ba��na "@Override" annotation'�n� koyarsan�z Java yapt�g�n�z Overriding'i kontrol eder,
	  herhangi bir yanl��l�k varsa CTE verir.
	  
	  4) "Overriding method" un access modifier'� ya "Overridden Method" ile ayn� olur veya daha geni� olur.
	  
	  5) Return type'lar primitive data type ise ==> "Overriding method" un return type'� "Overridden Method" ile ayn� olmal�d�r.
	  
	  6) "Overridden Method" un return type void ise  "Overriding method" un return type'� void olmal�d�r.
	  
	  7) Return type Wrapper class ise "Overriding method" un return type�i �Overridden Method� ile ayni olmalidir.
	  
	  8) Return Type'lar aras�nda parent-child relationship varsa ya "Overridden method" ile ayn� olmal� veya
	  "Overridden method"un child class'� olmal�
	  
	  9) Static method'lar override edilemez.
	  
	  10) Final method'lar override edilemez.
	  
	  11) Private method'lar override edilemez.
	  
	  12) "Polymorphism" nedir?
	      Elcevap: Polymorphism "Overloading" ve "Overriding"den olusur.
	               Overloading ==> public void add() {   }
	                               public void add(int i) {    }
	                               public void add(int i,String s) {    }
	               Overriding ==>  public void multiply() {syso("3*4")  }
	                               public void multiply() {syso("1*2*4")  }
	                               public void multiply() {syso(5*4*3)  }
	                               
	   ==>  "Overloading" ve "Overriding" aras�ndaki farklar nelerdir?
	     
	     1)  "Overloading" de method signature (name +parametre) de�i�tirilir (parametre degisir ),
	         "Overriding" de  method signature'a dokunulmaz.
	         
	     2)  "Overloading" de method body genellikle degi�tirilmez,  "Overriding" de  method body hemen hemen her zaman
	     de�i�tirilir
	     
	     3) "Overloading" de inheritance gerekmez, "Overriding" de inheritance sartt�r.
	     
	     4) "Overloading" Compile Time Polymorphism'dir, "Overriding" Run Time Polymorphism'dir.
	     
	     5) Private method'lar Overload edilebilirler ama override edilemezler.
	        Static method'lar Overload edilebilirler ama override edilemezler.
	        Final method'lar Overload edilebilirler ama override edilemezler.
	     
	   
	 */

}
