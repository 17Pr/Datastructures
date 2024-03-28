package datastructures;

import java.util.Scanner;

public class Array {
	private int arr[];
	private Scanner scan =new Scanner(System.in);
	public Array(int n)
	{
		arr=new int[n];
	}
	public void insert()
	{
		System.out.println("Enter the postion where you want to insert"+(arr.length-1));
		int pos=scan.nextInt();
		System.out.println("Enter the element that you want to insert");
		int elem =scan.nextInt();
		arr[pos]=elem;
	}
	public void delete()
	{
		System.out.println("Enter the position to delete");
		int pos=scan.nextInt();
		System.out.println("The deleted element is"+arr[pos]);
		arr[pos]=0;
	}
	public void display()
	{
		for(int i=0;i<arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}

}
