package tasks;

import java.util.Scanner;

public class IntercambioVariables {

	public static void main(String[] args) {
		// Given two integer variables a and b, write a program to exchange their value.

		Scanner sc= new Scanner(System.in);

		System.out.println("Tell me integrer number a ");
		int a, b;

		a= sc.nextInt();

		System.out.println("Tell me integrer number b ");

		b= sc.nextInt();


		int aux =b;

		b=a;

		a=aux;



		System.out.println("a:" + a);
		System.out.println("b:" + b);







		sc.close();
		

	}

}
