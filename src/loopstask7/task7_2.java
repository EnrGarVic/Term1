package loopstask7;

import java.util.Scanner;

public class task7_2 {

	public static void main(String[] args) {
		/* Modify the program of the multiplication table so that at the bottom displays 
		on screen the sum of all the results of the multiplication table*/
		Scanner sc=new Scanner(System.in);
		int num=0;
		int sum=0;
		System.out.println("tell me a number ");
		num =sc.nextInt();
		System.out.println("---the multiplication table of a number is: ---");


		for(int i=0; i<=10; i++) {
			sum+=i*num;

			System.out.println(num + "x" + i + "=" + i*num);

		}		
		System.out.println("the sum is :" + (sum));
		sc.close();
	}

}
