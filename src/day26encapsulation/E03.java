package day26encapsulation;

public class E03 {
	// Bu class immutable clas deðildir. setter() ve getter() methodlarýndan dolayý

	private int num = 12;
	private String name = "Emine";
	private char initial = 'J';
	private boolean old = true;
	
	
	public int getNum() {
		return num;
	}
	
	
	public void setNum(int num) {
		this.num = num;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	// Data type boolean oldugunda getter() methodun ismi "get" degil "is" ile baslar. 
	public boolean isOld() {
		return old;
	}
	
	
	public void setOld(boolean old) {
		this.old = old;
	}
	
	
			
	
	
	
	
}
