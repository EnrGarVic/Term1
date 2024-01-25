package loopstask7;

import java.util.Scanner;

public class task7_4 {

	public static void main(String[] args) {
		// Write a program that reads an integer Z  and calculates and displays on the screen Zz  without using the power operator.
		Scanner sc=new Scanner(System.in);
		double acum=1;
		double z=0;
		System.out.println("tell me a integer number " );
		z= sc.nextInt();
		for(double i=1; i<=z; i++) {
			acum*=z;
		}
		System.out.println(acum);
		sc.close();
	}

}
