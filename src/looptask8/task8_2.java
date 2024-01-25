package looptask8;

import java.util.Scanner;

public class task8_2 {

	public static void main(String[] args) {
//Write a program that asks for a fraction (numerator and denominator) and simplifies it.
		int num=0;
		int num2=0;
		int i=2;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter two numbers: ");
		num = sc.nextInt();
		num2 = sc.nextInt();
		
		while(i<=num && i<=num2) { //(i<=Math.min(num1,num2))
			while(num%i==0 && num2%i==0) {
				num=num/i;
				num2=num2/i;
		
			}
			i++;
			
		}
		System.out.println(num+"/"+ num2);	
		sc.close();
	}

}
