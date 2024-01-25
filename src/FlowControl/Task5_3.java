package FlowControl;

import java.util.Scanner;

public class Task5_3 {

	public static void main(String[] args) {
		/*Suppose number is a variable of type int. Write an if-else statement that 
		 * outputs the word "Positive" if the value of the variable number 
		 * is greater than 0 and outputs the words "Not positive" if the value of number 
		 * is less than or equal to 0. 
		 */
		Scanner sc= new Scanner(System.in);
		
	int num;
	
	System.out.println("whats your number?");
	
	num= sc.nextInt();
	
	if (num >0) {
		System.out.println("Positive");
		
	}else {
		System.out.println("not positive");
	}
	sc.close();
	}

}
