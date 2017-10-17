package nuts.NutsAndBolts;

//Reversing linked list using stack

//Time complexity O(n)
//Space complexity O(n)

class RuNode
{
	int data;
	RuNode next;
}
class RuStack
{
	int MAX = 20;
	RuNode[] arr = new RuNode[MAX]; //initializing array
	int top = -1;
	public void push(RuNode node)
	{
		if(top >= MAX-1)
		{
			System.err.println("Error: Stack overflow....");
			return;
		}
		arr[++top] = node;
	}
	public RuNode pop()
	{
		if(top < 0)
		{
			System.err.println("Stack empty...");
			return null;
		}
		return arr[top--];
	}
	public boolean isEmpty()
	{
		if(top < 0)
		{
			return true;
		}
		return false;
	}
	public RuNode top()
	{
		if(top < 0)
		{
			System.err.println("Stack empty...");
			return null;
		}
		return arr[top];
	}
}

public class RevLnkLstStack {
	RuNode start = null;
	public void insert(int num)
	{
		RuNode node = new RuNode();
		node.data = num;
		node.next = start;
		start = node;
	}
	public void display()
	{
		RuNode temp = start;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public void pushLnkLstToStack(RuStack stack)
	{
		
		RuNode temp = start;
		while(temp != null)
		{
			stack.push(temp);
			temp = temp.next;
		}
	}
	public void revLnkLst(RuStack stack)
	{
		RuNode temp;
		start = stack.top();
		temp = start;
		stack.pop();
		while(!stack.isEmpty())
		{
			temp.next = stack.top();
			temp = stack.pop(); //it acts i++ for loop i.e it is an input to the exit condition of loop, 
			                    //therefore it should be written at the end of loop
		}
		temp.next = null;
	}
	public static void main(String args[])
	{
		RevLnkLstStack obj = new RevLnkLstStack();
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		System.out.println("Entered list: ");
		obj.display();
		RuStack stack = new RuStack();
		obj.pushLnkLstToStack(stack);
		System.out.println("\nReversed list: ");
		obj.revLnkLst(stack);
		obj.display();
	}
}

