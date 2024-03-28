package datastructures;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the stack size");
		int n=scan.nextInt();
		Stack stack=new Stack(n);
		while(true)
		{
			System.out.println("Press 1---->push");
			System.out.println("Press 2---->pop");
			System.out.println("Press 3---->display");
			System.out.println("Press any---->stop");
			System.out.println("Enter your choice ");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:stack.push();
			break;
			case 2:stack.pop();
			break;
			case 3:stack.display();
			break;
			default:System.exit(0);
			}
		}
		

	}

}
