import java.util.Scanner;
class Stack
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
	static Node top=null;
	static int Nodecount=0;
	public static void main(String args[])
	{
		int choice;
		while(true)
		{
			System.out.println("Welcome to HakerArena Tutorials");
			System.out.println("Enter 1 to push an element");
			System.out.println("Enter 2 to pop an element");
			System.out.println("Enter 3 to show stack");
			System.out.println("Enter 4 to search an element in stack");
			System.out.println("Enter 5 to check nodecount");
			System.out.println("Enter 6 to exit");
			System.out.print("Enter choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: push(); break;
				case 2: pop(); break;
				case 3: show(); break;
				case 4: search(); break;
				case 5: System.out.println("No. of nodes in satck: "+Nodecount); break;
				case 6:
				{
					System.out.println("Code provided by hakerarenatutorials.wordpress.com");
					System.exit(0);
				}
				default: System.out.println("Invalid Choice!");
			}
		}
	}
	public static Node createNode()
	{
		System.out.print("Enter data: ");
		int d=sc.nextInt();
		Node ptr=new Node(d);
		return ptr;
	}
	public static void push()
	{
		Node ptr=createNode();
		if(top==null)
		{
				top=ptr;
		}
		else
		{
			ptr.next=top;
			top=ptr;
		}
		Nodecount++;
		System.out.println("Node Pushed!");
	}
	public static void pop()
	{
		if(top==null)
		{
			System.out.println("Stack underflow!");
		}
		else
		{
			Node tmp=top;
			top=top.next;
			tmp=null;
			Nodecount--;
			System.out.println("Node popped!");
		} 
	}
	public static void show()
	{
		Node tmp=top;
		while(tmp!=null)
		{
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}
	public static void search()
	{
		Node tmp=top;
		System.out.print("Enter value to search: ");
		int value=sc.nextInt();
		while(tmp!=null)
		{
			if(value==tmp.data)
			{
				System.out.println(value+" found in stack!");
				break;
			}
			else
			{
				tmp=tmp.next;
			}
			if(tmp==null)
				System.out.println(value+" not found in stack!");
		}
	}
}
