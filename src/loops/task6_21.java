package loops;

import java.util.Scanner;

public class task6_21 {

	public static void main(String[] args) {
		// Write a program that reads a series of 10 positive numbers and calculate the greatest.
		Scanner sc=new Scanner(System.in);
		int max= Integer.MIN_VALUE;
		int num=0;


		for(int i=0; i<=5; i++) {
			System.out.println("write 10 numbers");
			num= sc.nextInt();
			if (num > max) {
				max=num;
			}

		}
		System.out.println("the greatest is: "+max);
		sc.close();
	}


}
