package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

	public static void main(String[] args) {
		
		// Dosyaya ula�on
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/day30exceptions/TextF�leTr");
			
			// dosyay� okuyun
			
	        int k;
			
			while ((k = fis.read())!= -1) {
				System.out.print((char)k);
			}	
			
		} catch (FileNotFoundException e) {
			System.out.println("Ya path yanl�� ya da dosya silinmi�");
		
		}catch (IOException e) {
			System.out.println("Dosya okurken problem olustu");
		}finally {
			try {
				fis.close();
				System.out.println("kapand�");
			} catch (IOException e) {
				System.out.println("kapanmad�");
			}
		}
		
		
		
	
	}

}
