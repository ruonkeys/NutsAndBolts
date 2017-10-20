package nuts.NutsAndBolts;

//circular queue implementation using array, its good to create circular queue while implementing queue using arrays because if not it will lead to unused blocks

//link https://youtu.be/okr-XE8yTO8?list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P

import java.util.Scanner;

public class QueueArr {
	static int MAX;
	int arr[];
	int rear = -1;
	int front = -1;
	QueueArr()
	{
		MAX = 10;
		arr = new int[MAX];
	}
	QueueArr(int size)
	{
		MAX = size;
		arr = new int[MAX];
	}
	public void enqueue(int num)
	{
		if(isFull())
		{
			System.err.println("Queue is FULL");
			return;
		}
		else if(isEmpty())
		{
			front++;
			rear++;
		}
		else
		{
			rear = (rear + 1)%MAX;
		}
		arr[rear] = num;
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			System.err.println("Queue empty, can't perform dequeue");
			return -1;
		}
		int num = arr[front];
		front = (front + 1)%MAX;
		return num;
	}
	public int front()
	{
		if(isEmpty())
		{
			System.err.println("Queue empty, can't perform dequeue");
			return -1;
		}
		return arr[front];
	}
	public boolean isEmpty()
	{
		if((rear == -1) && (front == -1))
		{
			return true;
		}
		return false;
	}
	public boolean isFull()
	{
		if(((rear+1)%MAX) == front)
		{
			return true;
		}
		return false;
	}
	public void display()
	{
		int f = front;
		int r = rear;
		System.out.print("Front: ");
		while(f != r)
		{
			System.out.print(arr[f]+" ");
			f = (f+1)%MAX;
		}
		System.out.print(arr[f]+" ");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		QueueArr obj;
		System.out.println("Want to enter size of queue (y/n)");
		String r = sc.next();
		if(r.equalsIgnoreCase("y"))
		{
			System.out.println("Enter size");
			int size = sc.nextInt();
			obj = new QueueArr(size);
		}
		else if(r.equalsIgnoreCase("n"))
		{
			obj = new QueueArr();
		}
		else
		{
			System.err.println("Wrong input program about to end");
			return;
		}
		obj.enqueue(1);
		obj.enqueue(2);
		obj.enqueue(3);
		System.out.println("\nQueue is: ");
		obj.display();
		obj.enqueue(4);
		obj.enqueue(5);
		System.out.println("\nQueue is: ");
		obj.display();
		System.out.println("\nDequeued element is: "+obj.dequeue());
		System.out.println("\nQueue is: ");
		obj.display();
		obj.enqueue(6);
		System.out.println("\nQueue is: ");
		obj.display();
		System.out.println("\nDequeued element is: "+obj.dequeue());
		System.out.println("\nDequeued element is: "+obj.dequeue());
		obj.enqueue(7);
		System.out.println("\nQueue is: ");
		obj.display();
	}
}
