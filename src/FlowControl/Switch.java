package FlowControl;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("today is?");
		int day= sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("thuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thuesday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("wrong number of day");
		}
		sc.close();
	}

}
