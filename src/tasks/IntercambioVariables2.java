package tasks;

import java.util.Scanner;

public class IntercambioVariables2 {

	public static void main(String[] args) {
	
		/*Given three integer variables a, b and c, 
		make a program to exchange their values so that: a 
		takes the value of b, b takes the value of c and c takes the value of a.*/

		Scanner sc= new Scanner(System.in);

		System.out.println("Tell me integrer number a ");
		int a, b, c;

		a= sc.nextInt();

		System.out.println("Tell me integrer number b ");

		b= sc.nextInt();
		
		System.out.println("Tell me integrer number c ");
		
		c= sc.nextInt();


		int aux =a;

		a=b;

		b=c;
		
		c=aux;
		

		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);

		sc.close();

	}

}





		
		




