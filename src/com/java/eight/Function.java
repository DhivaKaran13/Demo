package com.java.eight;

@FunctionalInterface
interface Cat{
	void sound();
	


public class Function {

	public static void main(String[] args) {
		
Cat c = ()-> System.out.println("domestic");
c.sound();
	}

	public static java.util.function.Function identity() {
		// TODO Auto-generated method stub
		return null;
	}

}}
