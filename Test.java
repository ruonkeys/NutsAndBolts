package dev;

import java.util.Scanner;

public class Test {
	String name = "Tech";
	public void change(Test temp)
	{
		temp.name = "I/O";
	}
	public static void main(String args[])
	{
		Test test = new Test();
		System.out.println("Name is "+test.name);
		test.change(test);
		System.out.println("Name is "+test.name);
		//This proves that objects are passed by reference
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println("String: "+a);
		String[] arr = a.split(",");
		/*one must not use str.split("") to convert string to array because it returns zeroth element as empty
		 *  and after that we have other elements i.e length of "abcd".split("") is 5, it returns array as
		 *  {"","a","b","c","d"} 
		 *  therefore to convert string to array use str.toCharArray() */
		
		System.out.println("length: "+arr.length);
		System.out.println("arr is: "+arr);
		System.out.println("ele: "+arr[0]);
		System.out.println("ele: "+arr[1]);
		System.out.println("ele: "+arr[2]);
		System.out.println("ele: "+arr[3]);
		System.out.println("ele: "+arr[4]);
	}
}
