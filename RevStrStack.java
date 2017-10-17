package nuts.NutsAndBolts;

//reverse the string using stack

//time complexity O(n)
//space complexity O(n)

import java.util.Scanner;

public class RevStrStack {
	int top = -1;
	int MAX = 20;
	String stack[] = new String[MAX];
	public void push(String data)
	{
		if(top >= MAX-1)
		{
			System.err.println("Error: Stack overflow.....");
			return;
		}
		stack[++top] = data;
	}
	public String pop()
	{
		if(top < 0)
		{
			System.err.println("Stack empty....");
			return null;
		}
		return stack[top--];
	}
	public void reverse(String word)
	{
		String[] arr = word.split("");
		for(int i=0; i<arr.length;i++)
		{
			push(arr[i]);
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(pop());
		}
	}
	public static void main(String args[])
	{
		RevStrStack obj = new RevStrStack();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String word = sc.next();
		System.out.println("Reversed string is:");
		obj.reverse(word);
	}
}
