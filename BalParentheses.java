package nuts.NutsAndBolts;

//checking balanced parentheses using stack

import java.util.Scanner;

public class BalParentheses {
	int MAX = 30;
	char[] arr = new char[MAX];
	int top = -1;
	
	public void push(char ch)
	{
		if(top >= MAX-1)
		{
			System.err.println("Error: Stack overflow");
			return;
		}
		arr[++top] = ch;
	}
	public char pop()
	{
		if(top < 0)
		{
			System.err.println("Stack empty...");
			return 'e';
		}
		return arr[top--];
	}
	public char topOfStack()
	{
		if(top < 0)
		{
			System.err.println("Stack empty...");
			return 'e';
		}
		return arr[top];
	}
	public boolean isEmpty()
	{
		if(top < 0)
		{
			return true;
		}
		return false;
	}
	public boolean isBalanced(String exp)
	{ 
		char[] chr = exp.toCharArray();
		for(int i=0; i<chr.length; i++)
		{
			if(chr[i] == '(' || chr[i] == '{' || chr[i] == '[')
			{
				push(chr[i]);
			}
			else if(chr[i] == ')' || chr[i] == '}' || chr[i] == ']')
			{
				if(isEmpty() || (chr[i] == ')' && topOfStack() != '(') || (chr[i] == '}' && topOfStack() != '{') || (chr[i] == ']' && topOfStack() != '['))
				{
					return false;
				}
				else if(chr[i] == ')' && topOfStack() == '(')
				{
					pop();
				}
				else if(chr[i] == '}' && topOfStack() == '{')
				{
					pop();
				}
				else if(chr[i] == ']' && topOfStack() == '[')
				{
					pop();
				}
			}
		}
		if(isEmpty())
		{
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		BalParentheses obj = new BalParentheses();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter expression");
		String exp = sc.next();
		if(obj.isBalanced(exp))
		{
			System.out.println("Parentheses are balanced");
		}
		else
		{
			System.err.println("Parentheses are NOT balanced");
		}
	}
}
