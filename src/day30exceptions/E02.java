package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

	public static void main(String[] args)  {
		
		/*
		 * FileInputStream bu classda bir surü method var. bir kýsmý static bir kýsmý deðil methodlara  ulasmak için obje olusturuyorum.
		 *  Class import edilidi ama constructor sikayete devam ediyor. Çünkü bu class'da parametresiz const yok.
		 *  Içine parametre koymamýz lazým.Bu constructor, dosyayla calýþtýgým için dosyanýn adresini istiyor.
		 *  Olusturdugum TextFile dosyasýnýn adresini aldým. Adresi yazdým hala constructor kýrmýzý !!
		 *  Adresi bul onunla calýsacaksýn diyorum ama java korkuyor . Ya adres yanlýþsa(bir harf bile yanlýþ olsa sýkýntý)
		 *  ya da dosya orda yoksa . bu endiþeleri gidermek lazým
		 *  
		 *  
		 *  TextFile => new -> Untitled Text File
		 *  path(adres) => TextFile -> properties-> path -> src ile baslayan yerden itibaren
		 */
       
		FileInputStream fis = null;
		try {
		// dosyaya ulaþma
		fis  = new FileInputStream("src/day30exceptions/TextFýleTr"); 
		
		//ulasýlan dosya uzerinde calýsmak , ornegin dosyayý okuma
		
		int k;
		while ((k = fis.read())!= -1) {
			System.out.print((char)k);
		}
		}catch(FileNotFoundException e) {
			System.out.println("Ya path yanlýs veya dosya silinmiþ");
			
		}catch(IOException e) {
			System.out.println("Dosya okurken problem olustu");
		}finally {
			try {
				fis.close();
				System.out.println("Kapandý");
			} catch (IOException e) {
				System.out.println("Kapanmadý");
			}
		}
		
		
		

	}

}
