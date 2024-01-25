package loopstask7;

import java.util.Scanner;

public class task7_6 {

	public static void main(String[] args) {
		// Program that calculates and prints out the numbers in the following series: 72, 69, 66, ..., 21.
		Scanner sc=new Scanner(System.in);
		int num=72;
		for( int i=num; i>=21; i= i-3) {
			if(i==21) {
				System.out.println(i+".");
			}else {
				System.out.print(i+","); 
			}
		}
		sc.close();
	}

}
