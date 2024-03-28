package datastructures;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=scan.nextInt();
		CircularQueue CQ=new CircularQueue (n);
		while(true)
		{
			System.out.println("Press 1---->Insert");
			System.out.println("Press 2---->Delete");
			System.out.println("Press 3---->Display");
			System.out.println("Press any---->stop");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:CQ.insert();
			break;
			case 2:CQ.delete();
			break;
			case 3:CQ.display();
			break;
			default:System.exit(0);
			
		}
		}

	}

}
