 package FlowControl;

import java.util.Scanner;

public class Task5_2 {

	public static void main(String[] args) {
		/*Write an if-else statement that outputs the word "High" 
		 * if the value of the variable score is greater than 100 and outputs "Low" 
		 * if the value of score is at most 100. The variable score is of type int.  
		 */
				Scanner sc= new Scanner(System.in);
				int score;
				
				System.out.println("whats your value?");
				
				score= sc.nextInt();
				
				if (score >100) {
					System.out.println("Hight");
				}else {
					System.out.println("Low");
				}
				sc.close();
	}

}
