package FlowControl;

import java.util.Scanner;

public class Task5_1 {

	public static void main(String[] args) {
		/*Write a program that reads a character from the keyboard 
		 * and says if the character is a valid operator (+, -, *, /, %) or not.
		 */
		Scanner sc= new Scanner(System.in);

		System.out.println("write a character");
		char operator;
		operator= sc.nextLine().charAt(0);
		if( operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
			System.out.println("is a valid operator");

		}else {
			System.out.println("is a invalid operator");
		}

		sc.close();
	}

}
