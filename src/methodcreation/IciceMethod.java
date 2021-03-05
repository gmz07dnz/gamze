package methodcreation;

public class IciceMethod {

	public static void main(String[] args) {
		
		System.out.println("SONUC: "+dortCikar(ikitopla(ucIleCarp(5))));  // 13
		
		

	}

	public static int ucIleCarp(int a) {
		return a*=3;
	}
	
	public static int ikitopla(int a) {
		return a+=2;
	}
	
	public static int dortCikar(int a) {
		return a-=4;
	}
}
