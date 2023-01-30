package com.java.eight;


//interface C{
//	int n=10;
//	static void letter() {
//		System.out.println("letter is c");
//	}
//}
//class E implements C{
//	n =50;
//}
//public class StaticMethod {
//
//	public static void main(String[] args) {
//		C.letter();
//
//	
//	}
//
//}
public class Question1 {
static long findValue(int arr[], long n, long k)
 {
 // Search for k. After every successful
 // search, double k.
 for (int i = 0; i < n; i++)
 
 if (arr[i] == k)
 k *= 2;
 
 return k;
 }
public static void main(String[] args) {
int arr[] = {1, 2, 4, 11, 12, 8}, k = 2;
 int n = arr.length;
System.out.print(findValue(arr, n, k)); 
}
}
