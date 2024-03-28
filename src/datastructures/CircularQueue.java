package datastructures;

import java.util.Scanner;

public class CircularQueue {
	// overcome the issue of queue circular queue is used
	//in queue you can't utilize the empty space again unlike in circular queue
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
	private Scanner scan=new Scanner(System.in);
	public CircularQueue(int n)
	{
		cq=new int[n];
		size=cq.length;
	}
	public void insert()
	{
		if(count==size)
		{
			System.out.println("Insertion not possible");
		}
		else
		{
			System.out.println("Enter an elememt");
			int elem=scan.nextInt();
			r=(r+1)%size;
			cq[r]=elem;
			count++;
		}
	}
	public void delete() {
		if(count==0)
		{
			System.out.println("deletion not possible");
		}
		else
		{
			System.out.println("The element deleted is"+cq[f]);
			f=(f+1)%size;
			count--;
		}
	}
	public void display()
	{
		int f1=f;
		if(count==0)
		{
			System.out.println("Not Possible");
		}
		else
		{
			for(int i=1;i<=count;i++)
			{
				System.out.println(cq[i]+" ");
				f1=(f1+1)%size;
			}
			System.out.println();
		}
		
	}

}
