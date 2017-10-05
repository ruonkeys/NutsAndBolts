package dev;

import java.util.Scanner;

//Linked List implementation, insertion at a particular location

//link is https://youtu.be/IbvsNF22Ud0

public class InsertAtPos {
	class Node
	{
		int data;
		Node next;
	}
	Node start = null;
	
	public void insert(int num, int pos)
	{
		Node node = new Node();
		node.data = num;
		if(pos == 1 && start == null)
		{
			node.next = null;
			start = node;
		}
		else if(pos == 1 && start != null)
		{
			node.next = start;
			start = node;
		}
		else
		{
			Node temp = start;
			for(int i=0; i<pos-2; i++)
			{
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}
	public void display()
	{
		if(start != null){
			Node temp = start;
			System.out.print("List is: ");
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
		InsertAtPos obj = new InsertAtPos();
		obj.insert(4,1); //list 4
		obj.display();
		obj.insert(5, 2); //list 4,5
		obj.display();
		obj.insert(7, 1); //list 7,4,5
		obj.display();
		obj.insert(10, 3); //list 7,4,10,5
		obj.display();
		obj.insert(8, 2); //list 7,8,4,10,5
		obj.display();
	}
}

