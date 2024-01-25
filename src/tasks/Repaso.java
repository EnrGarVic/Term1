package tasks;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		/*    1. Create a program that asks your name and then shows the number of characters 
		 * in the sentence resulting of concatenating “Hello “ and your name.
            CLUE: use the length method of the String class	*/
		Scanner sc= new Scanner(System.in);
		
		System.out.println("whats your name? ");
		
		String name = sc.nextLine();
		
		String hi= ("hello "+ name);
		
		System.out.println(hi.length());
		
	
		
		sc.close();

	
		
		
	}

}
