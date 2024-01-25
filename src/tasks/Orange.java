package tasks;

import java.util.Scanner;



public class Orange {

	public static void main(String[] args) {
		/* Write a program that, given a String, it says 
		the position of the word orange in the whole text. (use indexOf)*/
		
		Scanner sc= new Scanner(System.in);
				
		System.out.println("tell me a text with the orange word");
		
		String sentence= sc.nextLine();
		
		int word= sentence.indexOf("orange");
		
		System.out.println("the position of the orange is "+ word );
		
	
	

		sc.close();
		

	}
}
