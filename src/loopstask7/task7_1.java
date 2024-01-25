package loopstask7;

import java.util.Scanner;

public class task7_1 {

	public static void main(String[] args) {
		// Write a program that shows the multiplication table of a number read by keyboard.
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("tell me a number ");
		num =sc.nextInt();
		System.out.println("---the multiplication table of a number is: ---");


		for(int i=0; i<=10; i++) {

			System.out.println(num + "x" + i + "=" + i*num);
		}

		sc.close();
	}

}
