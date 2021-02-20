package com.ecodation.dersler;

public class Ders004_DataType_WrapperClass {

	
	public static void main(String[] args) {
		/* 
		çoklu satır yorum(multi comment)
		 */
		// f - L yazmıyoruz.
		//Wrapper type(Gelişmiş türler)
		//byte b2=4;  b2=null;
		//tam sayılar ( B < S < I < L)
		Byte b1=new Byte((byte) 4); 
		b1=null;
		Short s1=new Short((short)5);
		Integer i1=new Integer(12);
		Long l2=new Long(15);
		
		//virgüülü sayılar
		Float f2=new Float(14.44);
		Double d2=new Double(44.55);
	
		Boolean b3=new Boolean(true);
		Character c3=new Character('a');
		
		String str="Hamit Mızrak";
		
	
		
	}
	
	
	
}
