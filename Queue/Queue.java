import java.util.Scanner;
class Queue
{
	static Scanner sc=new Scanner(System.in); 
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	static Node front=null,rear=null;
	static int Nodecount=0; 
	public static void main(String[] args)
	{
		int ch;
		while(true)
		{
			System.out.println("Welcome to HakerArena Tutorials");
			System.out.println("Press 1 for node insertion");
			System.out.println("Press 2 for node deletion");
			System.out.println("Press 3 to show queue");
			System.out.println("Press 4 for search an element");
			System.out.println("Press 5 to show no of nodes present in queue");
			System.out.println("Press 6 to exit");
			System.out.print("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: enQueue(); break;
				case 2: deQueue(); break;
				case 3: show(); break;
				case 4: search(); break;
				case 5: System.out.println(Nodecount+" nodes currently present in queue!"); break;
				case 6: System.out.println("Code provided by hakerarenatutorials.wordpress.com"); System.exit(0);
				default: System.out.println("Invalid Choice!");
			}
		}
	}
	static Node createNode()
	{
		int d;
		System.out.println("Enter data: ");
		d=sc.nextInt();
		Node ptr=new Node(d);
		return ptr;
	}
	static void enQueue()
	{
		Node ptr=createNode();
		if(rear==null)
		{
			front=ptr;
			rear=ptr;
			System.out.println("Data inserted and queue created!");
		}
		else
		{
			rear.next=ptr;
			rear=ptr;
			System.out.println("Data inserted in queue!");
		}
		Nodecount++;
	}
	static void deQueue()
	{
		if(front==null)
			System.out.println("Queue doesn't exist!");
		else
		{
			Node tmp=front;
			front=front.next;
			tmp=null;
			System.out.println("Data deleletd!");
			Nodecount--;
		}
	}
	static void show()
	{
		if(front==null)
				System.out.println("Queue doesn't exist!");
		else
		{
			Node tmp=front;
			while(tmp!=null)
			{
				System.out.println(tmp.data);
				tmp=tmp.next;
			}
		}
	}
	static void search()
	{
		if(front!=null)
		{
			Node tmp=front;
			int value;
			System.out.print("Enter value to be searched: ");
			value=sc.nextInt();
			while(tmp!=null)
			{
				if(tmp.data==value)
				{
					System.out.println(value+" found!");
					break;
				}
				tmp=tmp.next;
			}
			if(tmp==null)
			{
				System.out.println(value+" not found!");
			}
		}
		else
		{
			System.out.println("Queue doesn't exist!");
		}
	}
}
