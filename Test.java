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
	}
}
