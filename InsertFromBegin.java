package dev;

import java.util.Scanner;

//Linked List implementation, insertion of elements from beginning

//link is https://youtu.be/cAZ8CyDY56s

public class InsertFromBegin {
	
	class Node
	{
		int data;
		Node next;
	}
	
	Node start = null;
	
	public void insert(int num)
	{
		Node node = new Node();//obj of inner class can be made here in normal way
		//here we are creating this node obj in heap memory
		//if someone does int a then a gets created in stack, content created in stack gets removed as soon as a function call finishes
		//what we need is that we want to create something which deosn't get remove even when function call finishes
		//thats why we created it in heap, new keyword created content in heap
		//access to heap only happens through pointer variable i.e obj in our case
		//check more about dynamic memory allocation
		node.data = num;
		if(start == null)
		{
			node.next = null;
		}
		else
		{
			node.next = start;
		}
		start = node;
	}
	
	public void display()
	{
		if(start != null){
			Node temp = start;
			System.out.println("List is :");
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println("");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		InsertFromBegin obj = new InsertFromBegin();
		System.out.println("How many numbers do you want to insert");
		int count = sc.nextInt();
		for(int i=0; i<count; i++)
		{
			System.out.println("Enter number: ");
			obj.insert(sc.nextInt());
			obj.display();
		}
		
		//if we wanna declare obj of inner class here then we have to do it differently
	}
}
