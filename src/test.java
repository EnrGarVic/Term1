import java.util.Random;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		int sum= 0;
		Random r= new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("What is the maximum score?");
		int maxnumber = sc.nextInt();
		System.out.println("How many dice do you want to roll?");
		int tries = sc.nextInt();
		
		for (int i= 0; i < tries; i++) {
			int dice= r.nextInt(6)+ 1;
			System.out.print(dice + "\t");
			sum += dice; 		
					
		}
		System.out.println(" ");
		System.out.println("Total punctuation:" + sum);
		if (sum > maxnumber) {
			System.out.println("	You win!!! the total punctuation is lower than your maximum (your prediction)");
		}
		else {
			System.out.println("you lose");
		}
		sc.close();
	}

}