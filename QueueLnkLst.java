package nuts.NutsAndBolts;

//linked list implementation of queue, remember that all the operations of queue like enque, dequeue, etc must have O(1) complexity

//link is: https://youtu.be/A5_XdiK4J8A?list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P

public class QueueLnkLst {
	class Node
	{
		int data;
		Node next;
	}
	Node front = null;
	Node rear = null;
	
	public void enqueue(int num)
	{
		Node node = new Node();
		node.data = num;
		if(front == null && rear == null)
		{
			node.next = null;
			front = node;
			rear = node;
		}
		else
		{
			rear.next = node;
			node.next = null;
			rear = node;
		}
	}
	public int dequeue()
	{
		if(front == null)
		{
			System.err.println("Queue is empty");
			return -1;
		}
		int num = front.data;
		front = front.next;
		return num;
	}
	public void display()
	{
		Node temp = front;
		System.out.println("Queue is:");
		System.out.print("front_ ");
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print(" _rear");
		System.out.println("");
	}
	public int frontEle()
	{
		if(front == null)
		{
			System.err.println("queue empty");
			return -1;
		}
		return front.data;
	}
	public static void main(String args[])
	{
		QueueLnkLst obj = new QueueLnkLst();
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		obj.display();
		System.out.println("Dequeued ele is "+obj.dequeue());
		obj.display();
		System.out.println("Dequeued ele is "+obj.dequeue());
		obj.enqueue(4);
		obj.enqueue(5);
		obj.enqueue(6);
		obj.display();
		System.out.println("Dequeued ele is "+obj.dequeue());
		obj.display();
	}
}
