package week4;

import java.util.Scanner;

public class switchScanner {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the day of the week: ");
		int dayNumber = reader.nextInt();
		int dayNyumber;
		
		switch(dayNumber) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day");
			
		}
			
	}
		
}


