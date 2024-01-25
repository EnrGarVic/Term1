package loopstask7;

import java.util.Scanner;

public class task7_7 {

	public static void main(String[] args) {
		/*Program that computes and prints on the screen the following series: 10 * 15 * 20 * 25 * ... * 45.
(mostrar tira de multiplicaciones y total.)*/

		Scanner sc=new Scanner(System.in);
		int mult=1;
		for( int i=10; i<=45; i= i+5) {

			if(i==45) {
				System.out.print(i+"= ");
			}else {
				System.out.print(i+"*"); 

			}
			mult*=i;	
		}
		System.out.println(mult);
		sc.close();
	}

}
