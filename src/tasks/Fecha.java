package tasks;

import java.util.Scanner;

public class Fecha {

	public static void main(String[] args) {
		/*    3. Write a program that asks a date (in format dd/mm/yyyy) 
		 and keeps it in a String variable called date1. Then show the day on the console.(extra the month and year)
		 
		 Consider that the day is made up of the two first characters (=digits in this case) (use substrings)*/
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Give me a Date in format dd/mm/yyyy");
		
		
		String date1= sc.nextLine();
		
		
		System.out.println("the day is: "+ date1.substring(0, 2));
		
		System.out.println("the month is: "+date1.subSequence(3, 5));
		
		System.out.println("the year is: "+date1.subSequence(6, 10));
		
		sc.close();

	}

}
