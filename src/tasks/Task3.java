package tasks;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that asks the user a value (integer data) in pesetas and calculates and displays on 
//		the screen the value in euros. note: 1 euro = 166.386 pesetas.

		Scanner sc=new Scanner(System.in);
		System.out.println("¿how mutch money you have in pesetas?");
		
		double pesetas =sc.nextDouble();
		
		final double RATE= 166.386;
		
		
		
		double euros= (pesetas/RATE);
		
		double roundoff=(int)(euros*100)/100.0;
		
		
		System.out.println("you have "+ roundoff +" euros");
		
		
	
		sc.close();

	}

}
