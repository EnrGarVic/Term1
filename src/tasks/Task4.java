package tasks;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*    1. Create a program that asks your name and then shows the number of characters 
		 * in the sentence resulting of concatenating “Hello “ and your name.
            CLUE: use the length method of the String class	*/
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("whats you name?");
		

		String name= sc.nextLine();
		
		String greetings= "hello " + name;
		
		System.out.println(greetings);
	
		

		
		System.out.println("lenght is " + greetings.length());
		sc.close();
	}

}
