package looptask8;

import java.util.Scanner;

public class task8_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a integer (positive) number: ");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		int res= 0;
		for (int i = 2; i <= num; i++) {

			res=a+b;
			a=b;
			b=res;

		}
		System.out.println("the "+num + " in Fibonacci serie is: "+res);
		sc.close();
	}

}
