package com.java.eight;

interface Lion{
	void roar ();
	default void  fight() {
		System.out.println("Default Method");
	}
}

interface Tiger{
	default void fight() {
		System.out.println("loss");
	}
}
 class Animal implements Lion{
	public void roar() {
		System.out.println("Im the king");
	}
	
//	public void fight() {
//		System.out.println("primary");
//	}
}
public class DefaultMethod {

	public static void main(String[] args) {
		
		Lion l = new Animal();
		l.roar();
		l.fight();

}

}
