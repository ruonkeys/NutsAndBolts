package nuts.NutsAndBolts;

public class StackLnkLst {
	class Node
	{
		int data;
		Node next;
	}
	Node top = null;
	
	public void push(int num)
	{
		//insertion from top
		Node node = new Node();
		node.data = num;
		node.next = top;
		top = node;
	}
	public int pop()
	{
		if(top == null)
		{
			System.err.println("Stack is empty...");
			return -100;
		}
		//deletion from top
		int num;
		num = top.data;
		top = top.next;
		return num;
	}
	public void display()
	{
		Node temp = top;
		System.out.println("List is:");
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println("");
	}
	public int topOfStack()
	{
		if(top == null)
		{
			System.err.println("Stack is empty...");
			return -100;
		}
		return top.data;
	}
	public static void main(String args[])
	{
		StackLnkLst obj = new StackLnkLst();
		obj.push(1);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.display();
		System.out.println("Popped element is: "+obj.pop());
		obj.display();
		System.out.println("Popped element is: "+obj.pop());
		obj.display();
		System.out.println("Top of stack is: "+obj.topOfStack());
	}
}
