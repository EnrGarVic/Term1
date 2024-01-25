package loops;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		int sum=0;
		int num=1;
		System.out.println("type numbers. To finish, type 0: ");

		while (num!=0) {
			 num =sc.nextInt(); sc.hasNextLine();
			sum+=num;
				
				
		
		}
		System.out.println("sum up of all your numbers is: "+sum);
		sc.close();
	}

}
