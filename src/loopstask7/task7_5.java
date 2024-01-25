package loopstask7;

import java.util.Scanner;

public class task7_5 {

	public static void main(String[] args) {
		// Write a program that sums all integers from the number read by keyboard until 1.
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int num=0;
		int i;
		System.out.println("tell me a integer number " );
		num= sc.nextInt();
		for( i=num; i>=1; i--) {

			sum+=i;
			sc.close();
		}
		System.out.println(sum);
		
	}

}
