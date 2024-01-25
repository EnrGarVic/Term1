package FlowControl;

import java.util.Scanner;

public class Task5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("tell me a number of month");

		int month= sc.nextInt();

		System.out.println("its a leap year?(true/false)");

		boolean leap= sc.nextBoolean();

		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("the month have 31 days");
			break;
		case 2:

			if(leap == true) {
				System.out.println("the month have 29 days");

			}else {
				System.out.println("the month have 28 days");
				
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("the month have 30 days");
			break;
		default:
			System.out.println("Wrong Month");
		}
		sc.close();
	}

}
