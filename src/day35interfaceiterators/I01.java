package day35interfaceiterators;

public interface I01 {

	

	/*
	 * Method olustururken "default" ve "static" keywordlerini kullanarak isterseniz interface i�inde "concrete method" olusturabilirsiniz.
	 */

	/*
	 * ONEMLI NOT: Interface i�inde concrete method olusturmak i�in "default " keywordu access modifier degildir.
	 * Asag�daki methoddda gordugunuz gibi access modifier public'tir.
	 * 
	 * Not: Interface'lerde "default" keyword'unu kullanarak olusturulan methodlara "default method" denir.
	 * 
	 */
	// bu sekilde yaz�nca sikayet eder
	//int add() {
	
	
	/*
	 Asagida gordugunuz gibi interface icinde concrete method olusturmanin iki yolu var;
	 
	 1)"default" keyword'unu kullanmak ==> Baska class'lardan bu methoda ulasmak icin
	                                       object olusturmalisiniz
	 2)"static" keyword'unu kullanmak ==> Baska class'lardan bu methoda ulasmak icin 
	                                      object olusturmaniza gerek yok sadece interface ismi ile
	                                      methoda ulasabilirsiniz.
	 */
	
	default int add() {   //    public default int add(){    ==> ayn�s�d�r yani access modifier public degildir
		return 2;
	}          
	
	public static int multiply() {
		return 12;
	}
}
