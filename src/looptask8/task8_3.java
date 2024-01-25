package looptask8;

import java.util.Scanner;

public class task8_3 {

	public static void main(String[] args) {
		/*Write a program that asks a positive integer 
  number and says that element in the previous series. an= 3*an+2 */
		Scanner sc = new Scanner(System.in);
		int num = 1;
		double an=0;
		System.out.print("Enter a integer (positive) number: ");
		num = sc.nextInt();
		for( int i=1; i<=num; i++) {
			an=3*an+2;

		}
		System.out.println(an);
		sc.close();
	}

}
