package dev;

//Doubly linked list implementation, insertAtBegin, insertAtEnd, print, reverse print

//link is https://youtu.be/VOQNf1VxU3Q

public class DublyLnkLst {
	class Node
	{
		int data;
		Node next;
		Node prev;
	}
	Node start = null;
	
	public void insertAtBegin(int num)
	{
		Node node = new Node();
		node.data = num;
		if(start == null)
		{
			node.prev = null;
			node.next = null;
		}
		else
		{
			node.next = start;
			start.prev = node;
			node.prev = null;
			start = node;
		}
		start = node;
	}
	public void insertAtEnd(int num)
	{
		Node node = new Node();
		node.data = num;
		if(start == null)
		{
			node.prev = null;
			node.next = null;
			start = node;
		}
		else
		{
			Node temp = start;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = node;
			node.next = null;
			node.prev = temp;
		}
	}
	public void display()
	{
		Node temp = start;
		System.out.println("\nEntered list is: ");
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public void reverseDisplay()
	{
		Node temp = start;
		System.out.println("\nReversed order: ");
		while(temp.next != null)
		{
			temp = temp.next;
		}
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
	}
	public static void main(String args[])
	{
		DublyLnkLst obj = new DublyLnkLst();
		obj.insertAtBegin(2);
		obj.insertAtBegin(4);
		obj.insertAtBegin(1);
		obj.insertAtBegin(7);
		obj.display();
		obj.reverseDisplay();
		obj.insertAtEnd(10);
		obj.insertAtEnd(11);
		obj.display();
		obj.reverseDisplay();
	}
}
