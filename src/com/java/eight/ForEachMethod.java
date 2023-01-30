package com.java.eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer> value = Arrays.asList(1,2,3,4,5,6,1,2,3,4,5);
		List<String> v= Arrays.asList("1,2,3,4,5,6","1,2,3,4,5","2");
//		for(int i =0; i<value.size();i++) {
//			System.out.println(value.get(i));
//		}

//		for(int i:value) {
//			System.out.println(i);
//		}
		
//		value.forEach(i -> System.out.println(i));
		Set<Integer> s = new HashSet<>();
		
		List<Integer> l = value.stream().filter(n ->!s.add(n)).collect(Collectors.toList());
			System.out.println(l);
			List<String> p = v.stream().filter(y ->y.startsWith("2")).collect(Collectors.toList());
			System.out.println(p);
			
			Integer i=value.stream().reduce((a,b)->a+b).get();
			System.out.println(i);
			
			Integer o = value.stream().max(Comparator.comparing(Integer::valueOf)).get();
;								Integer y = value.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
			System.out.println(y);
	}

}
