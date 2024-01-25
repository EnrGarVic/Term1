package FlowControl;

import java.util.Scanner;

public class Task5_4 {

	public static void main(String[] args) {
		/*Write a program that asks a decimal value, x. 
		 * Then, it writes the value of the function 
		 * f(x) = 1/(x2-1). For the values of x where the function is not defined,
		 *  you have to write a warning on the Console.
		 */
Scanner sc= new Scanner(System.in);
System.out.println("tell me a decimal value");
double num= sc.nextDouble();

if (num == 1 || num == -1) {
	System.out.println("The function is not defined in 1 and -1");
	
}else {
	double op= 1/(num*num-1);
	System.out.println("the result is "+ op);
}
sc.close();
	}

}
