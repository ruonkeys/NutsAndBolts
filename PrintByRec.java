package dev;

//Linked list implementation, printing list in normal and reverse order using recursion

//link is https://youtu.be/K7J3nCeRC80

public class PrintByRec {
	class Node
	{
		int data;
		Node next;
	}
	//Node start= null; //we could use this approach also, check in next part
	
	public Node insert(int num, Node start)
	{
		Node node = new Node();
		node.data = num;
		if(start == null)
		{
			start = node;
			node.next = null;
		}
		else
		{
			node.next = start;
			start = node;
		}
		return start;
	}
	
	public void printNormal(Node p)
	{
		if(p == null) //exit condition for recursion
		{
			return;
		}
		System.out.print(p.data+" ");
		p = p.next;
		printNormal(p);
		//for printing in normal form iterative way is bit more efficient as recursion is consuming more space
	}
	
	public void printReverse(Node p)
	{
		if(p == null) //exit condition
		{
			return;
		}
		int data = p.data;
		p = p.next;
		printReverse(p);
		System.out.print(data+" ");
	}
	
	public static void main(String args[])
	{
		Node start = null;
		PrintByRec obj = new PrintByRec();
		start = obj.insert(1, start);
		start = obj.insert(7, start);
		start = obj.insert(6, start);
		start = obj.insert(9, start);
		System.out.println("Normal order: ");
		obj.printNormal(start);
		System.out.println("\nReverse order: ");
		obj.printReverse(start);
	}
}

/*recursion is similar to loop in some ways but it is not exactly the same,it serves a different purpose
 * using loop you could go only one way like we did in printNormal method printing the values and moving forward 
 * but using recursion you could get back as well as we did in printReverse method by having a print statement after the recursive call
 * while using recursion remember to have an exit condition */
