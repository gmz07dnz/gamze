package day34Interface;

public interface Lastik extends DisDonanim{
	
	
	/*
	 interface'i interface'e parent yaparken "extends"
	 keyword kullanilir.
	 
	 class ===> class : extends
	 interface ===> interface: extends
	 class ===> interafce: implements
	 
	 interface ===> class: OLMAZ. Bir interface'in
	                       parent'i class olamaz.
	*/
	
	String MARKA = "Audi";
	void garanti();
	void jant();

}
