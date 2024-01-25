package looptask8;

import java.util.Scanner;

public class task8_1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean isPrime = true;
		boolean numPrime = true;
		int i=2;
		
		System.out.print("Enter a integer (positive) number: ");
		num = sc.nextInt();

		while (i<num && isPrime) {
			if(num%i==0) {
				isPrime=false;

			}			 
			i++;
			for(int j=1; j<=num; j++) {
				int k=2;
				
				while (k<j) {
					if(num%i==0) {
						numPrime=false;
						
					}
					k++;
				}  
				if(numPrime) {
					System.out.println(j);
				}
			}
			if(isPrime) {
				System.out.println(num+" is prime");
			}else {
				System.out.println(num+" not prime");
			}
		}
		sc.close();
	}
}



