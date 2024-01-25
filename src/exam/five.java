package exam;

import java.util.Scanner;

public class five {

	public static void main(String[] args) {
/*Write a program in Java that  inputs two names, 
 * and it displays the text “Amazing!! You have exactly the same name!!”,
 *  if they are equal (ignoring cases)		
 */
		Scanner sc= new Scanner(System.in);
		System.out.println("tell me two names");

		String name1= sc.nextLine();
		String name2= sc.nextLine();

		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("Amazing!!You have exactly the same name!!");
		}

		sc.close();
		
	  }

}
