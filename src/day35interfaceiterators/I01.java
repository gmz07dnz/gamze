package day35interfaceiterators;

public interface I01 {

	

	/*
	 * Method olustururken "default" ve "static" keywordlerini kullanarak isterseniz interface içinde "concrete method" olusturabilirsiniz.
	 */

	/*
	 * ONEMLI NOT: Interface içinde concrete method olusturmak için "default " keywordu access modifier degildir.
	 * Asagıdaki methoddda gordugunuz gibi access modifier public'tir.
	 * 
	 * Not: Interface'lerde "default" keyword'unu kullanarak olusturulan methodlara "default method" denir.
	 * 
	 */
	// bu sekilde yazınca sikayet eder
	//int add() {
	
	
	/*
	 Asagida gordugunuz gibi interface icinde concrete method olusturmanin iki yolu var;
	 
	 1)"default" keyword'unu kullanmak ==> Baska class'lardan bu methoda ulasmak icin
	                                       object olusturmalisiniz
	 2)"static" keyword'unu kullanmak ==> Baska class'lardan bu methoda ulasmak icin 
	                                      object olusturmaniza gerek yok sadece interface ismi ile
	                                      methoda ulasabilirsiniz.
	 */
	
	default int add() {   //    public default int add(){    ==> aynısıdır yani access modifier public degildir
		return 2;
	}          
	
	public static int multiply() {
		return 12;
	}
}
