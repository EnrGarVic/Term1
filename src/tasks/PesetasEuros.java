package tasks;

import java.util.Scanner;

public class PesetasEuros {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("haw much money you have in euros?");
		
		double euros;
		
	     euros = sc.nextDouble(); sc.nextLine();
		
		double pesetas = (int)euros*166.386;
		
		System.out.println("you have in euros " + pesetas + " "+ "pesetas");
		sc.close();
	}

}
