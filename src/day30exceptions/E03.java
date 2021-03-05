package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

	public static void main(String[] args) {
		
		// Dosyaya ulaþon
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/day30exceptions/TextFýleTr");
			
			// dosyayý okuyun
			
	        int k;
			
			while ((k = fis.read())!= -1) {
				System.out.print((char)k);
			}	
			
		} catch (FileNotFoundException e) {
			System.out.println("Ya path yanlýþ ya da dosya silinmiþ");
		
		}catch (IOException e) {
			System.out.println("Dosya okurken problem olustu");
		}finally {
			try {
				fis.close();
				System.out.println("kapandý");
			} catch (IOException e) {
				System.out.println("kapanmadý");
			}
		}
		
		
		
	
	}

}
