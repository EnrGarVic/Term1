package loopstask7;

import java.util.Scanner;

public class task7_3 {

	public static void main(String[] args) {
		/*Write a program that computes the factorial of a number. 
		 * The factorial of a number is the result of multiplying 
		 * that number by all the positive integers that are smaller than it. */

		Scanner sc=new Scanner(System.in);
		long fact=1;
		long num=0;
		System.out.println("tell me a positive number " );
		num= sc.nextInt();
		for(long i=num; i>0; i--) {

			fact*=i;

		}

		System.out.println(fact);
		sc.close();
	}
}


