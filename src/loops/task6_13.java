package loops;

public class task6_13 {

	public static void main(String[] args) {
//  13. Write a program to calculate and display the sum and product of even numbers between 10 and 20 inclusive.
		int sum=0;
		int prod=1;
		for(int i=10; i<=20; i=i+2) {
			
			sum+=i;
			prod*=i;
		}
		System.out.println(sum);
		System.out.println(prod);
	}

}
