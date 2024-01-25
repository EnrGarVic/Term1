package FlowControl;

import java.util.Scanner;

public class Task5_16 {

	public static void main(String[] args) {
		/*Write a program to work as a calculator. 
		 * The possible calculations would be like: num1 operator num2, 
		 * where num1 and num2 are to real numbers and the operator one of the following:  +, -, *, /.
		 *  The program will ask the user the first operand num1, 
		 *  then the operator and finally the second operand num2.
		 *   (use the division by 0)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("tell me a number");
		double num1= sc.nextDouble(); sc.nextLine();
		
		System.out.println("tell me a operator");
		char operator= sc.next().charAt(0);
		
		System.out.println("tell me a number");
		double num2= sc.nextDouble(); sc.nextLine();
		
		double res;
		
		switch(operator) {
		case '+':
			res=num1 + num2;
			System.out.println("the result of + is: " + res);
			break;
		case '-':
			res=num1-num2;
			System.out.println("the result of - is: " + res);
			break;
		case '*':
			res=num1 * num2;
			System.out.println("the result of x is: " + res);
			break;
		case '/': 
			if(num2== 0) {
				System.out.println("you cant divided by 0");
			}else {
				res=num1/num2;
				System.out.println("the result of / is: " + res);
			
			}
		 default: System.out.println("Not a well operator");
				
			break;
		
		}
		sc.close();
	}

}
