package datastructures;

import java.util.Scanner;

public class DoublyLinkedList {
	public class Node
	{
		Node prelink;
		int data;
		Node nextlink;
		
	}
	private Node first;
	private Scanner scan=new Scanner(System.in);
	public void insertfront()
	{
		
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.prelink=null;
		newnode.nextlink=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			newnode.nextlink=first;
			first.prelink=newnode;
			first=newnode;
		}
		
		
	}
	public void insertrear()
	{
		Node temp;
		System.out.println("Enter an element");
		int elem=scan.nextInt();
		Node newnode=new Node();
		newnode.data=elem;
		newnode.prelink=null;
		newnode.nextlink=null;
		if(first==null)
		{
			first=newnode;
		}
		else
		{
			temp=first;
			while(temp.nextlink!=null)
			{
				temp=temp.nextlink;
			}
			temp.nextlink=newnode;
			newnode.prelink=temp;
			
	}
		
		
	}
	public void deletefront() {
		if(first==null)
		{
			System.out.println("Delete not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println("Element deleted is"+first.data);
			first=null;
		}
		else
		{
			first=first.nextlink;
			first.prelink=null;
		}
	}
	public void deleterear()
	{
		Node temp;
		if(first==null)
		{
			System.out.println("Delete is not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println("Element deleted is"+first.data);
			first=null;
		}
		else
		{
			temp=first;
			while(temp.nextlink.nextlink!=null)
			{
				temp=temp.nextlink;
			}
			System.out.println("Element deleted is"+temp.nextlink.data);
		}
	}
	public void display()
	{
		Node temp;
		if(first==null)
		{
			System.out.println("display not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.nextlink;
			}
		}
		System.out.println();
	}
	public void reversedisplay()
	{

		Node temp;
		if(first==null)
		{
			System.out.println("display not possible");
		}
		else if(first.nextlink==null)
		{
			System.out.println(first.data);
		}
		else
		{
			temp=first;
			while(temp.nextlink!=null)
			{
				temp=temp.nextlink;
			}
			while(temp!=null)
			{
				System.out.println(temp.data+" ");
				temp=temp.prelink;
			}
			System.out.println();
		}
		
		
	}
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=scan.nextInt();
		DoublyLinkedList dd=new DoublyLinkedList();
		{
			while(true)
			{
				System.out.println("Press 1------>Insertfront");
				System.out.println("Press 2 ------>InsertRear");
				System.out.println("Press 3 ------>deletefront");
				System.out.println("Press 4 ------>deleterear");
				System.out.println("Press 5 ------>displayforward");
				System.out.println("Press 6 ------>displayreverse");
				int choice =scan.nextInt();
				switch(choice)
				{
				case 1:dd.insertfront();
				break;
				case 2:dd.insertrear();
				break;
				case 3:dd.deletefront();
				break;
				case 4:dd.deleterear();
				break;
				case 5:dd.display();
				break;
				case 6:dd.reversedisplay();
				break;
				default:System.exit(0);
				
				}
		
	}

}
	}
}
