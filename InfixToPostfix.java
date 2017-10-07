package dev;

import java.util.Scanner;

public class InfixToPostfix 
{
	public int elePriority(char w)
	{
		switch(w){
			case '{' : return 0;
			case '(' : return 0;
			case '[' : return 0;
			case '+' : return 1;
			case '-' : return 1;
			case '/' : return 2;
			case '*' : return 2;
			case '^' : return 3;
		}
		return -1;
	}
	public static void main(String args[])
	{
		InfixToPostfix obj = new InfixToPostfix();
		ExpStack stack = new ExpStack();
		StringBuilder pfExp = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter infix expression");
		String exp = sc.next();
		BalParentheses bal = new BalParentheses();
		if(!bal.isBalanced(exp))
		{
			System.err.println("Parentheses are NOT balanced");
			return;
		}
		char[] w = exp.toCharArray();
		for(int i=0; i<w.length; i++)
		{
			if(w[i] == '(' || w[i] == '{' || w[i] == '[')
			{
				stack.push(w[i]);
			}
			else if(w[i] == '+' || w[i] == '-' || w[i] == '*' || w[i] == '/' || w[i] == '^')
			{
				if(stack.isEmpty())
				{
					stack.push(w[i]);
				}
				else
				{
					if(obj.elePriority(stack.top()) >= obj.elePriority(w[i]))
					{
						while(obj.elePriority(stack.top()) >= obj.elePriority(w[i]))
						{
							pfExp.append(stack.pop());
						}
						stack.push(w[i]);
					}
					else
					{
						stack.push(w[i]);
					}
				}
			}
			else if(w[i] == ')' || w[i] == '}' || w[i] == ']')
			{
				if(w[i] == ')')
				{
					while(stack.top() != '(')
					{
						pfExp.append(stack.pop());
					}
					stack.pop();
				}
				else if(w[i] == '}')
				{
					while(stack.top() != '{')
					{
						pfExp.append(stack.pop());
					}
					stack.pop();
				}
				else if(w[i] == ']')
				{
					while(stack.top() != '[')
					{
						pfExp.append(stack.pop());
					}
					stack.pop();
				}
			}
			else 
			{
				pfExp.append(w[i]);
			}
		}
		while(!stack.isEmpty())
		{
			pfExp.append(stack.pop());
		}
		System.out.println("Postfix Expression is: "+pfExp);
	}
}

class ExpStack
{
	int MAX = 20;
	char[] arr = new char[MAX];
	int top = -1;
	public void push(char ele)
	{
		if(top >= MAX-1)
		{
			System.err.println("Error: stack overflow");
			return;
		}
		arr[++top] = ele;
	}
	public char pop()
	{
		if(top < 0)
		{
			System.err.println("Error: stack empty");
			return 'e';
		}
		return arr[top--];
	}
	public char top()
	{
		if(top < 0)
		{
			System.err.println("Error: stack empty");
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
}
