package loops;

import java.util.Scanner;

public class while4 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
		
		
		
		int sum=0;
		int num=1;
		boolean exit=false;
		System.out.println("type numbers. To finish, type 0: ");

		while (!exit) {
			 num =sc.nextInt(); sc.hasNextLine();
			sum+=num;
				if (num==0) {
					exit=true;
				}
				
		
		}
		System.out.println("sum up of all your numbers is: "+sum);
		sc.close();
	}

}
