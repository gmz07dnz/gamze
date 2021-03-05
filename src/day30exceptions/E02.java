package day30exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

	public static void main(String[] args)  {
		
		/*
		 * FileInputStream bu classda bir sur� method var. bir k�sm� static bir k�sm� de�il methodlara  ulasmak i�in obje olusturuyorum.
		 *  Class import edilidi ama constructor sikayete devam ediyor. ��nk� bu class'da parametresiz const yok.
		 *  I�ine parametre koymam�z laz�m.Bu constructor, dosyayla cal��t�g�m i�in dosyan�n adresini istiyor.
		 *  Olusturdugum TextFile dosyas�n�n adresini ald�m. Adresi yazd�m hala constructor k�rm�z� !!
		 *  Adresi bul onunla cal�sacaks�n diyorum ama java korkuyor . Ya adres yanl��sa(bir harf bile yanl�� olsa s�k�nt�)
		 *  ya da dosya orda yoksa . bu endi�eleri gidermek laz�m
		 *  
		 *  
		 *  TextFile => new -> Untitled Text File
		 *  path(adres) => TextFile -> properties-> path -> src ile baslayan yerden itibaren
		 */
       
		FileInputStream fis = null;
		try {
		// dosyaya ula�ma
		fis  = new FileInputStream("src/day30exceptions/TextF�leTr"); 
		
		//ulas�lan dosya uzerinde cal�smak , ornegin dosyay� okuma
		
		int k;
		while ((k = fis.read())!= -1) {
			System.out.print((char)k);
		}
		}catch(FileNotFoundException e) {
			System.out.println("Ya path yanl�s veya dosya silinmi�");
			
		}catch(IOException e) {
			System.out.println("Dosya okurken problem olustu");
		}finally {
			try {
				fis.close();
				System.out.println("Kapand�");
			} catch (IOException e) {
				System.out.println("Kapanmad�");
			}
		}
		
		
		

	}

}
