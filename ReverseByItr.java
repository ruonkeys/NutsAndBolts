package nuts.NutsAndBolts;

import java.util.Scanner;

//Linked list implementation, Reversing a linked list using iteration

//link is https://youtu.be/sYcOK51hl-A

//time complexity O(n)
//space complexity O(1)

public class ReverseByItr {
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
	
	public void display(String label)
	{
		Node temp = start;
		System.out.print(label);
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public void reverseList()
	{
		Node prev = null;
		Node temp,temp2;
		temp = start;
		while(temp != null)
		{
			temp2 = temp.next;
			temp.next = prev;
			prev = temp;
			temp = temp2;
		}
		start = prev;
		display("Reversed list is: ");
	}
	
	public static void main(String args[])
	{
		ReverseByItr obj = new ReverseByItr();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you wanna enter");
		int total = sc.nextInt();
		for(int i=0; i<total; i++)
		{
			System.out.println("Enter number: ");
			obj.insert(sc.nextInt());
		}
		obj.display("Entered list is: ");
		obj.reverseList();
	}
}
