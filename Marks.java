

//Write a program to display the class  obtained  according to marks obtained by student.

import java.util.Scanner;
public class Marks
{
	public static void main(String[] args)
	{
		System.out.println("Enter valid marks out of 100 : ");
	
		Scanner ms =new Scanner(System.in);
		int marks= ms.nextInt();
	
				switch (marks/10)
			{
				case 10:
				case 9:
				case 8:
				{
					System.out.println("Excellent");
					break;
				}
				case 7:
				{
					System.out.println("Very good");
					break;
				}
				case 6:
				{
					System.out.println("Good");
					break;
				}
				case 5:
				{
					System.out.println("Work hard");
					break;
				}
				case 4:
				{
					System.out.println("Poor");
					break;
				}
				case 3:
				case 2:
				case 1:
				case 0:
				{
					System.out.println("Very poor");
					break;
				}
				default:
					System.out.println("Enter valid marks out of 100");
		   	}
				

	}

}
