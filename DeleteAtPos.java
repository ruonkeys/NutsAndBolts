package nuts.NutsAndBolts;

import java.util.Scanner;

//Linked list implementation, delete at a particular position

//link is https://youtu.be/Y0n86K43GO4

public class DeleteAtPos {
	class Node
	{
		int data;
		Node next;
	}
	Node start = null;
	
	public void insert(int num)
	{
		//it does insertion at end
		Node node = new Node();
		node.data = num;
		if(start == null)
		{
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
		}
		node.next = null;
	}
	public void display()
	{
		Node temp = start;
		System.out.print("List is: ");
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	public void delete(int pos)
	{
		Node temp = start;
		if(pos == 1)
		{
			start = temp.next;
			//temp would be collected by Garbage Collector
			return;
		}
		for(int i=0; i< pos-2; i++)
		{
			temp = temp.next;
		}
		Node temp2 = temp.next;
		temp.next = temp2.next;
		//temp2 would be collected by Garbage Collector
	}
	public static void main(String args[])
	{
		DeleteAtPos obj = new DeleteAtPos();
		Scanner sc = new Scanner(System.in);
		obj.insert(4);
		obj.insert(5);
		obj.insert(9);
		obj.insert(10);
		obj.insert(1);
		obj.display(); //4,5,9,10,1
		obj.delete(3);
		obj.display();
	}

}
