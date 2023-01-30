package com.java.eight;

import java.util.ArrayList;

interface A{
	void display();
}

class B implements A{
	public void display () {
		System.out.println("Hello");
	}
	
}
public class LambdaExpression {

	public static void main(String[] args) {
//		A obj = new B();
//		obj.display();
		
//		A obj;
//		obj = new A(){
//			public void display() {
//				System.out.println("Hello");
//			}
//		};
		A obj;
		obj=()-> System.out.println("Hello");
		obj.display();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    numbers.forEach( (n) -> { System.out.println(n); } );
	}

}
