package FlowControl;

import java.util.Scanner;

public class Task5_13 {

	public static void main(String[] args) {
		/*Write an if-else statement that outputs the word “Emergency” 
		 * provided the value of the variable pressure is greater than 100 or the value of the variable 
		 * temperature is greater than or equal to 212. Otherwise, the if-else statement should output 
		 * the word “OK“. The variables pressure and temperature are both of type int. 
		 */
				Scanner sc=new Scanner(System.in);
				
			System.out.println("whats the pressure number?");
				
				int pressure= sc.nextInt();
				 
			System.out.println("whats the temerature number?");
				
				int temperature= sc.nextInt();
				
				if(pressure>100 || temperature >= 212) {
					
			System.out.println("emergency");
					
				}else {
				
			System.out.println("ok");
					
				}
					
				sc.close();
				
	}

}
