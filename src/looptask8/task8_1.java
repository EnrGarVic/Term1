package looptask8;

import java.util.Scanner;

public class task8_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		boolean isPrime = true;
		do {
			System.out.print("Enter a integer (positive) number: ");
			num = sc.nextInt();
		} while (num < 0);

		for (int i = 2; i < num ; i++) {
			if(num%i==0) {
				isPrime=false;
			}
		
	}
		if (isPrime) {
			System.out.println(num + " is prime");
		

		} else  {
			System.out.println(num + " no prime");
		}
		sc.close();
		}
}
