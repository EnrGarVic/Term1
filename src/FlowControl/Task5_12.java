package FlowControl;

import java.util.Scanner;

public class Task5_12 {

	public static void main(String[] args) {
		/*Write an if-else statement that outputs the word “Passed” 
		 * provided the value of the variable exam is greater than or equal to 60 
		 * and also the valueof the variable programsDone is greater than or equal to 10.
		 *  Otherwise, the if-else statement should output the word “Failed“.
		 *   The variables exam and programsDone are both of type int.  
		 */
		Scanner sc= new Scanner (System.in);
		System.out.println("write your exam value (0-100)");

		int value= sc.nextInt();

		System.out.println("number of rograms done");
		
		int programsDone= sc.nextInt();
		
		if(value>=60 && programsDone >=10)
		System.out.println("passed");
		else {
			System.out.println("failed");
		}

		sc.close();

	}



}
