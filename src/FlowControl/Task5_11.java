package FlowControl;

import java.util.Scanner;

public class Task5_11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("writte a word");
		
		String nextWord= sc.nextLine();
		
		String half= "n";
		if(nextWord.compareToIgnoreCase(half)<0)
		System.out.println("First half of the alphabet");
		else {
		System.out.println("Second half of the alphabet");	
		}
		sc.close();
	}

}
