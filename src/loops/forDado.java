package loops;

import java.util.Random;

public class forDado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TIMES=5;
		int sum=0;
		Random r= new Random();

		for(int i= 1;i<=TIMES;i++ ) {
			int num= r.nextInt(1, 7);
			System.out.println(num);

			sum+=num;
		}
		System.out.println("sum up of all your numbers is: "+ sum);

	}

}
