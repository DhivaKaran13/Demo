package com.java.eight;

interface Parser{
	String parse(String str);
}

class Stringparser {
	public static String convert(String s) {
		if(s.length()<3) 
			s=s.toUpperCase();
			else
				s = s.toLowerCase();
			return s;
			}
}

class Printer{
	public void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
}

public class MethodReferences {

	public static void main(String[] args) {
		String str ="Ajithkumar";
		Printer t = new Printer();
//		t.print(str, new Parser() {
//			public String parse(String s) {
//				return Stringparser.convert(s);
//				
		t.print(str, Stringparser::convert);
			}
//		});
	    
	}


