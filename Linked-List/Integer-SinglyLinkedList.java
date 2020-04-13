import java.util.Scanner;
class LinkedList
{
	static int Nodecount;
	static Scanner sc=new Scanner(System.in);
	LinkedList()
	{
		Nodecount=0;
	}
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
	static Node head=null;
	public static void main(String args[])
	{
		int ch;
		while(true)
		{
			System.out.println("Welcome to Haker Arena Tutorials");
			System.out.println("Enter 1 to insert a value at beginning");
			System.out.println("Enter 2 to insert a value at given position");
			System.out.println("Enter 3 to insert a value at end");
			System.out.println("Enter 4 to delete a value at beginning");
			System.out.println("Enter 5 to delete a given value");
			System.out.println("Enter 6 to delete a value at end");
			System.out.println("Enter 7 to show");
			System.out.println("Enter 8 to search an element");
			System.out.println("Enter 9 to exit");
			System.out.print("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: 
				{
					Node ptr=createNode();
					insertAtBeg(ptr);
					break;
				}
				case 2:
				{
					Node ptr=createNode();
					int pos=getPosition(ptr.data);
					if(pos==1)
					{
						insertAtBeg(ptr);
					}
					else if((head==null&&pos>1)||(pos>Nodecount+1))
					{
						System.out.println("List isn't so long!");
					}
					else if(pos>1&&pos<=Nodecount)
					{
						insertAtGivenPoint(ptr,pos);
					}
					else if(pos==Nodecount+1)
					{
						insertAtEnd(ptr);
					}
					break;
				}
				case 3:
				{
					Node ptr=createNode();
					insertAtEnd(ptr);
					break;
				}
				case 4:
				{
					deleteAtBeg();
					break;
				}
				case 5:
				{
					int count=search();
					if(count==1)
					{
						deleteAtBeg();
					}
					else if(count>0)
					{
						deleteAGivenValue(count);
					}
					break;
				}
				case 6: 
				{
					deleteAtEnd();
					break;
				}
				case 7: 
				{
					show();
					break;
				}
				case 8:
				{
					int count=search();
					break;
				}
				case 9: 
				{
					System.out.println(" Code provided by hakerarenatutorials.wordpress.com ");
					System.exit(0);
				}
				default: System.out.println("Invalid Choice!");
			}
		}
	}
	public static Node createNode()
	{
		System.out.println("Enter value: ");
		int d=sc.nextInt();
		Node ptr=new Node(d);
		return ptr;
	}
	public static int getPosition(int x)
	{
		System.out.println("Enter position for "+x);
		int pos=sc.nextInt();
		return pos;
	}
	public static void insertAtBeg(Node ptr)
	{
		if(head==null)
		{
			head=ptr;
			System.out.println("Node inserted and list created!");				
		}
		else
		{
			Node tmp=head;
			head=ptr;
			head.next=tmp;
			System.out.println("Node inserted in list!");
		}
		Nodecount++;
	}
	public static void insertAtGivenPoint(Node ptr,int pos)
	{
		if(head==null)
		{
			head=ptr;
			System.out.println("Node inserted and list created!");				
		}
		else
		{
			Node tmp=head,tmp2=tmp;
			while(pos!=1)
			{
				tmp2=tmp;
				tmp=tmp.next;
				pos--;
			}
			tmp2.next=ptr;
			ptr.next=tmp;
		}
		System.out.println("Node inserted in list!");
		Nodecount++;
	}
	public static void insertAtEnd(Node ptr)
	{
		if(head==null)
		{
			head=ptr;
			System.out.println("Node inserted and list created!");				
		}
		else
		{
			Node tmp=head;
			while(tmp.next!=null)
			{	
				tmp=tmp.next;
			}
			tmp.next=ptr;
			System.out.println("Node inserted!");
		}
		Nodecount++;
	}
	public static void deleteAtBeg()
	{
		if(head==null)
		{
			System.out.println("No list found!");				
		}
		else
		{
			Node tmp=head;
			head=head.next;
			tmp=null;
			Nodecount--;
			System.out.println("Node deleted!");
		}
	}
	public static void deleteAGivenValue(int count)
	{
		Node tmp=head,tmp2=tmp,tmp3=tmp2;
		while(count!=0)
		{
			tmp3=tmp2;
			tmp2=tmp;
			tmp=tmp.next;
			count--;
		}
		tmp3.next=tmp2.next;;
		tmp2=null;
		System.out.println("Node deleted!");
		Nodecount--;
	}
	public static void deleteAtEnd()
	{ 
		if(head==null)
		{
			System.out.println("No list found!");				
		}
		else
		{
			Node tmp=head,tmp2=tmp;
			while(tmp.next!=null)
			{	
				tmp2=tmp;
				tmp=tmp.next;
			}
			if(tmp==head)
			{
				head=null;
			}
			tmp2.next=null;
			tmp=null;
			Nodecount--;
			System.out.println("Node deleted!");
		}
	}
	public static void show()
	{
		if(head==null)
			System.out.println("No list found!");
		else
		{
			Node tmp=head;
			while(tmp!=null)
			{
				System.out.println(tmp.data);
				tmp=tmp.next;
			}
		}
	}
	public static int search()
	{
		System.out.println("Enter value: ");
		int val=sc.nextInt(),count=1;
		Node tmp=head;
		while(tmp!=null)
		{
			if(val==tmp.data)
			{
				System.out.println(val+" found at "+count);
				break;
			}
			else
			{
				tmp=tmp.next;
				count++;
			}
		}	
		if(tmp==null)
		{
			System.out.println(val+" wasn't found!");
			count=-1;
		}
		return count;
	}
}
