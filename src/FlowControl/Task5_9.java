package FlowControl;

import java.util.Scanner;

public class Task5_9 {

	public static void main(String[] args) {
	/*Write a program that asks two integer values (n1 and n2) 
	 * and then says if the n1 is greater than or equal n2 or not.
	 */
		Scanner sc= new Scanner(System.in);
		System.out.println("write two numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		if(num1 >= num2) {
			System.out.println("the number 1 is greater or equal than 2");
		}else {
			System.out.println("Not greater or equal");
		}
		sc.close();
	}
}
