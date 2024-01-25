package extrasLoops;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		int num=1;
		int num2=1;
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


