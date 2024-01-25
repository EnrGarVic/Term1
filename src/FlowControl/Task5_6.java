package FlowControl;

import java.util.Scanner;

public class Task5_6 {

	public static void main(String[] args) {
		/*    6. Write a multiway if-else statement that classifies 
		 * the value of an int variable n into one of the following 
		 * categories and writes out an appropriate message: 
		 */
			//n < 0 or 0 ≤ n < 100 or n ≥ 100
		
		Scanner sc= new Scanner(System.in);
		System.out.println("write the n value");
		
		int value= sc.nextInt();
		
		if (value <0) {
			System.out.println("n low than 0");
			
		}else if (0 <= value || value < 100) {
			System.out.println("n is high or equals to 0 and n low than 100");

		}else {
			System.out.println("n is equals or high than 100");
		}
		sc.close();

	}

}
