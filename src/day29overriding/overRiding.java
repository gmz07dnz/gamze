package day29overriding;

public class overRiding {

	
	/*
	 1) Parent Class'taki bir methodu Child Class'a göre özelleþtirerek kullanmak isterseniz "Overriding" yapabilirsiniz.
	 
	 2) a- Overriding yaparken "method signature(name + parameter)" a dokunalmaz.
	    b- Overriding yaparken "access modifier"lar belli kurallara göre degiþtirilebilir.
	    c- Overriding yaparken "return type"lar belli kurallara göre degiþtirilebilir.
	    d- Overriding yaparken "method body deðiþtirilir zaten "Overriding" in amacý budur. Ama method body'i
	       deðiþtirmeden kullanýrsanýz java CTE vermez. Ama Overriding'de method body'i deðiþtirmemek mantýksýzdýr.
	    e- Overriding yapabilmek için parent - child relationship þarttýr. Yani inheritance olmadan Overriding olmaz.
	    f- Override edilen method parent'daki methoddur ve java o methoda "Overridden Method" denir. Child class'taki
	    method ise Overriding method olarak adlandýrýlýr.
	    
	  3) Overriding methodun baþýna "@Override" annotation'ýný koyarsanýz Java yaptýgýnýz Overriding'i kontrol eder,
	  herhangi bir yanlýþlýk varsa CTE verir.
	  
	  4) "Overriding method" un access modifier'ý ya "Overridden Method" ile ayný olur veya daha geniþ olur.
	  
	  5) Return type'lar primitive data type ise ==> "Overriding method" un return type'ý "Overridden Method" ile ayný olmalýdýr.
	  
	  6) "Overridden Method" un return type void ise  "Overriding method" un return type'ý void olmalýdýr.
	  
	  7) Return type Wrapper class ise "Overriding method" un return type’i “Overridden Method” ile ayni olmalidir.
	  
	  8) Return Type'lar arasýnda parent-child relationship varsa ya "Overridden method" ile ayný olmalý veya
	  "Overridden method"un child class'ý olmalý
	  
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
	                               
	   ==>  "Overloading" ve "Overriding" arasýndaki farklar nelerdir?
	     
	     1)  "Overloading" de method signature (name +parametre) deðiþtirilir (parametre degisir ),
	         "Overriding" de  method signature'a dokunulmaz.
	         
	     2)  "Overloading" de method body genellikle degiþtirilmez,  "Overriding" de  method body hemen hemen her zaman
	     deðiþtirilir
	     
	     3) "Overloading" de inheritance gerekmez, "Overriding" de inheritance sarttýr.
	     
	     4) "Overloading" Compile Time Polymorphism'dir, "Overriding" Run Time Polymorphism'dir.
	     
	     5) Private method'lar Overload edilebilirler ama override edilemezler.
	        Static method'lar Overload edilebilirler ama override edilemezler.
	        Final method'lar Overload edilebilirler ama override edilemezler.
	     
	   
	 */

}
