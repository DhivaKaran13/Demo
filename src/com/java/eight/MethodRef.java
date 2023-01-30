package com.java.eight;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {
	 List<String> name = Arrays.asList("A","B","C","D");
//	 name.forEach(System.out::println);
 name.forEach(s->System.out.println(s));

	}

}
