package exam;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
/*Write a Java program that prompts the user for the radius (cm) and the height (cm) 
 * of a cone and calculates and displays its volume (cm3).
 */
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Tell me the radius and the height of a cone (in cm)");
		
		double radius= sc.nextDouble(); sc.nextLine();
		double heigth= sc.nextDouble();
		
	    double volume= (1.0/3.0)*(Math.PI*radius*radius*heigth);
		
		if (volume < 0) {
			System.out.println("A cone needs a positive radius and a positive height");
		}else {
			System.out.println("the volume is: "+ volume);
		}
		sc.close();
	}
	
}
