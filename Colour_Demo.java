import java.util.Scanner;

// Write a program for using the switch statement to execute a particular  task depending on color value
 //To display a colour name depending on colour

public class Colour_Demo 
{

	public static void main(String[] args)
	{
		System.out.println("Enter color first letter");
		Scanner cl= new Scanner(System.in);
		String color=cl.next();
		switch (color) 
		{
		case "R": 
		{
			System.out.println("Red");
			break;
		}
		case "G": 
		{
			System.out.println("Green");
			break;
		}
		case "B":
		{
			System.out.println("Blue");
			break;
		}
		case "P": 
		{
			System.out.println("Pink");
			break;
		}
		
		case "W": 
		{
			System.out.println("White");
			break;
		}
		default:
			System.out.println("No color selected");
		

	}

 }
}