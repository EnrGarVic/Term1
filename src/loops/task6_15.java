package loops;

import java.util.Scanner;

public class task6_15 {

	public static void main(String[] args) {
//Write a program to calculate the sum of 10 numbers entered by the user.
		Scanner sc=new Scanner(System.in);
		int num;
		int sum=0;
		for(int i=1; i<=10; i++) {
			System.out.println("tell me a number "+ i );
			
		  num= sc.nextInt();
		  sum+=num;
		
		}
		System.out.println(sum);
		sc.close();
	}

}
