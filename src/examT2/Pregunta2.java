package examT2;

import java.util.Random;
import java.util.Scanner;

public class Pregunta2 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc= new Scanner(System.in);
		int nDice=0;
		int mScore;
		int sum=0;

		System.out.println("how many dice you want to roll?");
		nDice= sc.nextInt();
		System.out.println("and whats the maxium score? ");
		mScore= sc.nextInt();


		for (int i = 0; i <nDice; i++) { 
			int dice= r.nextInt(6)+1;

			sum+=dice;
			System.out.print(dice + "\t");

		}
		System.out.println(sum);
		if(sum <= mScore)
			System.out.println( "you win" );
		else {
			System.out.println("you lose");
		}
		sc.close();
	}

}
