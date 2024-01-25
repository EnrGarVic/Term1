package tasks;

import java.util.Scanner;

public class task4b {

	public static void main(String[] args) {
		
		
		
	
		
		
		
	    Scanner sc= new Scanner(System.in);
		
		System.out.println("Put a text and a number");
		
		String text=sc.nextLine();
		int num=sc.nextInt();  sc.nextLine();
		
		System.out.println("Result: " + text.charAt(num - 1) );
		
		
		sc.close();
		
		
	
		
		

	}

}
