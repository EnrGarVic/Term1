package exam;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("tell me a operator");

		char operator= sc.nextLine().charAt(0);
		switch(operator) {
		case '+':

			System.out.println("Addition");
			break;
		case '-':

			System.out.println("Subtraction");
			break;
		case '*':

			System.out.println("Multiplication");
			break;
		case '/': 

			System.out.println("Division");
			break;
		case '%':
			System.out.println("modulus");
			break;
		default:
			System.out.println("Wrong operator");

			sc.close();
		}
	}
}
