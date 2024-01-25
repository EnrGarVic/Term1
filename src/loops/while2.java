package loops;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int num=1;
		int cont=1;
		System.out.println("type 10 numbers ");

		while (cont<=10) {
			 num =sc.nextInt(); sc.hasNextLine();
			 sum+=num;
			 cont++;
				
		
		}
		System.out.println("sum up of all your numbers is: "+sum);
		sc.close();
	}

}
