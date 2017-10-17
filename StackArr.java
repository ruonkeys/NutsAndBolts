package nuts.NutsAndBolts;

//Stack implementation using array

//link is https://youtu.be/sFVxsglODoo

import java.util.Scanner;

public class StackArr {
	int top;
	static int MAX;
	int arr[];
	StackArr()
	{
		top = -1;
		MAX = 10;
		arr = new int[MAX];
	}
	StackArr(int size)
	{
		top = -1;
		MAX = size;
		arr = new int[MAX];
	}
	public void push(int num)
	{
		if(top >= MAX-1)
		{
			System.err.println("....Error: Stack overflow........");
			return;
		}
		arr[++top] = num;
	}
	public int pop()
	{
		if(top < 0)
		{
			System.err.println("...Error: Stack Empty.....");
			return -1000;
		}
		return arr[top--];
	}
	public int topOfStack()
	{
		if(top < 0)
		{
			System.err.println("...Error: Stack Empty......");
			return -100;
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
	public void display()
	{
		if(top >= 0)
		{
			System.out.println("Stack is:");
			for(int i=0; i<=top; i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
		}
		else
		{
			System.out.println("...Stack is empty...");
		}
	}
	public static void main(String args[])
	{
		StackArr stack;
		boolean status = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to stack");
		System.out.println("Want to enter size of stack (y/n)");
		String r = sc.next();
		if(r.equalsIgnoreCase("y"))
		{
			System.out.println("Enter size of stack");
			stack = new StackArr(sc.nextInt());
		}
		else if(r.equalsIgnoreCase("n"))
		{
			stack = new StackArr();
		}
		else
		{
			stack = new StackArr();
			System.err.println("Error: You have entered wrong choice");
			System.err.println("Exiting program...");
			System.exit(0);
		}
		while(status)
		{
			System.out.println("What operation would  you like to perform (push/pop/top/isEmpty/print)");
			String choice = sc.next();
			int n;
			if(choice.equalsIgnoreCase("push"))
			{
				n = 0;
			}
			else if(choice.equalsIgnoreCase("pop"))
			{
				n = 1;
			}
			else if(choice.equalsIgnoreCase("top"))
			{
				n = 2;
			}
			else if(choice.equalsIgnoreCase("isEmpty"))
			{
				n = 3;
			}
			else if(choice.equalsIgnoreCase("print"))
			{
				n = 4;
			}
			else
			{
				n = 100;
			}
			switch(n)
			{
			case 0: System.out.println("Enter number you want to push");
					int num = sc.nextInt();
					stack.push(num);break;
			case 1: System.out.println("Popped element:");
					System.out.println(stack.pop());break;
			case 2: System.out.println("Top element is:");
					System.out.println(stack.topOfStack());break;
			case 3: if(stack.isEmpty())
					{
						System.out.println("Stack is empty");
					}
					else
					{
						System.out.println("Stack is not empty");
					}
					break;
			case 4: stack.display();break;
			default: System.err.println("....Error: Wrong choice entered please try again...");
			}
			
			System.out.println("Do you want to continue with more operations on stack? (y/n)");
			String a = sc.next();
			if(a.equalsIgnoreCase("y"))
			{
				status = true;
			}
			else if(a.equalsIgnoreCase("n"))
			{
				status = false;
			}
			else
			{
				System.err.println("Error: wrong choice entered..........");
				break;
			}
		}
		System.out.println("----------Program ends-------");
	}
}
