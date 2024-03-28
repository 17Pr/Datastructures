package datastructures;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=scan.nextInt();
		Array a=new Array(n);
		while(true)
		{
			System.out.println("Press 1 to insert");
			System.out.println("Press 2 to delete");
			System.out.println("Press 3 to display");
			System.out.println("Press any key to exit ");
			System.out.println("Enter the choice ");
			int choice =scan.nextInt();
			switch(choice)
			{
			case 1:a.insert();
			break;
			case 2:a.delete();
			break;
			case 3:a.display();
			break;
			default:System.exit(0);
			
			}
		}

	}

}
