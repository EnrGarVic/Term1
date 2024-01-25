package tasks;

import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		// Write a program that asks the mark of the three assessments of a student and calculates his average.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Tell me the 3 maks:");
		
		double mark1, mark2, mark3;
		
		mark1= sc.nextDouble();
		mark2= sc.nextDouble();
		mark3= sc.nextDouble();
		
		
		
		double avarage=(mark1+mark2+mark3)/3;
		
		System.out.println("your assessments avarage is: " + avarage);
		
	
		sc.close();
	}

}
