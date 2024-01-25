package loopstask7;

import java.util.Scanner;

public class task7_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		do {
			System.out.print("Enter a positive number: ");
			num = sc.nextInt();
		} while(num<0);
		
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				System.out.println(i);
			}
			
		}
		sc.close();
	}

}
