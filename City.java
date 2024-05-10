
//Write a program to display the city obtained  according to your choice

import java.io.IOException;

public class City {

	public static void main(String[] args) throws IOException {
		char choice;
		System.out.println("Selected your City");
		
		System.out.println("P----> Pune");
		System.out.println("M----> Mumbai");
		System.out.println("N----> Nashik");
		System.out.println("");
		System.out.println("Your choice is : ");
		switch(choice=(char)System.in.read())
		{
			case 'P':
			case 'p':
				System.out.println("You selected Pune");
				break;
			case 'M':
			case 'm':
				System.out.println("You selected Mumbai");
				break;
			case 'N':
			case 'n':
				System.out.println("You selected Nashik");
				break;	
			default:
				System.out.println("Wrong choice : Enter correct choice ");
		}
		
	}

}
