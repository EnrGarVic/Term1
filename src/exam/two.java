package exam;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
/*     2. Write a Java program that inputs an age and prints 
 * “you can work” if the age is between (16 and 65, both inclusive), 
 * “you are too young to work” if you are younger than 16 and “you are to old to work” 
 * if you are older than 65
 */
		Scanner sc= new Scanner(System.in);
		System.out.println("whats your age?");
		
		int age= sc.nextInt();
		
		if (age >=16 && age<=65) {
			System.out.println("you can work");
		}else if (age < 16) {
			System.out.println("you are too young to work");
			
			
		}else {
			System.out.println("you are to old to work");
		}
				
		sc.close();
		}

	}


