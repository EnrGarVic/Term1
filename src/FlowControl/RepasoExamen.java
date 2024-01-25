package FlowControl;

import java.util.Scanner;

public class RepasoExamen {

	public static void main(String[] args) {
		/*Write a Java program that classifies your mark (decimal number) 
		 * into the different options of the Spanish educational system as you can see 
		 * in the following table:
		 */
/*
[0,5[ 	Insuficiente
[5,6[ 	Suficiente
[6,7[ 	Bien
[7,9[ 	Notable
[9,10] 	Sobresaliente*/

		java.util.Scanner sc= new Scanner(System.in);
		
		System.out.println("Tell me yor mark (1-10 with decimal)");
		
		double mark= sc.nextDouble();
			
		if (mark == 0 || mark <5) {
			System.out.println("insuficiente");
		}else if (mark ==5 || mark<6) {
			System.out.println("suficiente");
		}else if (mark ==6 || mark<7) {
			System.out.println("bien");
		}else if (mark ==7 || mark<9) {
			System.out.println("notable");
		}else if( mark <=10) {
			System.out.println("sobresaliente");
		}else {
			System.out.println("invalid");
		}
		sc.close();
		}
		


	}


