package datastructures;

import java.util.Scanner;

public class LinkedList {
	public class Node{
		int data;
		Node link;
	}
	private Node first;
	private Scanner scan=new Scanner(System.in);

	public void insertRear()
	{
		Node temp;
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.link=null;
		if(first==null)
		{
			first=newnode;
		}
		temp=first;
		while(temp.link!=null)
		{
			temp=temp.link;
			temp.link=newnode;
		}	
	}
	public void DeleteRear()
	{
		
		if(first==null)
		{
			System.out.println("Deletion not Possible");
		}
		else if(first.link==null)
		{
			System.out.println("Elem deleted is"+first.data);
			first=null;
		}
		
		else 
		{ 
		
		 Node temp = first;
		 {
			 while (temp.link.link!=null)
			 {
				 temp=temp.link;
			 }
			 System.out.println("Elemented Deleted is"+temp.link.data);
			 temp.link=null;
		 }
			
		}
	}
	public void insertFront()
	{
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.link=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			newnode.link=first;
			first=newnode;
		}
	}
	public void deletefront()
	{
		if(first==null)
		{
			System.out.println("Dletion not first");
		}
		else if(first.link==null)
		{
			System.out.println("The deleted elem is"+first.data);
			first=null;
		}
		else
		{
			System.out.println("Element deleted is"+first.data);
			first=first.link;
		}
	}
	public void display()
	{
		Node temp;
		if(first==null)
		{
			System.out.println("Display not possible");
		}
		else if(first.link==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.link;
			}
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=scan.nextInt();
		LinkedList ll=new LinkedList();
		{
			while(true)
			{
				System.out.println("Press 1------>InsertRear");
				System.out.println("Press 2 ------>DeleteRear");
				System.out.println("Press 3 ------>insertFront");
				System.out.println("Press 4 ------>deleteFront");
				System.out.println("Press 5 ------>displayrear");
				int choice =scan.nextInt();
				switch(choice)
				{
				case 1:ll.insertRear();
				break;
				case 2:ll.DeleteRear();
				break;
				case 3:ll.insertFront();
				break;
				case 4:ll.deletefront();
				break;
				default:System.exit(0);
				
				}
			}
		}
	}
}

