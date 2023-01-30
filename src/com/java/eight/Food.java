package com.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Iterator;
public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List<Integer> i = Arrays.asList(2,9,10,3,4,2,3);
////i.stream().sorted().forEach(System.out::println);
//	Set<Integer> s=	i.stream().filter(j-> Collections.frequency(i, j)>1). collect(Collectors.toSet());
//		System.out.println(s);

List<Integer> l = new ArrayList<Integer>();
l.add(1);
l.add(2);
Map<Integer,String> m = new HashMap<>();
m.put(1, "A");
m.put(2, "B");
m.put(3, "C");
System.out.println(m);
ConcurrentHashMap<Integer, String> c = new ConcurrentHashMap<>();
c.put(1, "A");
c.put(2, "B");
c.put(3, "c");
c.put(4, "D");
System.out.println(c.containsValue("A"));
System.out.println(c);
Set s = c.entrySet();
//System.out.println(s);
for(Integer key:c.keySet()) {
	System.out.println(key);
}
for(Entry<Integer, String> entry:c.entrySet()) {
	
	Integer k = entry.getKey();
	String v = entry.getValue();
	System.out.println("key:"+k+ "value:"+v);
}

//Iterator i =  s.iterator();
//while(i.hasNext()) {
//	Map.Entry<Integer, String> entry= (Entry<Integer, String>) i.next();
//	System.out.println(entry);
//	Integer key = entry.getKey();
//	String value = entry.getValue();
//	System.out.println("key:"+key + "value:"+value);
//}
String z = "big black bug bit a big black dog on his big black nose";
int count = 0;
for(int  i=0; i<=z.length();i++) {
	//System.out.println(z);
	count++;
}
System.out.println(count);

String[] mystrings = {"hi", "bye"};

List<List<Integer>> result;

result = Arrays.stream(mystrings)
                 .map(s1 -> s1.chars()
                                   .mapToObj(e -> (char) e)
                                   .collect(Collectors.toList()))
                 .map(chars -> chars.stream()
                                       .map(Integer::new)
                                       .collect(Collectors.toList())
                 )
                 .collect(Collectors.toList());
System.out.println(result);
	}

	

	 
}
