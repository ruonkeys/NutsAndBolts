package dev;

//Linked list implementation, reversing linked list using recursion
//remember here we are actually reversing the links instead of only printing it reverse order as we did in previous section

//link is https://youtu.be/KYH83T4q6Vs

//time complexity O(n)
//space complexity O(n)

public class ReverseByRec {
	class Node
	{
		int data;
		Node next;
	}
	Node start = null;
	
	public void insert(int num)
	{
		Node node = new Node();
		node.data = num;
		if(start == null)
		{
			this.start = node; //just for visual purpose
		}
		else
		{
			Node temp = start;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = node;
		}
		node.next = null;
	}
	
	public void reverse(Node p)
	{
		if(p.next == null) //exit condition, remember here we don't wanna go beyond last element
		{
			this.start = p; //just for visual purpose
			return;
		}
		reverse(p.next);
		Node q = p.next;
		q.next = p;
		p.next = null;
	}
	
	public void display(Node temp)
	{
		if(temp == null) //exit condition
		{
			return;
		}
		System.out.print(temp.data+" ");
		display(temp.next);
	}
	
	public static void main(String args[])
	{
		ReverseByRec obj = new ReverseByRec();
		obj.insert(4);
		obj.insert(6);
		obj.insert(8);
		obj.insert(10);
		System.out.println("Entered list: ");
		obj.display(obj.start);
		obj.reverse(obj.start);//did obj.start, else i had to make it static which is unwanted
		System.out.println("\nReversed list: ");
		obj.display(obj.start);
	}
}
