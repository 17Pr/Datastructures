package datastructures;

import java.util.Scanner;

public class Queue {
	
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	private Scanner scan=new Scanner(System.in);
	public Queue(int n)
	{
		
		q=new int[n];	
		size =q.length;
	}
public void insert()
{
	int elem;
	if(r==size-1)
	{
		System.out.println("insertion not possible");
	}
	else
		
	{
		System.out.println("Enter the element to be inserted");
		elem=scan.nextInt();
		++r;
		q[r]=elem;
	}
}
public void delete()
{
	if(r==-1||f>r)
	{
		System.out.println("Deletion not possible");
	}
	else
	{
		System.out.println("The element deleted is "+q[r]);
		++f;
	}
}
public void display()
{
	if(r==-1||f>r)
	{
		System.out.println("Display not possible");
	}
	else
	{
		for(int i=f;i<=r;i++)
		{
			System.out.println(q[r]+" ");
		}
		System.out.println();
	}
}

	

}
