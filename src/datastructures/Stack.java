package datastructures;

import java.util.Scanner;

public class Stack {
	private int s[];
	private int size;
	private int top=-1;
	private Scanner scan=new Scanner(System.in);
	public Stack(int n)
	{
		s=new int[n];
		size=s.length;
	}
	public void push()
	{
		int elem;
		if(top==size-1)
		{
			System.out.println("Push not possible");
			
		}
		else
		{
			System.out.println("Enter an element");
			elem=scan.nextInt();
			++top;
			s[top]=elem;
		}
	}
	public void pop()
	{
		if(top==-1)
		{
			System.out.println("pop not possible");
		}
		else
		{
			System.out.println("element deleted is "+s[top]);
			--top;
		}
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("display not possible");
			
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(s[i]);
			}
		}
	}
	

}
