package loops;

public class task6_11 {

	public static void main(String[] args) {
		// 11. Write a program to calculate the sum of the odd numbers between 1 and 10.
		int sum=0;
		for(int i=1; i<=10; i=i+2) {

			sum+=i;
		}
		System.out.println(sum);
	}

}
